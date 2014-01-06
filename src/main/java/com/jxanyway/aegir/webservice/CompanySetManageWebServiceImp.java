package com.jxanyway.aegir.webservice;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import com.jxanyway.aegir.model.CompanySetModel;
import com.jxanyway.aegir.model.CustomFieldModel;
import com.jxanyway.aegir.service.CompanyManageService;

@WebService(serviceName = "CompanySetManage", endpointInterface = "com.jxanyway.aegir.webservice.CompanySetManageWebService")
public class CompanySetManageWebServiceImp implements
		CompanySetManageWebService {

	@Resource
	CompanyManageService companyManageService;

	public int InsertToCompanySet(CompanySetModel companySetModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<CustomFieldModel> FindCurrency() {
		// TODO 列出公司设置=》货币种类
		List<CustomFieldModel> CurrencyType = companyManageService
				.FindCurrency();
		return CurrencyType;
	}
}