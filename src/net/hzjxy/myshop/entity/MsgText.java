package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 站内信消息
 * Created by 磊 on 2014/11/30.
 */
public class MsgText {
    private String msgTextId;
    private String text;
    private Date sendTime;

    public String getMsgTextId() {
        return msgTextId;
    }

    public void setMsgTextId(String msgTextId) {
        this.msgTextId = msgTextId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
