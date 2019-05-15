package com.dao;

import java.util.List;

import com.entiy.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport{
	
	public boolean checkUser(String name,String password){
		boolean flag=false;
		@SuppressWarnings("unchecked")
		List<User> userList=this.getHibernateTemplate().find("from User where name=? and password=?",name,password);
		if(userList.size()>0)
		{
			flag=true;
		}
		return flag;
	}

}
