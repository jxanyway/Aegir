package com.jxanyway.aegir.service.security;

import org.springframework.stereotype.Service;

import com.jxanyway.aegir.model.LoginUserModel;

/**
 * 用户登录服务类
 * 
 */
@Service
public interface LoginUserServiceSecurity {

	/** 仅查找用户名 **/
	public boolean FindUserByName(String userLoginName);

	/** 获取用户所有信息 **/
	public LoginUserModel LoginUserInfo(String userloginName);

}
