package cn.springside.jackfruit.service;

import java.util.List;

import cn.springside.jackfruit.model.Tbugtype;

/**
 * 
 * @author 孙宇
 * 
 */
public interface BugTypeServiceI {

	/**
	 * 获得BUG类型列表
	 * 
	 * @return
	 */
	public List<Tbugtype> getBugTypeList();

}
