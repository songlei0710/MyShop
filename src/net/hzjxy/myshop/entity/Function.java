package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 功能
 * Created by 磊 on 2014/11/30.
 */
public class Function {
    private String id;                  //编号
    private String visitUrl;            //虚拟路径
    private String visitMethodName;     //虚拟方法名
    private String functionName;        //功能名称
    private Date createTime;            //创建时间
    private String moduleId;            //工程Id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl;
    }

    public String getVisitMethodName() {
        return visitMethodName;
    }

    public void setVisitMethodName(String visitMethodName) {
        this.visitMethodName = visitMethodName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }
}
