package com.jxanyway.aegir.model;

import java.io.Serializable;

public class CompanySetModel implements Serializable {

	/**
	 * 公司设置实体类
	 * 
	 * @author zoozkop
	 * @version 1.0.0 2013-09-17
	 * 
	 * */
	private static final long serialVersionUID = 3794651802911440097L;

	private String COMPANYSET_GUID;
	private String COMPANYSET_CURRENCY; // 公司货币类型
	private String COMPANYSET_TIAOMA; // 条码类型，一维码，二维码
	private String COMPANYSET_FKFDZ; // 付款方地址
	private String COMPANYSET_SHFDZ; // 收货方地址
	private Integer COMPANYSET_MRSL; // 默认税率
	private Integer COMPANYSET_SYSTEMUSERDX; // 系统用户名转换成大写
	private String COMPANYSET_PRINTDZ; // 打印上面的回信地址
	private String COMPANYSET_HOMEPAGE; // 主页地址
	private String COMPANYSET_TUBIAO; // 图标

	public String getCOMPANYSET_GUID() {
		return COMPANYSET_GUID;
	}

	public void setCOMPANYSET_GUID(String cOMPANYSET_GUID) {
		COMPANYSET_GUID = cOMPANYSET_GUID;
	}

	public String getCOMPANYSET_CURRENCY() {
		return COMPANYSET_CURRENCY;
	}

	public void setCOMPANYSET_CURRENCY(String cOMPANYSET_CURRENCY) {
		COMPANYSET_CURRENCY = cOMPANYSET_CURRENCY;
	}

	public String getCOMPANYSET_TIAOMA() {
		return COMPANYSET_TIAOMA;
	}

	public void setCOMPANYSET_TIAOMA(String cOMPANYSET_TIAOMA) {
		COMPANYSET_TIAOMA = cOMPANYSET_TIAOMA;
	}

	public String getCOMPANYSET_FKFDZ() {
		return COMPANYSET_FKFDZ;
	}

	public void setCOMPANYSET_FKFDZ(String cOMPANYSET_FKFDZ) {
		COMPANYSET_FKFDZ = cOMPANYSET_FKFDZ;
	}

	public String getCOMPANYSET_SHFDZ() {
		return COMPANYSET_SHFDZ;
	}

	public void setCOMPANYSET_SHFDZ(String cOMPANYSET_SHFDZ) {
		COMPANYSET_SHFDZ = cOMPANYSET_SHFDZ;
	}

	public Integer getCOMPANYSET_MRSL() {
		return COMPANYSET_MRSL;
	}

	public void setCOMPANYSET_MRSL(Integer cOMPANYSET_MRSL) {
		COMPANYSET_MRSL = cOMPANYSET_MRSL;
	}

	public Integer getCOMPANYSET_SYSTEMUSERDX() {
		return COMPANYSET_SYSTEMUSERDX;
	}

	public void setCOMPANYSET_SYSTEMUSERDX(Integer cOMPANYSET_SYSTEMUSERDX) {
		COMPANYSET_SYSTEMUSERDX = cOMPANYSET_SYSTEMUSERDX;
	}

	public String getCOMPANYSET_PRINTDZ() {
		return COMPANYSET_PRINTDZ;
	}

	public void setCOMPANYSET_PRINTDZ(String cOMPANYSET_PRINTDZ) {
		COMPANYSET_PRINTDZ = cOMPANYSET_PRINTDZ;
	}

	public String getCOMPANYSET_HOMEPAGE() {
		return COMPANYSET_HOMEPAGE;
	}

	public void setCOMPANYSET_HOMEPAGE(String cOMPANYSET_HOMEPAGE) {
		COMPANYSET_HOMEPAGE = cOMPANYSET_HOMEPAGE;
	}

	public String getCOMPANYSET_TUBIAO() {
		return COMPANYSET_TUBIAO;
	}

	public void setCOMPANYSET_TUBIAO(String cOMPANYSET_TUBIAO) {
		COMPANYSET_TUBIAO = cOMPANYSET_TUBIAO;
	}

}
