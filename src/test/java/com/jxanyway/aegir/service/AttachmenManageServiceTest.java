package com.jxanyway.aegir.service;

import java.io.File;
import java.io.FileInputStream;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jxanyway.aegir.model.AttachmentModel;

/**
 * 测试图片上传
 * 
 * @author 浅语
 * */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/applicationContext-*.xml" })
public class AttachmenManageServiceTest {

	@Resource
	AttachmentManageService attachmentManageService;

	@Before
	public void BeforeTest() {
		System.out.println("=====>开始测试:测试图片上传" + getClass());
	}

	/* 测试图片上传 */
	@Test
	public void InsertToAttachmentTest() {

		AttachmentModel attachmentModel = new AttachmentModel();
		File file = new File("F:\\updata.txt");

		byte[] bFile = new byte[(int) file.length()];
		try {
			FileInputStream fis = new FileInputStream(file);
			fis.read(bFile);
			fis.close();
			attachmentModel.setATTACHMENT_DATA(bFile);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		attachmentModel.setATTACHMENT_TYPE("图片");
		attachmentManageService.InsertToAttachment(attachmentModel);
	}

	@After
	public void AfterTest() {
		System.out.println("=====>结束测试：" + getClass());
	}

}
