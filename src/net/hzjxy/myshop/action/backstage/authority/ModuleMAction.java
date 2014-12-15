package net.hzjxy.myshop.action.backstage.authority;

import net.hzjxy.myshop.action.backstage.base.BaseTAction;
import net.hzjxy.myshop.action.backstage.utils.Validate;
import net.hzjxy.myshop.entity.Module;
import org.apache.commons.lang.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

@Namespace("")
@ParentPackage("myshop")
public class ModuleMAction extends BaseTAction {
	/**
	 * 清理错误
	 */
	@Override
	public void validate() {
		this.clearErrorsAndMessages();

	}
	/**
	 * 增加模块
	 * @return
	 */
	@Action(value = "addModule", results = { @Result(name = "json", type = "json") })
	public String addModule(){
		return "json";
	}
	
	/**
	 * 根据id获取模块
	 * @return
	 */
	@Action(value = "findModuleById", results = { @Result(name = "json", type = "json") })
	public String findModuleById(){
		return "json";
	}
	
	/**
	 * 更新模块
	 * @return
	 */
	@Action(value = "updateModule", results = { @Result(name = "json", type = "json") })
	public String updateModule(){
		return "json";
	}
	
	/**
	 * 查询所有模块
	 * @return
	 */
	@Action(value = "findAllModule", results = { @Result(name = "json", type = "json") })
	public String findAllModule(){
		return "json";
	}
	
	public void findDefaultAllModule(){
	}
	
	public void ProcessModuleMList(List<Module> list){
	}
	
	/**
	 * 批量删除模块
	 * @return
	 */
	@Action(value = "delModule", results = { @Result(name = "json", type = "json") })
	public String delModule(){
		return "json";
	}
	
	/**
	 * 获取所有的模块用于前台select控件显示
	 * @return
	 */
	@Action(value = "findAllModuleForSelect", results = { @Result(name = "json", type = "json") })
	public String findAllModuleForSelect(){
		return "json";
	}
	
	
}
