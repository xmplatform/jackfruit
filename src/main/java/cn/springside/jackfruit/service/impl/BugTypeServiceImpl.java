package cn.springside.jackfruit.service.impl;

import java.util.List;

import cn.springside.jackfruit.dao.BugTypeDaoI;
import cn.springside.jackfruit.model.Tbugtype;
import cn.springside.jackfruit.service.BugTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugTypeServiceImpl implements BugTypeServiceI {

	@Autowired
	private BugTypeDaoI bugType;

	@Override
	public List<Tbugtype> getBugTypeList() {
		return bugType.find("from Tbugtype t");
	}

}
