package com.jxanyway.aegir.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxanyway.aegir.model.CustomFieldModel;

/**
 * @ClassName: CustomFieldDao
 * @Description: TODO
 *               自定义字段管理，通过@MapperScannerConfigurer扫描目录中的所有接口，方法名称必须与Mapper.
 *               xml中保持一致。
 * @author 浅语
 * @date 2013-10-21 上午11:14:48
 * 
 */
public interface CustomFieldDao {

	/** 列出公司设置=》货币种类 */
	public List<CustomFieldModel> FindCurrency(
			@Param(value = "CUSTOMFIELD_TYPE") String CUSTOMFIELD_TYPE,
			@Param(value = "CUSTOMFIELD_FIELD_1") String CUSTOMFIELD_FIELD_1);

}
