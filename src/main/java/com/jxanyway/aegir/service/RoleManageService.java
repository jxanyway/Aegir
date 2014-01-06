package com.jxanyway.aegir.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxanyway.aegir.model.RoleModel;

/**
 * 角色管理
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-06
 */
@Service
@Transactional
public interface RoleManageService {

	/** 查找所有角色 */
	List<RoleModel> findAllRole();

}
