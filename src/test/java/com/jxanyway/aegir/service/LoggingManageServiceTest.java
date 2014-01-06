package com.jxanyway.aegir.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jxanyway.aegir.model.LoggingModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/applicationContext-*.xml" })
public class LoggingManageServiceTest {

	final Logger logger = LoggerFactory
			.getLogger(LoggingManageServiceTest.class);

	@Resource
	private LoggingManageService loggingManageService;

	@Test
	public void LoggingManageService() {

		LoggingModel loggingModel = new LoggingModel();
		loggingModel.setLOGGING_USERNAME("徐国伟");
		loggingModel.setLOGGING_NUMBER("002");
		loggingModel.setLOGGING_TYPE("员工");
		loggingModel.setLOGGING_ACTION("addCustomer");
		loggingModel
				.setLOGGING_TARGET("com.jxanyway.aegir.service.AddressAccess");
		loggingModel.setLOGGING_WANIP("127.0.0.1");
		loggingModel.setLOGGING_LANIP("192.168.0.4");
		loggingModel.setLOGGING_MAC("00-50-56-C0-00-03");
		loggingModel.setLOGGING_NOTE("备注。。。。。。。。");

		int num = loggingManageService.InsertToLogging(loggingModel);
		System.out.println(num);

	}

}
