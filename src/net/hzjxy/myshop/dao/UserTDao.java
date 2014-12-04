package net.hzjxy.myshop.dao;

import net.hzjxy.myshop.entity.UserT;

import java.util.List;

/**
 * Created by 磊 on 2014/11/30.
 */
public interface UserTDao {

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @param userState 用户状态
     * @return
     */
    public UserT login(String username,String password,String userState);


    /**
     * 根据用户名称获取用户信息
     * @param username 用户名
     * @return
     */
    public UserT findByUserName(String username);

    /**
     * 根据用户ID获取用户信息
     * @param userId 用户编号
     * @return
     */
    public UserT findById(String userId);


    /**
     * 查询所有用户包括管理员  order by createtime desc
     * @param currentPage
     * @param lineSize
     * @return
     */
    public List<UserT> findAllUserT(final int currentPage, final int lineSize);

    /**
     * 统计查询所有用户包括管理员 count(*)
     * @return
     */
    public int countFindAllUserT();

    /**
     * 检测用户是否已经注册（用户名）
     * @param username 用户名
     * @return null：不存在
     */
    public UserT checkUserByUsername(String username);

    /**
     * 更新用户信息，不更新密码和涉及到保密的用户资料
     * update UserT as u set u.username=:username,u.email=:email,u.state=:state,u.userstate=:userstate where u.userid=:userid
     * @param userT
     * @return 受影响的行数
     */
    public int updateUserTunpwd(UserT userT);

    /**
     * 批量删除用户管理员操作
     * @param list 要删除用户的userId
     * @return 删除成功的个数
     */
    public int delUser(String[] list);

    /**
     * 用户自己更新
     * @param userT 用户信息
     * @return
     */
    public int updateUserForMyInfo(UserT userT);

    /**
     * 修改管理员密码时检测账号密码是否正确
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public UserT checkUsernameAndPassword(String username,String password);

    /**
     * 修改管理员密码
     * update UserT as u set u.password=:newpassword,u.username=:username where u.userid=:userid
     * @param username 用户名
     * @param newPassword 新密码
     * @param userId 用户编号
     * @return
     */
    public int updateUserMember(String username,String newPassword,String userId);


    /**
     * 更新用户状态，激活用户
     * @param userId 用户编号
     * @param userState 用户状态
     * @return
     */
    public int updateUserState(String userId,String userState);

    /**
     * 通过uid获取用户数据
     * @param userId
     * @return
     */
    public UserT findUserByUserId(String userId);

    /**
     * 根据排序方式排序所有
     * @param currentPage 当前页
     * @param lineSize 每页条数
     * @param queryString 查询字符串
     * @return
     */
    public List<UserT> sortAllUserT(final int currentPage, final int lineSize, String queryString);

    /**
     * 查询所有Email
     * @return Email数组（字符串数组）
     */
    public String[] findEmailByUser();

    /**
     * 根据email检查用户信息
     * @param email email
     * @return
     */
    public UserT checkUserByEmail(String email);

    /**
     * 根据username,question,answer检查用户
     * from UserT as u where u.username=:username and u.question=:question and u.answer=:answer
     * @param username 用户名
     * @param question 问题
     * @param answer 答案
     * @return
     */
    public UserT checkUserByAnswer(String username, String question, String answer);

    /**
     * 设置用户密码保护
     * @param userId 用户编号
     * @param question 问题
     * @param answer 答案
     * @return
     */
    public int updateUserPasswordProtection(String userId, String question, String answer);

    /**
     * 管理员赋值管理用户权限标记 update UserT as u set u.rolemid=:rolemid,u.rolemname=:rolemname where u.userid=:userid
     * @param userId
     * @param roleId
     * @param roleName
     * @return
     */
    public int updateUserRoleByUserId(String userId, String roleId,String roleName);

    /**
     * 上传用户的头像路径
     * @param userId 用户编号
     * @param headPath 头像路径
     * @return
     */
    public int updateUserHeadPathByUserId(String userId,String headPath);

    /**
     * 更新系统用户
     * @param userT
     */
    public void updateUserT(UserT userT);

    /**
     * 添加用户
     * @param userT
     * @return
     */
    public int addUserT(UserT userT);
}
