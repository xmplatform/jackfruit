package cn.springside.jackfruit.dao.impl;

import org.springframework.stereotype.Repository;

import cn.springside.jackfruit.dao.UserDaoI;
import cn.springside.jackfruit.model.Tuser;

@Repository
public class UserDaoImpl extends BaseDaoImpl<Tuser> implements UserDaoI {

}
