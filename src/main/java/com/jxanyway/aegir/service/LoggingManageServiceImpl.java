package com.jxanyway.aegir.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jxanyway.aegir.dao.LoggingDao;
import com.jxanyway.aegir.model.LoggingModel;

/**
 * 日志管理实现类
 * 
 * @author zoozkop
 * @version 1.0.0 2013-10-03
 */

@Service
public class LoggingManageServiceImpl implements LoggingManageService {

	final Logger logger = LoggerFactory
			.getLogger(LoggingManageServiceImpl.class);

	@Resource
	private LoggingDao loggingDao;

	public List<LoggingModel> FindAllLogging() {
		// TODO 自动生成的方法存根
		return null;
	}

	public int InsertToLogging(LoggingModel loggingModel) {
		// TODO 自动生成的方法存根
		loggingDao.InsertToLogging(loggingModel);
		return 0;
	}

}
