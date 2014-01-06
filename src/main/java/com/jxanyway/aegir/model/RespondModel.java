package com.jxanyway.aegir.model;

import java.io.Serializable;

/**
 * 返回结果类型及消息实体类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-09-29
 * 
 * */
public class RespondModel implements Serializable {

	private static final long serialVersionUID = 4852967403563580428L;

	private String respondType;
	private String respondMessage;

	public String getRespondType() {
		return respondType;
	}

	public void setRespondType(String respondType) {
		this.respondType = respondType;
	}

	public String getRespondMessage() {
		return respondMessage;
	}

	public void setRespondMessage(String respondMessage) {
		this.respondMessage = respondMessage;
	}

}
