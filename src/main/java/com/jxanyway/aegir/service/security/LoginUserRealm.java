package com.jxanyway.aegir.service.security;

import javax.annotation.Resource;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jxanyway.aegir.basic.AegirConstantsWebService;
import com.jxanyway.aegir.dao.LoginUserDao;
import com.jxanyway.aegir.model.LoginUserModel;

@Service
public class LoginUserRealm extends AuthorizingRealm {

	final Logger logger = LoggerFactory.getLogger(LoginUserRealm.class);

	@Resource
	private LoginUserDao loginUserDao;

	/** 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用. **/
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		logger.debug("=========>进入受权回调功能====>" + getClass());

		return null;
	}

	/** 用户认证 **/
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {

		logger.debug("=========>进入认证流程====>" + getClass());

		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String userName = token.getUsername();
		if (userName == null) {
			throw new AccountException(
					AegirConstantsWebService.LOGINUSER_MESSAGES_USERNOEMPYT);
		}

		LoginUserModel loginUserInfo = loginUserDao.FindloginUser(userName);

		if (loginUserInfo == null) {
			throw new UnknownAccountException(
					AegirConstantsWebService.LOGINUSER_MESSAGES_NOUSER);
		}

		int isActive = loginUserInfo.getUSERLOGIN_ISACTIVE();
		if (isActive == 1) {
			throw new LockedAccountException(
					AegirConstantsWebService.LOGINUSER_MESSAGES_DISABLEACCOUNT);
		}

		return new SimpleAuthenticationInfo(loginUserInfo.getUSERLOGIN_NAME(),
				loginUserInfo.getUSERLOGIN_PASSWORD(), getName());
	}

}
