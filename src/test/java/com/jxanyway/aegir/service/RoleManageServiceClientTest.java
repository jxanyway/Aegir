package com.jxanyway.aegir.service;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxanyway.aegir.model.RoleModel;
import com.jxanyway.aegir.webservice.RoleManageWebService;

public class RoleManageServiceClientTest {

	@SuppressWarnings("resource")
	@Test
	public void findRoleByRoleIDTest() {

		final Logger logger = LoggerFactory
				.getLogger(RoleManageServiceClientTest.class);

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ClientBeanTest.xml");
		RoleManageWebService roleManageWebService = (RoleManageWebService) context
				.getBean("RoleManageClient");
		List<RoleModel> allRoleList = roleManageWebService.findAllRole();

		for (RoleModel roleModel : allRoleList) {
			logger.info(roleModel.getROLE_GUID());
		}

		System.out.println("成了");

	}

}
