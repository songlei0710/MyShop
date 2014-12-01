package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 后台用户
 * Created by 磊 on 2014/11/30.
 */
public class UserT {
    private String userId;      //Id
    private String username;    //用户名
    private String realName;    //真名
    private String email;       //邮箱
    private String telno;       //固定电话
    private String mobile;      //手机
    private String question;    //安全问题
    private String answer;      //安全答案
    private String password;    //密码
    private String userState;   //用户状态（0：未激活  1：激活  2：禁止访问  3：禁止发帖）
    private String sectionId;   //用户所属部门Id  0：不属于任何部门
    private String positionId;  //用户所属职位Id  0：不属于任何职位
    private String groupId;     //用户所属的组别Id  0：游客组
    private String qq;          //QQ号码
    private String sinaweibo;   //新浪微博
    private String rolemname;   //用户所属角色名称
    private String rolemid;     //用户所属角色Id
    private String state;       //1：普通用户  2：一般管理员  3：超级管理员  4：手机用户
    private String headpath;    //头像地址
    private String weixin;      //微信号
    private Date createtime;    //创建时间
    private Date updatetime;    //更新时间
    private String creatorId;   //创建人Id
    private Integer postingCount;   //发布帖子总数

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSinaweibo() {
        return sinaweibo;
    }

    public void setSinaweibo(String sinaweibo) {
        this.sinaweibo = sinaweibo;
    }

    public String getRolemname() {
        return rolemname;
    }

    public void setRolemname(String rolemname) {
        this.rolemname = rolemname;
    }

    public String getRolemid() {
        return rolemid;
    }

    public void setRolemid(String rolemid) {
        this.rolemid = rolemid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getPostingCount() {
        return postingCount;
    }

    public void setPostingCount(Integer postingCount) {
        this.postingCount = postingCount;
    }
}
