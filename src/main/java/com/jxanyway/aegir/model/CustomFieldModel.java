package com.jxanyway.aegir.model;

import java.io.Serializable;

/**
 * @ClassName: CustomFieldModel
 * @Description: TODO 自定义字段模型
 * @author 浅语
 * @date 2013-10-21 上午11:11:14
 * 
 */
public class CustomFieldModel implements Serializable {

	private static final long serialVersionUID = -8337602446864979932L;

	private String CUSTOMFIELD_GUID;
	private String CUSTOMFIELD_TYPE; // 类型，使用到的模块名
	private String CUSTOMFIELD_FIELD_1; // 自定义1
	private String CUSTOMFIELD_FIELD_2; // 自定义2
	private String CUSTOMFIELD_FIELD_3; // 自定义3

	public String getCUSTOMFIELD_GUID() {
		return CUSTOMFIELD_GUID;
	}

	public void setCUSTOMFIELD_GUID(String cUSTOMFIELD_GUID) {
		CUSTOMFIELD_GUID = cUSTOMFIELD_GUID;
	}

	public String getCUSTOMFIELD_TYPE() {
		return CUSTOMFIELD_TYPE;
	}

	public void setCUSTOMFIELD_TYPE(String cUSTOMFIELD_TYPE) {
		CUSTOMFIELD_TYPE = cUSTOMFIELD_TYPE;
	}

	public String getCUSTOMFIELD_FIELD_1() {
		return CUSTOMFIELD_FIELD_1;
	}

	public void setCUSTOMFIELD_FIELD_1(String cUSTOMFIELD_FIELD_1) {
		CUSTOMFIELD_FIELD_1 = cUSTOMFIELD_FIELD_1;
	}

	public String getCUSTOMFIELD_FIELD_2() {
		return CUSTOMFIELD_FIELD_2;
	}

	public void setCUSTOMFIELD_FIELD_2(String cUSTOMFIELD_FIELD_2) {
		CUSTOMFIELD_FIELD_2 = cUSTOMFIELD_FIELD_2;
	}

	public String getCUSTOMFIELD_FIELD_3() {
		return CUSTOMFIELD_FIELD_3;
	}

	public void setCUSTOMFIELD_FIELD_3(String cUSTOMFIELD_FIELD_3) {
		CUSTOMFIELD_FIELD_3 = cUSTOMFIELD_FIELD_3;
	}

}
