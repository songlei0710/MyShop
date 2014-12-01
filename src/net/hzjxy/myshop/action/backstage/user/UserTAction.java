package net.hzjxy.myshop.action.backstage.user;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;

import net.hzjxy.myshop.action.backstage.utils.MD5Code;
import net.hzjxy.myshop.action.backstage.utils.enums.UserEnum;
import net.hzjxy.myshop.action.backstage.utils.statickey.StaticKey;
import net.hzjxy.myshop.entity.UserT;
import net.hzjxy.myshop.service.UserTService;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.util.Locale;

/**
 * Created by 磊 on 2014/11/30.
 */
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
     * 管理员登陆
     * @return
     * @throws Exception
     */
    @Action(value = "/adminlogin", results = { @Result(name = "success", type = "redirect", location = "/admin/index.jsp?session=${param}"), @Result(name = "input", type = "redirect", location = "/admin/login.jsp?msg=${param}") })
    public String adminlogin() throws Exception {
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
}
