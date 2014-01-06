package com.jxanyway.aegir.model;

import java.io.Serializable;
import java.util.Date;

/**
* Copyright (c) 2012,嘉兴市安维信息技术有限公司软件事业部
* All rights reserved.
*
* 文件名称：com.jxanyway.aegir.model.UserDetailsModel.java
* 文件标识：
* 摘 要：用户详细信息
*
* 当前版本：1.0
* 作 者：徐国伟
* 完成日期：2013-3-1 上午1:00:20
*
* 取代版本：1.0
* 原作者 ：
* 完成日期：
*/
public class UserDetailsModel implements Serializable{

	private static final long serialVersionUID = -5207727574350740888L;
	
	private String userDetails_guid;
	private String userLogin_guid;
	private String userDetails_name;
	private String userDetails_sex;
	private Date userDetails_birthday;
	private String userDetails_phone;
	private String userDetails_mobilephone;
	private String userDetails_owner;
	private Date userDetails_createDate;
	
	
	public String getUserDetails_guid() {
		return userDetails_guid;
	}
	public void setUserDetails_guid(String userDetails_guid) {
		this.userDetails_guid = userDetails_guid;
	}
	public String getUserLogin_guid() {
		return userLogin_guid;
	}
	public void setUserLogin_guid(String userLogin_guid) {
		this.userLogin_guid = userLogin_guid;
	}
	public String getUserDetails_name() {
		return userDetails_name;
	}
	public void setUserDetails_name(String userDetails_name) {
		this.userDetails_name = userDetails_name;
	}
	public String getUserDetails_sex() {
		return userDetails_sex;
	}
	public void setUserDetails_sex(String userDetails_sex) {
		this.userDetails_sex = userDetails_sex;
	}
	public Date getUserDetails_birthday() {
		return userDetails_birthday;
	}
	public void setUserDetails_birthday(Date userDetails_birthday) {
		this.userDetails_birthday = userDetails_birthday;
	}
	public String getUserDetails_phone() {
		return userDetails_phone;
	}
	public void setUserDetails_phone(String userDetails_phone) {
		this.userDetails_phone = userDetails_phone;
	}
	public String getUserDetails_mobilephone() {
		return userDetails_mobilephone;
	}
	public void setUserDetails_mobilephone(String userDetails_mobilephone) {
		this.userDetails_mobilephone = userDetails_mobilephone;
	}
	public String getUserDetails_owner() {
		return userDetails_owner;
	}
	public void setUserDetails_owner(String userDetails_owner) {
		this.userDetails_owner = userDetails_owner;
	}
	public Date getUserDetails_createDate() {
		return userDetails_createDate;
	}
	public void setUserDetails_createDate(Date userDetails_createDate) {
		this.userDetails_createDate = userDetails_createDate;
	}
	

}
