package net.hzjxy.myshop.action.backstage.user;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;

import net.hzjxy.myshop.action.backstage.utils.MD5Code;
import net.hzjxy.myshop.action.backstage.utils.enums.UserEnum;
import net.hzjxy.myshop.action.backstage.utils.statickey.StaticKey;
import net.hzjxy.myshop.entity.UserT;
import net.hzjxy.myshop.service.UserTService;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;
import java.util.Locale;

/**
 * Created by 磊 on 2014/11/30.
 */
@Namespace("/bk/user")
@ParentPackage("myshop")
public class UserTAction extends BaseTAction {
    private UserTService userTService;

    private String username;
    private String password;
    private String param;

    public UserTService getUserTService() {
        return userTService;
    }

    public void setUserTService(UserTService userTService) {
        this.userTService = userTService;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    /**
     * 清空Struts 2的错误信息
     */
    @Override
    public void validate() {
        this.clearErrorsAndMessages();
    }
    /**
     * 管理员登陆
     * @return
     * @throws Exception
     */
    @Action(value = "/adminLogin", results = { @Result(name = "success", type = "redirect", location = "/admin/index.jsp?session=${param}"), @Result(name = "input", type = "redirect", location = "/admin/login.jsp?msg=${param}") })
    public String adminLogin() throws Exception {
        if(StringUtils.isBlank(this.getUsername())){
            this.setParam(StaticKey.ONE);
            return INPUT;
        }
        if(StringUtils.isBlank(this.getPassword())){
            this.setParam(StaticKey.ONE);
            return INPUT;
        }
        MD5Code md5 = new MD5Code();
        UserT user = new UserT();
        user.setUsername(this.getUsername().toLowerCase(Locale.CHINA).trim());
        user.setPassword(md5.getMD5ofStr(password));
        user.setUserState(UserEnum.UserState.ACTIVE.getState());
        user = this.getUserTService().login(user);
        if (user != null) {
            //doSysIndexInit(user,md5);
            return SUCCESS;
        }
        this.setParam(StaticKey.ONE);
        return INPUT;
    }

    /**
     * 验证是否登录
     * @return
     */
    @Action(value = "/checkLogin",results = {@Result(name = "json",type = "json",params = {"includeProperties","slogin"})})
    public String checkLogin(){
        return "json";
    }

    /**
     * 验证权限
     * @return
     */
    @Action(value = "/checkAuthorityException", results = { @Result(name = "json", type = "json", params = { "includeProperties", "sauthority" }) })
    public String checkAuthorityException(){
        return "json";
    }

    /**
     * 进行用户登录系统首页数据初始化及用户权限相关初始化
     * @param userT
     * @param md5
     */
    private void doSysIndexInit(UserT userT,MD5Code md5){

    }

    /**
     * 查询所有用户
     * @return
     */
    @Action(value = "/findAllUserT", results = { @Result(name = "json", type = "json") })
    public String findAllUserT() {
        findDefaultAllUserT();
        return "json";
    }

    /**
     * 查找默认的所有用户
     */
    private void findDefaultAllUserT(){

    }

    /**
     * 处理用户列表
     * @param list
     */
    private void processUserList(List<UserT> list){

    }

    /**
     * 管理员增加用户
     * @return
     */
    @Action(value = "/saveUserT", results = { @Result(name = "json", type = "json") })
    public String saveUserT() {
        return "json";
    }

    /**
     * 更新系统用户
     * @return
     */
    @Action(value = "/updateUserT", results = { @Result(name = "json", type = "json") })
    public String updateUserT(){
        return "json";
    }

    /**
     * 根据用户Id获取用户信息
     * @return
     */
    @Action(value = "/findUserById", results = { @Result(name = "json", type = "json") })
    public String findUserById(){
        return "json";
    }

    /**
     * 管理员更新用户信息，不包含密码等安全信息
     * @return
     */
    @Action(value = "/UpdateUserTunpwd", results = { @Result(name = "json", type = "json") })
    public String UpdateUserTunpwd() {
        return "json";
    }

    /**
     * 管理员批量删除用户
     * @return
     */
    @Action(value = "/DelUserT", results = { @Result(name = "json", type = "json") })
    public String DelUserT() {
        return "json";
    }

    /**
     * 更改管理员密码
     * @return
     */
    @Action(value = "/UpdateUserMember", results = { @Result(name = "json", type = "json") })
    public String UpdateUserMember() {
        checkUser();
        return "json";
    }

    /**
     * 修改管理员密码，判断数据库是否存在
     * @return
     */
    private boolean checkUser(){
        this.checkLogin();


        return true;
    }

    /**
     * 更新管理员状态
     * @return
     */
    @Action(value = "/updateUserByUserState", results = { @Result(name = "json", type = "json") })
    public String updateUserByUserState() {
        return "json";
    }

    /**
     * 更新管理员权限标记
     * @return
     */
    @Action(value = "/updateUserRoleByUserId", results = { @Result(name = "json", type = "json") })
    public String updateUserRoleByUserId(){
        return "json";
    }

    /**
     * 后台登出
     * @return
     */
    @Action(value = "/adminLogout", results = { @Result(name = "json", type = "json") })
    public String adminLogout() {
        return "json";
    }
}
