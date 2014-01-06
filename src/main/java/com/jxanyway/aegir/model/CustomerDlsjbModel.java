package com.jxanyway.aegir.model;

import java.io.Serializable;


/**
* Copyright (c) 2012,嘉兴市安维信息技术有限公司软件事业部
* All rights reserved.
*
* 文件名称：com.jxanyway.aegir.model.CustomerDljbModel.java
* 文件标识：
* 摘 要：经销商实体类
*
* 当前版本：1.0
* 作 者：徐国伟
* 创建日期：2013-4-20
*
* 取代版本：1.0
* 原作者 ：
* 完成日期：
*/
public class CustomerDlsjbModel implements Serializable {
	
	private static final long serialVersionUID = 3186073539904751608L;
	
	private String CUSTOMERDLSJB_GUID;
	private String CUSTOMERDLSJB_CATEGORY;
	private String CUSTOMERDLSJB_NAME;	
	
	public String getCUSTOMERDLSJB_GUID() {
		return CUSTOMERDLSJB_GUID;
	}

	public void setCUSTOMERDLSJB_GUID(String cUSTOMERDLSJB_GUID) {
		CUSTOMERDLSJB_GUID = cUSTOMERDLSJB_GUID;
	}

	public String getCUSTOMERDLSJB_CATEGORY() {
		return CUSTOMERDLSJB_CATEGORY;
	}

	public void setCUSTOMERDLSJB_CATEGORY(String cUSTOMERDLSJB_CATEGORY) {
		CUSTOMERDLSJB_CATEGORY = cUSTOMERDLSJB_CATEGORY;
	}

	public String getCUSTOMERDLSJB_NAME() {
		return CUSTOMERDLSJB_NAME;
	}

	public void setCUSTOMERDLSJB_NAME(String cUSTOMERDLSJB_NAME) {
		CUSTOMERDLSJB_NAME = cUSTOMERDLSJB_NAME;
	}
}
