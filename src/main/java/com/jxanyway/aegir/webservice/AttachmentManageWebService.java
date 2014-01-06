package com.jxanyway.aegir.webservice;

import javax.jws.WebService;

/**
 * @ClassName: AttachmentManageWebService
 * @Description: TODO 附件上传管理
 * @author 浅语
 * @date 2013-10-14 上午10:31:56
 * 
 */
@WebService
public interface AttachmentManageWebService {

	/**
	 * @Title: UpLoadFile
	 * @Description: TODO 上传附件并将附件存入数据库中
	 * @param @param attachmentModel
	 * @return int 返回类型
	 * @throws
	 */
	int uploadFile();
}
