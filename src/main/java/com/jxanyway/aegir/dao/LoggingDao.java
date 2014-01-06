package com.jxanyway.aegir.dao;

import java.util.List;

import com.jxanyway.aegir.model.LoggingModel;

/**
 * 日志管理
 * 
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author zoozkop
 */

@MyBatisRepository
public interface LoggingDao {

	/** 查询所有日志文件 */
	public List<LoggingModel> FindAllLogging();

	/** 插入日志文件 */
	public int InsertToLogging(LoggingModel loggingModel);

}
