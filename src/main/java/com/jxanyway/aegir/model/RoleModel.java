package com.jxanyway.aegir.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色实体类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-17
 * 
 * */

public class RoleModel implements Serializable {

	private static final long serialVersionUID = 5011099960596952653L;

	private String ROLE_GUID;
	private String ROLE_NAMEZH;
	private String ROLE_NAMEEN;
	private String ROLE_OWNER;
	private Integer ROLE_ISACTIVE;
	private String ROLE_DESCRIBE;
	private Date ROLE_DATE;

	public String getROLE_GUID() {
		return ROLE_GUID;
	}

	public void setROLE_GUID(String rOLE_GUID) {
		ROLE_GUID = rOLE_GUID;
	}

	public String getROLE_NAMEZH() {
		return ROLE_NAMEZH;
	}

	public void setROLE_NAMEZH(String rOLE_NAMEZH) {
		ROLE_NAMEZH = rOLE_NAMEZH;
	}

	public String getROLE_NAMEEN() {
		return ROLE_NAMEEN;
	}

	public void setROLE_NAMEEN(String rOLE_NAMEEN) {
		ROLE_NAMEEN = rOLE_NAMEEN;
	}

	public String getROLE_OWNER() {
		return ROLE_OWNER;
	}

	public void setROLE_OWNER(String rOLE_OWNER) {
		ROLE_OWNER = rOLE_OWNER;
	}

	public Integer getROLE_ISACTIVE() {
		return ROLE_ISACTIVE;
	}

	public void setROLE_ISACTIVE(Integer rOLE_ISACTIVE) {
		ROLE_ISACTIVE = rOLE_ISACTIVE;
	}

	public String getROLE_DESCRIBE() {
		return ROLE_DESCRIBE;
	}

	public void setROLE_DESCRIBE(String rOLE_DESCRIBE) {
		ROLE_DESCRIBE = rOLE_DESCRIBE;
	}

	public Date getROLE_DATE() {
		return ROLE_DATE;
	}

	public void setROLE_DATE(Date rOLE_DATE) {
		ROLE_DATE = rOLE_DATE;
	}

}
