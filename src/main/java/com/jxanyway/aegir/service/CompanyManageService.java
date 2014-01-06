package com.jxanyway.aegir.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxanyway.aegir.model.CompanySetModel;
import com.jxanyway.aegir.model.CustomFieldModel;

/**
 * 公司设置服务类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-10-12
 */
@Service
@Transactional
public interface CompanyManageService {

	/** 列出货币种类 */
	List<CustomFieldModel> FindCurrency();

	/** 插入公司设置-》公司信息 */
	int InsertToCompanySet(CompanySetModel companySetModel);

}
