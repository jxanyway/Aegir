package com.jxanyway.aegir.dao;

import java.util.List;

import com.jxanyway.aegir.model.AddressModel;

/**
 * 地址管理
 * 
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-17
 */

@MyBatisRepository
public interface AddressDao {

	/* 插入收货人地址 */
	public void InsertTOAddress(AddressModel addressModel);

	/* 根据Customer_Guid查询收货人地址 */
	public List<AddressModel> FindAddress(String Customer_GUID);

	/* 根据address_guid删除收货人 */
	public void DeleteConsignee(String Address_GUID);

}
