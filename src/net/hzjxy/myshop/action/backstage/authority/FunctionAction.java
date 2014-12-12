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
public class FunctionAction extends BaseTAction{

    /**
     * 清理错误
     */
    @Override
    public void validate() {
        this.clearErrorsAndMessages();
    }
    /**
     * 增加可访问的功能路径或方法
     * @return
     */
    @Action(value = "addFunction", results = { @Result(name = "json", type = "json") })
    public String addFunction(){
        return "json";
    }
    /**
     * 根据id获取功能信息数据
     * @return
     */
    @Action(value = "findFunctionById", results = { @Result(name = "json", type = "json") })
    public String findFunctionById(){
        return "json";
    }
    /**
     * 更新功能
     * @return
     */
    @Action(value = "updateFunction", results = { @Result(name = "json", type = "json") })
    public String updateFunction(){
        return "json";
    }

    /**
     * 根据模块id查询对应功能列表
     * @return
     */
    @Action(value = "findAllFunctionByModuleId", results = { @Result(name = "json", type = "json") })
    public String findAllFunctionByModuleId(){
        return "json";
    }

    public void findDefaultAllFunctionByModuleId(){

    }

    public void findAllFunction(){
    }

    public void ProcessFunctionList(List<Function> list){

    }
    /**
     * 删除系统模块功能
     * @return
     */
    @Action(value = "delFunction", results = { @Result(name = "json", type = "json") })
    public String delFunction(){
        return "json";
    }
    /**
     * 获取所有功能，给前台的checkbox显示
     * @return
     */
    @Action(value = "findAllFunctionForSelect", results = { @Result(name = "json", type = "json") })
    public String findAllFunctionForSelect(){
        return "json";
    }
}
