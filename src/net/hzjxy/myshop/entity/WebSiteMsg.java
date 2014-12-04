package net.hzjxy.myshop.entity;

import java.util.Date;
/**.
 * 网站消息
 * Created by 磊 on 2014/11/30.
 */
public class WebSiteMsg {
    private String msgid;
    private String msgtousername;
    private String msgfromuserid;
    private String msgfromusrname;
    private String msgtextid;
    private String state;
    private String title;
    private Date createtime;
    private String msgstate;
    private Date readtime;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getMsgtousername() {
        return msgtousername;
    }

    public void setMsgtousername(String msgtousername) {
        this.msgtousername = msgtousername;
    }

    public String getMsgfromuserid() {
        return msgfromuserid;
    }

    public void setMsgfromuserid(String msgfromuserid) {
        this.msgfromuserid = msgfromuserid;
    }

    public String getMsgfromusrname() {
        return msgfromusrname;
    }

    public void setMsgfromusrname(String msgfromusrname) {
        this.msgfromusrname = msgfromusrname;
    }

    public String getMsgtextid() {
        return msgtextid;
    }

    public void setMsgtextid(String msgtextid) {
        this.msgtextid = msgtextid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMsgstate() {
        return msgstate;
    }

    public void setMsgstate(String msgstate) {
        this.msgstate = msgstate;
    }

    public Date getReadtime() {
        return readtime;
    }

    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }
}
