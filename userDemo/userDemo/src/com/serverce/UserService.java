package com.serverce;

import com.dao.UserDao;

public class UserService {
	private UserDao userDao;
	public boolean checkUser(String name,String password)
	{
		return userDao.checkUser(name,password);
	}
	public  UserDao getUserDao(){
		return userDao;
	}
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}

}
