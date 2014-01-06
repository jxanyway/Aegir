package com.jxanyway.aegir.service.security;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jxanyway.aegir.dao.LoginUserDao;
import com.jxanyway.aegir.model.LoginUserModel;

/**
 * 用户登录实现类
 * 
 * @author zoozkop
 * @version 1.0.0.1 2013-09-26
 * 
 */
@Service
public class LoginUserServiceSecurityImpl implements LoginUserServiceSecurity {

	final static Logger logger = LoggerFactory
			.getLogger(LoginUserServiceSecurityImpl.class);

	@Resource
	private LoginUserDao loginUserDao;

	public boolean FindUserByName(String userLoginName) {
		LoginUserModel loginUserModel = loginUserDao
				.FindloginUser(userLoginName);
		if (loginUserModel == null) {
			logger.debug("用户不存在" + "===>" + getClass());
			return false;
		}
		logger.debug(loginUserModel.getUSERLOGIN_GUID());
		return true;
	}

	public LoginUserModel LoginUserInfo(String userloginName) {
		LoginUserModel loginUserModel = loginUserDao
				.FindloginUser(userloginName);
		return loginUserModel;
	}
}
