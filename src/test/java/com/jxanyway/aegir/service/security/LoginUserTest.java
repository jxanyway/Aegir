package com.jxanyway.aegir.service.security;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jxanyway.aegir.model.LoginUserModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/applicationContext-*.xml" })
public class LoginUserTest {

	final Logger logger = LoggerFactory.getLogger(LoginUserTest.class);

	@Resource
	private LoginUserServiceSecurity loginUserServiceSecurity;

	LoginUserModel loginUserInfo;

	@Test
	public void LoginUser() {

		if (!loginUserServiceSecurity.FindUserByName("zoozkop")) {
			System.out.println("=========================================》");
		}

		loginUserInfo = loginUserServiceSecurity.LoginUserInfo("徐国伟");

		logger.info(loginUserInfo.getUSERLOGIN_GUID());

	}

}
