package com.jxanyway.aegir.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jxanyway.aegir.dao.RoleDao;
import com.jxanyway.aegir.model.RoleModel;

/**
 * 角色管理实现类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-06
 */
@Service
public class RoleManageServiceImpl implements RoleManageService {

	@Resource
	private RoleDao roleDao;

	public List<RoleModel> findAllRole() {
		// TODO 查询所有角色列表

		List<RoleModel> allRoleList = roleDao.FindAllRoleList();

		return allRoleList;
	}

}
