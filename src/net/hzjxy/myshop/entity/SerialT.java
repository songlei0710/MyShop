package net.hzjxy.myshop.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 该表负责系统中所有其他表的主键生成工作
 * Created by 磊 on 2014/11/30.
 */
public class SerialT implements Serializable {
    private String biz;
    private String head;//前缀
    private String lastId;//最新Id
    private int increment;//增量
    private Date updateTime;//更新时间

    public SerialT() {
    }

    public SerialT(String biz, String lastId, int increment, Date updateTime) {
        this.biz = biz;
        this.lastId = lastId;
        this.increment = increment;
        this.updateTime = updateTime;
    }

    public SerialT(String biz, String head, String lastId, int increment,
                   Date updateTime) {
        this.biz = biz;
        this.head = head;
        this.lastId = lastId;
        this.increment = increment;
        this.updateTime = updateTime;
    }
    public String getBiz() {
        return this.biz;
    }

    public void setBiz(String biz) {
        this.biz = biz;
    }
    public String getHead() {
        return this.head;
    }

    public void setHead(String head) {
        this.head = head;
    }
    public String getLastId() {
        return this.lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }
    public int getIncrement() {
        return this.increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
