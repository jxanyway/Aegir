package com.jxanyway.aegir.dao;

import com.jxanyway.aegir.model.CustomerModel;

/**
 * 摘 要：经销商的数据查询
 * 
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-17
 */

@MyBatisRepository
public interface CustomerDao {

	/* 插入分销商 */
	public int InsertToCustomer(CustomerModel customerModel);

	/* 根据分销商名称查询 */
	public CustomerModel FindCustomerGUID(String CUSTOMER_NAME);

	/* 查询经销商是否存在 */
	public int FindConutCustomerName(String CUSTOMER_NAME);

}
