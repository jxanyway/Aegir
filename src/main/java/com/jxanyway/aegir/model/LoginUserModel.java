package com.jxanyway.aegir.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录用户实体类
 * 
 */

public class LoginUserModel implements Serializable {

	private static final long serialVersionUID = -3940349602616362116L;

	private String USERLOGIN_GUID;
	private String USERLOGIN_NAME;
	private String USERLOGIN_PASSWORD;
	private String USERLOGIN_GROUP;
	private String USERLOGIN_ROLES;
	private String USERLOGIN_OWNER;
	private Integer USERLOGIN_ISACTIVE;
	private String USERLOGIN_IP;
	private Date USERLOGIN_REGDATE;
	private Date USERLOGIN_LOGINDATE;
	private Integer USERLOGIN_LOGINNUMBER;

	private String loginType;
	private String loginMessages;

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getLoginMessages() {
		return loginMessages;
	}

	public void setLoginMessages(String loginMessages) {
		this.loginMessages = loginMessages;
	}

	public String getUSERLOGIN_GUID() {
		return USERLOGIN_GUID;
	}

	public void setUSERLOGIN_GUID(String uSERLOGIN_GUID) {
		USERLOGIN_GUID = uSERLOGIN_GUID;
	}

	public String getUSERLOGIN_NAME() {
		return USERLOGIN_NAME;
	}

	public void setUSERLOGIN_NAME(String uSERLOGIN_NAME) {
		USERLOGIN_NAME = uSERLOGIN_NAME;
	}

	public String getUSERLOGIN_PASSWORD() {
		return USERLOGIN_PASSWORD;
	}

	public void setUSERLOGIN_PASSWORD(String uSERLOGIN_PASSWORD) {
		USERLOGIN_PASSWORD = uSERLOGIN_PASSWORD;
	}

	public String getUSERLOGIN_GROUP() {
		return USERLOGIN_GROUP;
	}

	public void setUSERLOGIN_GROUP(String uSERLOGIN_GROUP) {
		USERLOGIN_GROUP = uSERLOGIN_GROUP;
	}

	public String getUSERLOGIN_ROLES() {
		return USERLOGIN_ROLES;
	}

	public void setUSERLOGIN_ROLES(String uSERLOGIN_ROLES) {
		USERLOGIN_ROLES = uSERLOGIN_ROLES;
	}

	public String getUSERLOGIN_OWNER() {
		return USERLOGIN_OWNER;
	}

	public void setUSERLOGIN_OWNER(String uSERLOGIN_OWNER) {
		USERLOGIN_OWNER = uSERLOGIN_OWNER;
	}

	public Integer getUSERLOGIN_ISACTIVE() {
		return USERLOGIN_ISACTIVE;
	}

	public void setUSERLOGIN_ISACTIVE(Integer uSERLOGIN_ISACTIVE) {
		USERLOGIN_ISACTIVE = uSERLOGIN_ISACTIVE;
	}

	public String getUSERLOGIN_IP() {
		return USERLOGIN_IP;
	}

	public void setUSERLOGIN_IP(String uSERLOGIN_IP) {
		USERLOGIN_IP = uSERLOGIN_IP;
	}

	public Date getUSERLOGIN_REGDATE() {
		return USERLOGIN_REGDATE;
	}

	public void setUSERLOGIN_REGDATE(Date uSERLOGIN_REGDATE) {
		USERLOGIN_REGDATE = uSERLOGIN_REGDATE;
	}

	public Date getUSERLOGIN_LOGINDATE() {
		return USERLOGIN_LOGINDATE;
	}

	public void setUSERLOGIN_LOGINDATE(Date uSERLOGIN_LOGINDATE) {
		USERLOGIN_LOGINDATE = uSERLOGIN_LOGINDATE;
	}

	public Integer getUSERLOGIN_LOGINNUMBER() {
		return USERLOGIN_LOGINNUMBER;
	}

	public void setUSERLOGIN_LOGINNUMBER(Integer uSERLOGIN_LOGINNUMBER) {
		USERLOGIN_LOGINNUMBER = uSERLOGIN_LOGINNUMBER;
	}
}
