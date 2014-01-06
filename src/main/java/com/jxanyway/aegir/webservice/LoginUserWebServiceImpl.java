package com.jxanyway.aegir.webservice;

import java.util.LinkedList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jxanyway.aegir.basic.AegirConstantsWebService;
import com.jxanyway.aegir.model.RespondModel;

/**
 * 用户登录实现类
 * 
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义. 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-16
 */
@WebService(serviceName = "LoginUserManage", endpointInterface = "com.jxanyway.aegir.webservice.LoginUserWebService")
public class LoginUserWebServiceImpl implements LoginUserWebService {

	final Logger logger = LoggerFactory.getLogger(LoginUserWebService.class);

	/** 登录后返回参数 */
	public List<RespondModel> loginUser(
			@WebParam(name = "username") String username,
			@WebParam(name = "password") String password) {
		// TODO 自动生成的方法存根

		RespondModel respondModel = new RespondModel();
		List<RespondModel> infoList = new LinkedList<RespondModel>();

		String loginMessages = AegirConstantsWebService.LOGINUSER_MESSAGES_SUCCESS;
		String loginType = AegirConstantsWebService.LOGINUSER_TYPE_SUCCESS;

		AuthenticationToken token = new UsernamePasswordToken(username,
				password);
		Subject currentUser = SecurityUtils.getSubject();

		try {
			currentUser.login(token);
		} catch (UnknownAccountException uae) {
			logger.warn("捕获异常UnknownAccountException：用户不存在,,," + getClass());
			loginType = AegirConstantsWebService.LOGINUSER_TYPE_ERROR;
			loginMessages = AegirConstantsWebService.LOGINUSER_MESSAGES_NOUSER;
		} catch (IncorrectCredentialsException ice) {
			logger.warn("捕获异常IncorrectCredentialsException：密码不正确,,,"
					+ getClass());
			loginType = AegirConstantsWebService.LOGINUSER_TYPE_ERROR;
			loginMessages = AegirConstantsWebService.LOGINUSER_MESSAGES_PASSWORDERROR;
		} catch (LockedAccountException lae) {
			logger.warn("捕获异常LockedAccountException：用户被锁定,,," + getClass());
			loginType = AegirConstantsWebService.LOGINUSER_TYPE_ERROR;
			loginMessages = AegirConstantsWebService.LOGINUSER_MESSAGES_NOUSER;
		} catch (AccountException aep) {
			logger.warn("捕获异常AccountException：用户名不能为空,,," + getClass());
			loginType = AegirConstantsWebService.LOGINUSER_TYPE_ERROR;
			loginMessages = AegirConstantsWebService.LOGINUSER_MESSAGES_USERNOEMPYT;
		} catch (Exception e) {
			logger.warn("其它未知错误,,," + getClass());
			loginType = AegirConstantsWebService.LOGINUSER_TYPE_ERROR;
			loginMessages = e.getMessage().toString();
		}

		respondModel.setRespondType(loginType);
		respondModel.setRespondMessage(loginMessages);
		infoList.add(respondModel);

		return infoList;
	}

	/** 用户退出系统 */
	public String loginOut() {
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		return "成功退出系统";
	}

}
