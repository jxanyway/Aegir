package com.jxanyway.aegir.model;

import java.io.Serializable;
import java.util.Date;

/**
* Copyright (c) 2012,嘉兴市安维信息技术有限公司软件事业部
* All rights reserved.
*
* 文件名称：com.jxanyway.aegir.model.LoginUserModel.java
* 文件标识：
* 摘 要：资源表
*
* 当前版本：1.0
* 作 者：徐国伟
* 完成日期：2012-08-15
*
* 取代版本：1.0
* 原作者 ：
* 完成日期：
*/
public class ResourceURIModel implements Serializable{

	private static final long serialVersionUID = 5800091754465629672L;
	
	private String RESOURCEURI_GUID;
	private String RESOURCEURI_URI;
	private String RESOURCEURI_DESCRIBE;
	private String RESOURCEURI_OWNER;
	private Date   RESOURCEURI_DATE;
	private Integer RESOURCEURI_ISACTIVE;
	
	public String getRESOURCEURI_GUID() {
		return RESOURCEURI_GUID;
	}
	public void setRESOURCEURI_GUID(String rESOURCEURI_GUID) {
		RESOURCEURI_GUID = rESOURCEURI_GUID;
	}
	public String getRESOURCEURI_URI() {
		return RESOURCEURI_URI;
	}
	public void setRESOURCEURI_URI(String rESOURCEURI_URI) {
		RESOURCEURI_URI = rESOURCEURI_URI;
	}
	public String getRESOURCEURI_DESCRIBE() {
		return RESOURCEURI_DESCRIBE;
	}
	public void setRESOURCEURI_DESCRIBE(String rESOURCEURI_DESCRIBE) {
		RESOURCEURI_DESCRIBE = rESOURCEURI_DESCRIBE;
	}
	public String getRESOURCEURI_OWNER() {
		return RESOURCEURI_OWNER;
	}
	public void setRESOURCEURI_OWNER(String rESOURCEURI_OWNER) {
		RESOURCEURI_OWNER = rESOURCEURI_OWNER;
	}
	public Date getRESOURCEURI_DATE() {
		return RESOURCEURI_DATE;
	}
	public void setRESOURCEURI_DATE(Date rESOURCEURI_DATE) {
		RESOURCEURI_DATE = rESOURCEURI_DATE;
	}
	public Integer getRESOURCEURI_ISACTIVE() {
		return RESOURCEURI_ISACTIVE;
	}
	public void setRESOURCEURI_ISACTIVE(Integer rESOURCEURI_ISACTIVE) {
		RESOURCEURI_ISACTIVE = rESOURCEURI_ISACTIVE;
	}
	
}
