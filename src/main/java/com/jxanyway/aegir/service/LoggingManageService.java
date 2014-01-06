package com.jxanyway.aegir.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxanyway.aegir.model.LoggingModel;

/**
 * 统一项目：日志管理 ：Debug 信息控制台输出
 * 
 * @author zoozkop
 * @version 1.0.0 2013-10-03
 */

@Service
@Transactional
public interface LoggingManageService {

	/** 查询所有日志文件 */
	public List<LoggingModel> FindAllLogging();

	/** 插入日志文件 */
	public int InsertToLogging(LoggingModel loggingModel);

}
