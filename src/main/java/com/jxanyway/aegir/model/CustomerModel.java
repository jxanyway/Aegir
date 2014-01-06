package com.jxanyway.aegir.model;

import java.io.Serializable;
import java.util.Date;

/**
* Copyright (c) 2012,嘉兴市安维信息技术有限公司软件事业部
* All rights reserved.
*
* 文件名称：com.jxanyway.aegir.model.CustomerModel.java
* 文件标识：
* 摘 要：经销商实体模型
*
* 当前版本：1.0
* 作 者：徐国伟
* 创建日期：2013-4-17
*
* 取代版本：1.0
* 原作者 ：
* 完成日期：
*/
public class CustomerModel implements Serializable {

	private static final long serialVersionUID = -5076287802011643895L;
	
	private String CUSTOMER_GUID;
	private String CUSTOMER_ID;
	private String CUSTOMER_PY;
	private String CUSTOMER_NAME;
	private String CUSTOMER_TAXNUM;
	private String CUSTOMER_LEVEL;
	private String CUSTOMER_PROVINCE;	
	private String CUSTOMER_CITY;
	private String CUSTOMER_DISTRICT;
	private String CUSTOMER_ADDRESS;
	private String CUSTOMER_MOBPHONE;
	private String CUSTOMER_TELEPHONE;
	private String CUSTOMER_FAX;
	private String CUSTOMER_EMAIL;
	private Integer CUSTOMER_SUMNUMBER;
	private String CUSTOMER_CATEGORY;
	private Float CUSTOMER_TAX;
	private Float CUSTOMER_DISCOUNT;
	private Float CUSTOMER_DISCOUNTTO;
	private Integer CUSTOMER_INTEGRAL;
	private String CUSTOMER_NOTE;
	private String CUSTOMER_OWNER;
	private Integer ISACTIVE;
	private Date CUSTOMER_CREATEDATE;
	public String getCUSTOMER_GUID() {
		return CUSTOMER_GUID;
	}
	public void setCUSTOMER_GUID(String cUSTOMER_GUID) {
		CUSTOMER_GUID = cUSTOMER_GUID;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getCUSTOMER_PY() {
		return CUSTOMER_PY;
	}
	public void setCUSTOMER_PY(String cUSTOMER_PY) {
		CUSTOMER_PY = cUSTOMER_PY;
	}
	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}
	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}
	public String getCUSTOMER_TAXNUM() {
		return CUSTOMER_TAXNUM;
	}
	public void setCUSTOMER_TAXNUM(String cUSTOMER_TAXNUM) {
		CUSTOMER_TAXNUM = cUSTOMER_TAXNUM;
	}
	public String getCUSTOMER_LEVEL() {
		return CUSTOMER_LEVEL;
	}
	public void setCUSTOMER_LEVEL(String cUSTOMER_LEVEL) {
		CUSTOMER_LEVEL = cUSTOMER_LEVEL;
	}
	public String getCUSTOMER_PROVINCE() {
		return CUSTOMER_PROVINCE;
	}
	public void setCUSTOMER_PROVINCE(String cUSTOMER_PROVINCE) {
		CUSTOMER_PROVINCE = cUSTOMER_PROVINCE;
	}
	public String getCUSTOMER_DISTRICT() {
		return CUSTOMER_DISTRICT;
	}
	public void setCUSTOMER_DISTRICT(String cUSTOMER_DISTRICT) {
		CUSTOMER_DISTRICT = cUSTOMER_DISTRICT;
	}
	public String getCUSTOMER_CITY() {
		return CUSTOMER_CITY;
	}
	public void setCUSTOMER_CITY(String cUSTOMER_CITY) {
		CUSTOMER_CITY = cUSTOMER_CITY;
	}
	public String getCUSTOMER_ADDRESS() {
		return CUSTOMER_ADDRESS;
	}
	public void setCUSTOMER_ADDRESS(String cUSTOMER_ADDRESS) {
		CUSTOMER_ADDRESS = cUSTOMER_ADDRESS;
	}
	public String getCUSTOMER_MOBPHONE() {
		return CUSTOMER_MOBPHONE;
	}
	public void setCUSTOMER_MOBPHONE(String cUSTOMER_MOBPHONE) {
		CUSTOMER_MOBPHONE = cUSTOMER_MOBPHONE;
	}
	public String getCUSTOMER_TELEPHONE() {
		return CUSTOMER_TELEPHONE;
	}
	public void setCUSTOMER_TELEPHONE(String cUSTOMER_TELEPHONE) {
		CUSTOMER_TELEPHONE = cUSTOMER_TELEPHONE;
	}
	public String getCUSTOMER_FAX() {
		return CUSTOMER_FAX;
	}
	public void setCUSTOMER_FAX(String cUSTOMER_FAX) {
		CUSTOMER_FAX = cUSTOMER_FAX;
	}
	public String getCUSTOMER_EMAIL() {
		return CUSTOMER_EMAIL;
	}
	public void setCUSTOMER_EMAIL(String cUSTOMER_EMAIL) {
		CUSTOMER_EMAIL = cUSTOMER_EMAIL;
	}
	public Integer getCUSTOMER_SUMNUMBER() {
		return CUSTOMER_SUMNUMBER;
	}
	public void setCUSTOMER_SUMNUMBER(Integer cUSTOMER_SUMNUMBER) {
		CUSTOMER_SUMNUMBER = cUSTOMER_SUMNUMBER;
	}
	public String getCUSTOMER_CATEGORY() {
		return CUSTOMER_CATEGORY;
	}
	public void setCUSTOMER_CATEGORY(String cUSTOMER_CATEGORY) {
		CUSTOMER_CATEGORY = cUSTOMER_CATEGORY;
	}
	public Float getCUSTOMER_TAX() {
		return CUSTOMER_TAX;
	}
	public void setCUSTOMER_TAX(Float cUSTOMER_TAX) {
		CUSTOMER_TAX = cUSTOMER_TAX;
	}
	public Float getCUSTOMER_DISCOUNT() {
		return CUSTOMER_DISCOUNT;
	}
	public void setCUSTOMER_DISCOUNT(Float cUSTOMER_DISCOUNT) {
		CUSTOMER_DISCOUNT = cUSTOMER_DISCOUNT;
	}
	public Float getCUSTOMER_DISCOUNTTO() {
		return CUSTOMER_DISCOUNTTO;
	}
	public void setCUSTOMER_DISCOUNTTO(Float cUSTOMER_DISCOUNTTO) {
		CUSTOMER_DISCOUNTTO = cUSTOMER_DISCOUNTTO;
	}
	public Integer getCUSTOMER_INTEGRAL() {
		return CUSTOMER_INTEGRAL;
	}
	public void setCUSTOMER_INTEGRAL(Integer cUSTOMER_INTEGRAL) {
		CUSTOMER_INTEGRAL = cUSTOMER_INTEGRAL;
	}
	public String getCUSTOMER_NOTE() {
		return CUSTOMER_NOTE;
	}
	public void setCUSTOMER_NOTE(String cUSTOMER_NOTE) {
		CUSTOMER_NOTE = cUSTOMER_NOTE;
	}
	public String getCUSTOMER_OWNER() {
		return CUSTOMER_OWNER;
	}
	public void setCUSTOMER_OWNER(String cUSTOMER_OWNER) {
		CUSTOMER_OWNER = cUSTOMER_OWNER;
	}
	public Integer getISACTIVE() {
		return ISACTIVE;
	}
	public void setISACTIVE(Integer iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}
	public Date getCUSTOMER_CREATEDATE() {
		return CUSTOMER_CREATEDATE;
	}
	public void setCUSTOMER_CREATEDATE(Date cUSTOMER_CREATEDATE) {
		CUSTOMER_CREATEDATE = cUSTOMER_CREATEDATE;
	}		
}