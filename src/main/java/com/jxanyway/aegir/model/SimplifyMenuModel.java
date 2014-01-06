package com.jxanyway.aegir.model;

import java.io.Serializable;

/**
 * 左侧菜单简单实体类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-20
 * 
 */
public class SimplifyMenuModel implements Serializable {

	private static final long serialVersionUID = -4479160705633471046L;

	private String SIMPLIFYMENU_GUID;
	private String SIMPLIFYMENU_MENUID;
	private String SIMPLIFYMENU_NAMEZH;
	private String SIMPLIFYMENU_NAMEEN;
	private String SIMPLIFYMENU_PARENTID;
	private String SIMPLIFYMENU_OWNET;
	private Integer SIMPLIFYMENU_ISACTIVE;

	public String getSIMPLIFYMENU_GUID() {
		return SIMPLIFYMENU_GUID;
	}

	public void setSIMPLIFYMENU_GUID(String sIMPLIFYMENU_GUID) {
		SIMPLIFYMENU_GUID = sIMPLIFYMENU_GUID;
	}

	public String getSIMPLIFYMENU_MENUID() {
		return SIMPLIFYMENU_MENUID;
	}

	public void setSIMPLIFYMENU_MENUID(String sIMPLIFYMENU_MENUID) {
		SIMPLIFYMENU_MENUID = sIMPLIFYMENU_MENUID;
	}

	public String getSIMPLIFYMENU_NAMEZH() {
		return SIMPLIFYMENU_NAMEZH;
	}

	public void setSIMPLIFYMENU_NAMEZH(String sIMPLIFYMENU_NAMEZH) {
		SIMPLIFYMENU_NAMEZH = sIMPLIFYMENU_NAMEZH;
	}

	public String getSIMPLIFYMENU_NAMEEN() {
		return SIMPLIFYMENU_NAMEEN;
	}

	public void setSIMPLIFYMENU_NAMEEN(String sIMPLIFYMENU_NAMEEN) {
		SIMPLIFYMENU_NAMEEN = sIMPLIFYMENU_NAMEEN;
	}

	public String getSIMPLIFYMENU_PARENTID() {
		return SIMPLIFYMENU_PARENTID;
	}

	public void setSIMPLIFYMENU_PARENTID(String sIMPLIFYMENU_PARENTID) {
		SIMPLIFYMENU_PARENTID = sIMPLIFYMENU_PARENTID;
	}

	public String getSIMPLIFYMENU_OWNET() {
		return SIMPLIFYMENU_OWNET;
	}

	public void setSIMPLIFYMENU_OWNET(String sIMPLIFYMENU_OWNET) {
		SIMPLIFYMENU_OWNET = sIMPLIFYMENU_OWNET;
	}

	public Integer getSIMPLIFYMENU_ISACTIVE() {
		return SIMPLIFYMENU_ISACTIVE;
	}

	public void setSIMPLIFYMENU_ISACTIVE(Integer sIMPLIFYMENU_ISACTIVE) {
		SIMPLIFYMENU_ISACTIVE = sIMPLIFYMENU_ISACTIVE;
	}

}
