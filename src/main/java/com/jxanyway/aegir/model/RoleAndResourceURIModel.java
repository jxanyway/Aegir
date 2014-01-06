package com.jxanyway.aegir.model;

import java.io.Serializable;


/**
* Copyright (c) 2012,嘉兴市安维信息技术有限公司软件事业部
* All rights reserved.
*
* 文件名称：com.jxanyway.aegir.model.LoginUserModel.java
* 文件标识：
* 摘 要：资源表和角色表的连接表
*
* 当前版本：1.0
* 作 者：徐国伟
* 完成日期：2013-08-15
*
* 取代版本：1.0
* 原作者 ：
* 完成日期：
*/
public class RoleAndResourceURIModel implements Serializable {

	private static final long serialVersionUID = 8207634113043163703L;
	
	private String ROLEANDRESOURCEURI_GUID;
	private String ROLE_GUID;
	private String RESOURCEURI_GUID;
	private Integer ROLEANDRESOURCEURI_ISACTIVE;
	private String ROLEANDRESOURCEURI_OWNER;
	
	public String getROLEANDRESOURCEURI_GUID() {
		return ROLEANDRESOURCEURI_GUID;
	}
	public void setROLEANDRESOURCEURI_GUID(String rOLEANDRESOURCEURI_GUID) {
		ROLEANDRESOURCEURI_GUID = rOLEANDRESOURCEURI_GUID;
	}
	public String getROLE_GUID() {
		return ROLE_GUID;
	}
	public void setROLE_GUID(String rOLE_GUID) {
		ROLE_GUID = rOLE_GUID;
	}
	public String getRESOURCEURI_GUID() {
		return RESOURCEURI_GUID;
	}
	public void setRESOURCEURI_GUID(String rESOURCEURI_GUID) {
		RESOURCEURI_GUID = rESOURCEURI_GUID;
	}
	public Integer getROLEANDRESOURCEURI_ISACTIVE() {
		return ROLEANDRESOURCEURI_ISACTIVE;
	}
	public void setROLEANDRESOURCEURI_ISACTIVE(Integer rOLEANDRESOURCEURI_ISACTIVE) {
		ROLEANDRESOURCEURI_ISACTIVE = rOLEANDRESOURCEURI_ISACTIVE;
	}
	public String getROLEANDRESOURCEURI_OWNER() {
		return ROLEANDRESOURCEURI_OWNER;
	}
	public void setROLEANDRESOURCEURI_OWNER(String rOLEANDRESOURCEURI_OWNER) {
		ROLEANDRESOURCEURI_OWNER = rOLEANDRESOURCEURI_OWNER;
	}
	

}
