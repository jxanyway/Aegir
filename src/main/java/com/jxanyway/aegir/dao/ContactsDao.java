package com.jxanyway.aegir.dao;

import java.util.List;

import com.jxanyway.aegir.model.ContactsModel;

/**
 * 摘 要：联系人的表，包括经销商的联系人
 * 
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-17
 */

@MyBatisRepository
public interface ContactsDao {

	/* 插入经销商联系人 */
	public void InsertTOCustomerContacts(ContactsModel contactsModel);

	/* 更新经销商联系人 */
	public void UpdateToCustomerContacts(ContactsModel contactsModel);

	/* 查询经销商联系人列表 */
	public List<ContactsModel> FindCustomerContacts(String CUSTOMER_GUID);

	/* 删除经销商联系人GUID */
	public void DeleteCustomerContacts(String CONTACTS_GUID);

}
