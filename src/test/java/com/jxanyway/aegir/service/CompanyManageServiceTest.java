package com.jxanyway.aegir.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jxanyway.aegir.model.CompanySetModel;
import com.jxanyway.aegir.model.CustomFieldModel;

/**
 * 测试公司设置=》公司信息插入数据
 * 
 * @author 浅语
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/applicationContext-*.xml" })
public class CompanyManageServiceTest {

	@Resource
	public CompanyManageService companyManageService;

	@Before
	public void BeforeTest() {
		System.out.println("=====>开始测试:公司设置" + getClass());
	}

	/** 测试公司设置=》插入公司信息 */
	public void InsertToCompanySet() {
		CompanySetModel csm = new CompanySetModel();

		csm.setCOMPANYSET_CURRENCY("CNY");
		csm.setCOMPANYSET_SHFDZ("收货地址");
		csm.setCOMPANYSET_TUBIAO("GUID");
		int rows = companyManageService.InsertToCompanySet(csm);
		System.out.println("======>影响行数：" + rows);
	}

	/** 测试公司设置=》列出货币种类 */
	@Test
	public void FindCurrency() {
		List<CustomFieldModel> customFieldModels = companyManageService
				.FindCurrency();
		for (CustomFieldModel customFieldModel : customFieldModels) {
			System.out.println(customFieldModel.getCUSTOMFIELD_FIELD_3());
		}
	}

	@After
	public void AfterTest() {
		System.out.println("=====>结束测试：" + getClass());
	}
}
