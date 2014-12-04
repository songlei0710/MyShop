package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 系统邮件
 * Created by 磊 on 2014/11/30.
 */
public class SystemMail {
    private String id;
    private String email;
    private String smtp;
    private String port;
    private String pwd;
    private String state;
    private String isdefault;
    private String isssl;
    private String creatorid;
    private Date createtime;
    private Date updatetime;
    private String creatorname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    public String getIsssl() {
        return isssl;
    }

    public void setIsssl(String isssl) {
        this.isssl = isssl;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
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

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname;
    }
}
