package com.jxanyway.aegir.model;

import java.io.Serializable;

import oracle.sql.DATE;

/**
 * 日志实体类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-10-03
 * 
 * */
public class LoggingModel implements Serializable {

	private static final long serialVersionUID = -1226460059991544652L;

	private String LOGGING_GUID;
	private String LOGGING_USERNAME;
	private String LOGGING_NUMBER;
	private String LOGGING_TYPE;
	private String LOGGING_ACTION;
	private String LOGGING_TARGET;
	private String LOGGING_WANIP;
	private String LOGGING_LANIP;
	private String LOGGING_MAC;
	private DATE LOGGING_TIME;
	private String LOGGING_NOTE;

	public String getLOGGING_GUID() {
		return LOGGING_GUID;
	}

	public void setLOGGING_GUID(String lOGGING_GUID) {
		LOGGING_GUID = lOGGING_GUID;
	}

	public String getLOGGING_USERNAME() {
		return LOGGING_USERNAME;
	}

	public void setLOGGING_USERNAME(String lOGGING_USERNAME) {
		LOGGING_USERNAME = lOGGING_USERNAME;
	}

	public String getLOGGING_NUMBER() {
		return LOGGING_NUMBER;
	}

	public void setLOGGING_NUMBER(String lOGGING_NUMBER) {
		LOGGING_NUMBER = lOGGING_NUMBER;
	}

	public String getLOGGING_TYPE() {
		return LOGGING_TYPE;
	}

	public void setLOGGING_TYPE(String lOGGING_TYPE) {
		LOGGING_TYPE = lOGGING_TYPE;
	}

	public String getLOGGING_ACTION() {
		return LOGGING_ACTION;
	}

	public void setLOGGING_ACTION(String lOGGING_ACTION) {
		LOGGING_ACTION = lOGGING_ACTION;
	}

	public String getLOGGING_TARGET() {
		return LOGGING_TARGET;
	}

	public void setLOGGING_TARGET(String lOGGING_TARGET) {
		LOGGING_TARGET = lOGGING_TARGET;
	}

	public String getLOGGING_WANIP() {
		return LOGGING_WANIP;
	}

	public void setLOGGING_WANIP(String lOGGING_WANIP) {
		LOGGING_WANIP = lOGGING_WANIP;
	}

	public String getLOGGING_LANIP() {
		return LOGGING_LANIP;
	}

	public void setLOGGING_LANIP(String lOGGING_LANIP) {
		LOGGING_LANIP = lOGGING_LANIP;
	}

	public String getLOGGING_MAC() {
		return LOGGING_MAC;
	}

	public void setLOGGING_MAC(String lOGGING_MAC) {
		LOGGING_MAC = lOGGING_MAC;
	}

	public DATE getLOGGING_TIME() {
		return LOGGING_TIME;
	}

	public void setLOGGING_TIME(DATE lOGGING_TIME) {
		LOGGING_TIME = lOGGING_TIME;
	}

	public String getLOGGING_NOTE() {
		return LOGGING_NOTE;
	}

	public void setLOGGING_NOTE(String lOGGING_NOTE) {
		LOGGING_NOTE = lOGGING_NOTE;
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "\nLOGGING_GUID=>" + LOGGING_GUID + "\t\nLOGGING_USERNAME=>"
				+ LOGGING_USERNAME + "\t\nLOGGING_NUMBER=>" + LOGGING_NUMBER
				+ "\t\nLOGGING_TYPE=>" + LOGGING_TYPE + "\t\nLOGGING_ACTION=>"
				+ LOGGING_ACTION + "\t\nLOGGING_TARGET=>" + LOGGING_TARGET
				+ "\t\nLOGGING_WANIP=>" + LOGGING_WANIP + "\t\nLOGGING_LANIP=>"
				+ LOGGING_LANIP + "\t\nLOGGING_MAC=>" + LOGGING_MAC
				+ "\t\nLOGGING_TIME=>" + LOGGING_TIME + "\t\nLOGGING_NOTE=>"
				+ LOGGING_NOTE;
	}
}
