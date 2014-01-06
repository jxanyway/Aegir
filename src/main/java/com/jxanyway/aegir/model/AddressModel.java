package com.jxanyway.aegir.model;

import java.io.Serializable;
import java.util.Date;

/**
*Copyright (c) 2012,嘉兴市安维信息技术有限公司软件事业部
* All rights reserved.
*
* 文件名称：com.jxanyway.aegir.model.AddressModel.java
* 文件标识：
* 摘 要：收货人地址实体
*
* 当前版本：1.0
* 作 者：徐国伟
* 完成日期：2013.05.29 15:33
*
* 取代版本：1.0
* 原作者 ：
* 完成日期：
 */
public class AddressModel implements Serializable{

	private static final long serialVersionUID = 5868366567090478971L;
	
	private String ADDRESS_GUID;
	private String CUSTOMER_GUID;
	private String ADDRESS_CATEGORY;
	private String ADDRESS_NAME;
	private String ADDRESS_PY;
	private String ADDRESS_PROVINCE;
	private String ADDRESS_CITY;
	private String ADDRESS_DIST;
	private String ADDRESS_STRET;
	private String ADDRESS_ZIP;
	private String ADDRESS_MOBPHONE;
	private String ADDRESS_TEL;
	private String ADDRESS_FAX;
	private Integer ADDRESS_DEFAULT;
	private String ADDRESS_DETAILED;
	private String ADDRESS_OWNET;
	private Integer ADDRESS_ISACTIVE;
	private Date ADDRESS_CREATEATE;
	public String getADDRESS_GUID() {
		return ADDRESS_GUID;
	}
	public void setADDRESS_GUID(String aDDRESS_GUID) {
		ADDRESS_GUID = aDDRESS_GUID;
	}
	public String getCUSTOMER_GUID() {
		return CUSTOMER_GUID;
	}
	public void setCUSTOMER_GUID(String cUSTOMER_GUID) {
		CUSTOMER_GUID = cUSTOMER_GUID;
	}
	public String getADDRESS_CATEGORY() {
		return ADDRESS_CATEGORY;
	}
	public void setADDRESS_CATEGORY(String aDDRESS_CATEGORY) {
		ADDRESS_CATEGORY = aDDRESS_CATEGORY;
	}
	public String getADDRESS_NAME() {
		return ADDRESS_NAME;
	}
	public void setADDRESS_NAME(String aDDRESS_NAME) {
		ADDRESS_NAME = aDDRESS_NAME;
	}
	public String getADDRESS_PY() {
		return ADDRESS_PY;
	}
	public void setADDRESS_PY(String aDDRESS_PY) {
		ADDRESS_PY = aDDRESS_PY;
	}
	public String getADDRESS_PROVINCE() {
		return ADDRESS_PROVINCE;
	}
	public void setADDRESS_PROVINCE(String aDDRESS_PROVINCE) {
		ADDRESS_PROVINCE = aDDRESS_PROVINCE;
	}
	public String getADDRESS_CITY() {
		return ADDRESS_CITY;
	}
	public void setADDRESS_CITY(String aDDRESS_CITY) {
		ADDRESS_CITY = aDDRESS_CITY;
	}
	public String getADDRESS_DIST() {
		return ADDRESS_DIST;
	}
	public void setADDRESS_DIST(String aDDRESS_DIST) {
		ADDRESS_DIST = aDDRESS_DIST;
	}
	public String getADDRESS_STRET() {
		return ADDRESS_STRET;
	}
	public void setADDRESS_STRET(String aDDRESS_STRET) {
		ADDRESS_STRET = aDDRESS_STRET;
	}
	public String getADDRESS_ZIP() {
		return ADDRESS_ZIP;
	}
	public void setADDRESS_ZIP(String aDDRESS_ZIP) {
		ADDRESS_ZIP = aDDRESS_ZIP;
	}
	public String getADDRESS_MOBPHONE() {
		return ADDRESS_MOBPHONE;
	}
	public void setADDRESS_MOBPHONE(String aDDRESS_MOBPHONE) {
		ADDRESS_MOBPHONE = aDDRESS_MOBPHONE;
	}
	public String getADDRESS_TEL() {
		return ADDRESS_TEL;
	}
	public void setADDRESS_TEL(String aDDRESS_TEL) {
		ADDRESS_TEL = aDDRESS_TEL;
	}
	public String getADDRESS_FAX() {
		return ADDRESS_FAX;
	}
	public void setADDRESS_FAX(String aDDRESS_FAX) {
		ADDRESS_FAX = aDDRESS_FAX;
	}
	public Integer getADDRESS_DEFAULT() {
		return ADDRESS_DEFAULT;
	}
	public void setADDRESS_DEFAULT(Integer aDDRESS_DEFAULT) {
		ADDRESS_DEFAULT = aDDRESS_DEFAULT;
	}
	public String getADDRESS_DETAILED() {
		return ADDRESS_DETAILED;
	}
	public void setADDRESS_DETAILED(String aDDRESS_DETAILED) {
		ADDRESS_DETAILED = aDDRESS_DETAILED;
	}
	public String getADDRESS_OWNET() {
		return ADDRESS_OWNET;
	}
	public void setADDRESS_OWNET(String aDDRESS_OWNET) {
		ADDRESS_OWNET = aDDRESS_OWNET;
	}
	public Integer getADDRESS_ISACTIVE() {
		return ADDRESS_ISACTIVE;
	}
	public void setADDRESS_ISACTIVE(Integer aDDRESS_ISACTIVE) {
		ADDRESS_ISACTIVE = aDDRESS_ISACTIVE;
	}
	public Date getADDRESS_CREATEATE() {
		return ADDRESS_CREATEATE;
	}
	public void setADDRESS_CREATEATE(Date aDDRESS_CREATEATE) {
		ADDRESS_CREATEATE = aDDRESS_CREATEATE;
	}
}
