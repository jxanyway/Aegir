package com.jxanyway.aegir.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jxanyway.aegir.model.AttachmentModel;

/**
 * 附件上传管理服务
 * 
 * @author zoozkop
 * @version 1.0.0 2013-10-12
 */
@Service
@Transactional
public interface AttachmentManageService {

	int InsertToAttachment(AttachmentModel attachmentModel);

}
