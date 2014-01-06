package com.jxanyway.aegir.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jxanyway.aegir.model.RoleModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/applicationContext-*.xml" })
public class RoleManageServiceTest {

	@Resource
	private RoleManageService roleManageService;

	@Test
	public void RoleManageService() {

		final Logger logger = LoggerFactory
				.getLogger(RoleManageServiceTest.class);

		List<RoleModel> allRoleList = roleManageService.findAllRole();

		logger.info("====================>"
				+ allRoleList.get(0).getROLE_NAMEZH());

	}

}
