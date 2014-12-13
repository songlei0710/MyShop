package net.hzjxy.myshop.action.backstage.authority;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.entity.Function;
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
public class UserRoleAction extends BaseTAction{
    /**
     * 清理错误
     */
    @Override
    public void validate() {
        this.clearErrorsAndMessages();
    }

    /**
     * 增加用户的角色
     * @return
     */
    @Action(value = "addUserRole", results = {@Result(name = "json",type="json")
    })
    public String addUserRole(){
        return "json";
    }

    /**
     * 根据用户id获取角色列表，用于查看用户角色
     * @return
     */
    @Action(value = "findUserRoleByUserId", results = {@Result(name = "json",type="json")
    })
    public String findUserRoleByUserId(){
        return "json";
    }
    /**
     * 获取用户可操作的权限
     * @param userId
     * @return
     */
    public List<Function> findUserRoleFunctionList(String userId){
        return null;
    }
}
