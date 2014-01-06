package com.jxanyway.aegir.webservice;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 上传附件实现类
 * 
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义. 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * @author zoozkop
 * @version 1.0.0 2013-10-14
 */

@WebService(serviceName = "AttachmentManageWebService", endpointInterface = "com.jxanyway.aegir.webservice.AttachmentManageWebService")
public class AttachmentManageWebServiceImpl implements
		AttachmentManageWebService {

	final Logger logger = LoggerFactory
			.getLogger(AttachmentManageWebServiceImpl.class);

	public int uploadFile() {
		// TODO Auto-generated method stub
		return 0;
	}

}
