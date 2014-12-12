package net.hzjxy.myshop.action.backstage.authority;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.Role;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

/**
 * Created by 磊 on 2014/12/12.
 */
@Namespace("")
@ParentPackage("myshop")
public class RoleAction extends BaseTAction{
    /**
     * 清理错误
     */
    @Override
    public void validate() {
        this.clearErrorsAndMessages();
    }
    /**
     * 增加角色
     * @return
     */
    @Action(value = "addRole", results = { @Result(name = "json", type = "json") })
    public String addRole(){
        return "json";
    }
    /**
     * 获取所有角色
     * @return
     */
    @Action(value = "findAllRole", results = { @Result(name = "json", type = "json") })
    public String findAllRole(){
        return "json";
    }
    public void findDefaultAllRole(){

    }

    public void ProcessRoleMList(List<Role> list){

    }
    /**
     * 删除角色
     * @return
     */
    @Action(value = "delRole", results = { @Result(name = "json", type = "json") })
    public String delRole(){
        return "json";
    }
    /**
     * 根据id获取角色
     * @return
     */
    @Action(value = "findRoleById", results = { @Result(name = "json", type = "json") })
    public String findRoleById(){
        return "json";
    }
    /**
     * 获取当前角色的权限列表
     * @param roleId
     */
    public void findAllRoleFunctionByRoleId(String roleId){
    }
    /**
     * 更新角色权限
     * @return
     */
    @Action(value = "updateRole", results = { @Result(name = "json", type = "json") })
    public String updateRole(){
        return "json";
    }
    /**
     * 获取所有角色用于前台select控件显示
     * @return
     */
    @Action(value = "findAllRoleForSelect", results = { @Result(name = "json", type = "json") })
    public String findAllRoleForSelect(){
        return "json";
    }
}
