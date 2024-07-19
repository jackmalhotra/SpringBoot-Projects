package com.hellokoding.springmvc;

import org.springframework.stereotype.Service;

import com.hellokoding.springmvc.LoginBean;

@Service
public class LoginService
{
		public String validateUser(LoginBean loginBean)
		{
				String userName = loginBean.getUserName();
				String password = loginBean.getPassword();
				if(userName.equals("Chandan") && password.equals("123456"))
				{
						return "true";
				}
				else
				{
						return "false";
				}
		}
		
}
