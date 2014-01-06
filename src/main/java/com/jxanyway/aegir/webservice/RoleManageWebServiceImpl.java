package com.jxanyway.aegir.webservice;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jxanyway.aegir.model.RoleModel;
import com.jxanyway.aegir.service.RoleManageService;

/**
 * 角色管理实现类
 * 
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义. 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-16
 */

@WebService(serviceName = "RoleManageWebService", endpointInterface = "com.jxanyway.aegir.webservice.RoleManageWebService")
public class RoleManageWebServiceImpl implements RoleManageWebService {

	final Logger logger = LoggerFactory
			.getLogger(RoleManageWebServiceImpl.class);

	@Resource
	private RoleManageService roleManageService;

	public List<RoleModel> findAllRole() {
		// TODO Auto-generated method stub
		List<RoleModel> allRoleList = roleManageService.findAllRole();
		return allRoleList;
	}

	public String findRoleByRoleId(String id) {
		// TODO Auto-generated method stub

		return id;
	}

}
