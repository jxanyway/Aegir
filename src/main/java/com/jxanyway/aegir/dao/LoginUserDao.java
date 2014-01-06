package com.jxanyway.aegir.dao;

import com.jxanyway.aegir.model.LoginUserModel;

/**
 * 用户登录
 * 
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author zoozkop
 */
@MyBatisRepository
public interface LoginUserDao {

	public LoginUserModel FindloginUser(String uesrLogin_name);

}
