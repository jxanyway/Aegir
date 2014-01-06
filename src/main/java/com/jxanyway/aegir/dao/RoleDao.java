package com.jxanyway.aegir.dao;

import java.util.List;

import com.jxanyway.aegir.model.RoleModel;

/**
 * @ClassName: RoleDao
 * @Description: TODO
 *               角色管理，通过@MapperScannerConfigurer扫描目录中的所有接口，方法名称必须与Mapper.xml中保持一致
 *               。
 * @author 浅语
 * @date 2013-10-21 上午11:16:29
 * 
 */
@MyBatisRepository
public interface RoleDao {

	/** 查的所有角色列表 */
	public List<RoleModel> FindAllRoleList();
}
