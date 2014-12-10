package net.hzjxy.myshop.entity;

/**
 * 角色功能.
 * Created by 磊 on 2014/11/30.
 */
public class RoleFunction {
    private String id;
    private String roleid; //用户角色
    private String functionid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getFunctionid() {
        return functionid;
    }

    public void setFunctionid(String functionid) {
        this.functionid = functionid;
    }
}
