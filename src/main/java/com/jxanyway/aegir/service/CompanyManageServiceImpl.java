package com.jxanyway.aegir.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jxanyway.aegir.basic.AegirConstantService;
import com.jxanyway.aegir.dao.CompanySetDao;
import com.jxanyway.aegir.dao.CustomFieldDao;
import com.jxanyway.aegir.model.CompanySetModel;
import com.jxanyway.aegir.model.CustomFieldModel;

/**
 * 公司设置实现类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-10-12
 */
@Service
public class CompanyManageServiceImpl implements CompanyManageService {

	final Logger logger = LoggerFactory
			.getLogger(CompanyManageServiceImpl.class);

	@Resource
	CompanySetDao companySetDao;
	@Resource
	CustomFieldDao customFieldDao;
	@Resource
	LoggingManageService loggingManageService;

	public List<CustomFieldModel> FindCurrency() {
		// TODO 列出货币信息
		List<CustomFieldModel> customFieldModels = customFieldDao.FindCurrency(
				"公司设置", "货币");
		logger.debug(AegirConstantService.DEBUG_GET_CLASS_NAME + getClass());
		logger.debug(AegirConstantService.DEBUG_GET_CLASS_METHOD_NAME
				+ Thread.currentThread().getStackTrace()[1].getMethodName()
				+ "(列出货币种类)");
		return customFieldModels;
	}

	public int InsertToCompanySet(CompanySetModel companySetModel) {
		// TODO 插入公司信息
		int affectRow = companySetDao.InsertToCompanySet(companySetModel);
		logger.debug(AegirConstantService.DEBUG_GET_CLASS_NAME + getClass());
		logger.debug(AegirConstantService.DEBUG_GET_CLASS_METHOD_NAME
				+ Thread.currentThread().getStackTrace()[1].getMethodName()
				+ "(插入公司信息)");
		return affectRow;
	}

}
