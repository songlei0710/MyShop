package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 模块信息
 * Created by 磊 on 2014/11/30.
 */
public class Module {
    private String id;//组件id
private String modulename;//组件名称
private Date createtime;//创建时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
