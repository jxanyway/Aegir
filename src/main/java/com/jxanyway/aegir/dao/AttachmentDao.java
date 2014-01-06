package com.jxanyway.aegir.dao;

import com.jxanyway.aegir.model.AttachmentModel;

/**
 * @ClassName: AttachmentDao
 * @Description: TODO 附件管理
 *               通过@MapperScannerConfigurer扫描目录中的所有接口，方法名称必须与Mapper.xml中保持一致。
 * @author 浅语
 * @date 2013-10-13 下午12:03:46
 * 
 */
@MyBatisRepository
public interface AttachmentDao {

	/**
	 * @Title: 上传附件(图片、文件）
	 * @Description: TODO 插入附件
	 * @param @param attachmentModel
	 * @return int 返回类型
	 * @throws
	 */
	public int InsertToAttachment(AttachmentModel attachmentModel);

}
