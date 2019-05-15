package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.serverce.UserService;
public class LoginAction  extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -985515062448920319L;
	private String name;
	private String password;
	private UserService userService=new UserService();
	public UserService getUserService(UserService userService){
		return userService;
	}
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String execute(){
		boolean flag=false;
		if(name==null || name.trim().equals("")){
			this.addFieldError("name","用户名不能为空");
			return "fail1";
		}else if(password==null || password.trim().equals("")){
			this.addFieldError("password","密码不能为空");
			return "fail2";
		}else{
			flag=userService.checkUser(name,password);
			if(flag){
				return "success";
			}else{
				return "fail";
			}
		}
	}
}
