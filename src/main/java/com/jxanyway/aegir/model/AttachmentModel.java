package com.jxanyway.aegir.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * @ClassName: AttachmentModel
 * @Description: TODO 附件实体类
 * @author 浅语
 * @date 2013-10-13 上午11:57:26
 * 
 */
public class AttachmentModel implements Serializable {

	private static final long serialVersionUID = -884852286208399532L;

	private String ATTACHMENT_GUID;
	private String ATTACHMENT_TYPE;
	private byte[] ATTACHMENT_DATA;
	private Date ATTACHMENT_DATE;

	public String getATTACHMENT_GUID() {
		return ATTACHMENT_GUID;
	}

	public void setATTACHMENT_GUID(String aTTACHMENT_GUID) {
		ATTACHMENT_GUID = aTTACHMENT_GUID;
	}

	public String getATTACHMENT_TYPE() {
		return ATTACHMENT_TYPE;
	}

	public void setATTACHMENT_TYPE(String aTTACHMENT_TYPE) {
		ATTACHMENT_TYPE = aTTACHMENT_TYPE;
	}

	public byte[] getATTACHMENT_DATA() {
		return ATTACHMENT_DATA;
	}

	public void setATTACHMENT_DATA(byte[] aTTACHMENT_DATA) {
		ATTACHMENT_DATA = aTTACHMENT_DATA;
	}

	public Date getATTACHMENT_DATE() {
		return ATTACHMENT_DATE;
	}

	public void setATTACHMENT_DATE(Date aTTACHMENT_DATE) {
		ATTACHMENT_DATE = aTTACHMENT_DATE;
	}

}
