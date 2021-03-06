package com.jxanyway.aegir.webservice;

import java.util.List;

import javax.jws.WebService;

import com.jxanyway.aegir.model.RoleModel;

/**
 * 角色管理服务类
 * 
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义. 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-16
 */

@WebService
public interface RoleManageWebService {

	List<RoleModel> findAllRole();

	String findRoleByRoleId(String id);

}
