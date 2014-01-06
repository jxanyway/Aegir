package com.jxanyway.aegir.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jxanyway.aegir.basic.AegirConstantService;
import com.jxanyway.aegir.dao.AttachmentDao;
import com.jxanyway.aegir.model.AttachmentModel;

/**
 * @ClassName: AttachmentManageServiceImpl
 * @Description: TODO 附件管理服务实现类
 * @author 浅语
 * @date 2013-10-13 下午1:17:39
 * 
 */
@Service
public class AttachmentManageServiceImpl implements AttachmentManageService {

	final Logger logger = LoggerFactory
			.getLogger(AttachmentManageServiceImpl.class);

	@Resource
	AttachmentDao attachmentDao;

	public int InsertToAttachment(AttachmentModel attachmentModel) {
		// TODO 上传附件（图片、文件）
		int affectRow = attachmentDao.InsertToAttachment(attachmentModel);
		logger.debug(AegirConstantService.DEBUG_GET_CLASS_NAME + getClass());
		logger.debug(AegirConstantService.DEBUG_GET_CLASS_METHOD_NAME
				+ Thread.currentThread().getStackTrace()[1].getMethodName()
				+ "(插入附件)");
		return affectRow;
	}
}
