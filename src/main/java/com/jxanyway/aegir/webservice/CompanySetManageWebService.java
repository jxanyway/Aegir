package com.jxanyway.aegir.webservice;

import java.util.List;

import javax.jws.WebService;

import com.jxanyway.aegir.model.CompanySetModel;
import com.jxanyway.aegir.model.CustomFieldModel;

/**
 * @ClassName: CompanySetManageWebService
 * @Description: TODO 公司设置服务类,使用JAX-WS2.0
 *               annotation设置WSDL中的定义。使用WSResult及其子类类包裹返回结果.
 *               使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响。
 * @author 浅语
 * @date 2013-10-21 下午12:08:18
 * 
 */
@WebService
public interface CompanySetManageWebService {

	/** 公司设置-》插入公司信息 */
	int InsertToCompanySet(CompanySetModel companySetModel);

	/** 列出公司设置=》货币种类 */
	List<CustomFieldModel> FindCurrency();

}
