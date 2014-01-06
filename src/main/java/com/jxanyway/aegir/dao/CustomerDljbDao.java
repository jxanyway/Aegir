package com.jxanyway.aegir.dao;

import java.util.List;

import com.jxanyway.aegir.model.CustomerDlsjbModel;

/**
* Copyright (c) 2012,嘉兴市安维信息技术有限公司软件事业部
* All rights reserved.
*
* 文件名称：com.jxanyway.aegir.dao.CustomerDljbDao.java
* 文件标识：
* 摘 要：代理商级别表
*
* 当前版本：1.0
* 作 者：徐国伟
* 创建日期：2013-4-20
*
* 取代版本：1.0
* 原作者 ：
* 完成日期：
*/
public interface CustomerDljbDao {
	
	public List<CustomerDlsjbModel> FindCustomerDlsjb(String DlsjbName);
	
	public int InsertToCustomerDlsjb(CustomerDlsjbModel customerDlsjbModel);

}
