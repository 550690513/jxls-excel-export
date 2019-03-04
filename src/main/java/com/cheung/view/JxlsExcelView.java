package com.cheung.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Excel view
 *
 * @author Cheung
 */
public class JxlsExcelView extends AbstractView {

	private static final String CONTENT_TYPE = "application/vnd.ms-excel";
	private String templatePath;
	private String exportFileName;

	private static final Log log = LogFactory.getLog(JxlsExcelView.class);

	public JxlsExcelView(String templatePath, String exportFileName) {
		this.templatePath = templatePath;
		if (exportFileName != null) {
			try {
				exportFileName = URLEncoder.encode(exportFileName, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				log.error("解析excel失败!");
			}
		}
		this.exportFileName = exportFileName;
	}

	@Override
	public String getContentType() {
		return CONTENT_TYPE;
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
	                                       HttpServletRequest request,
	                                       HttpServletResponse response) throws Exception {
		Context context = new Context((Map<String, Object>) model);
		response.setContentType(getContentType());
		response.setHeader("content-disposition", "attachment;filename=" + exportFileName + ".xls");
		ServletOutputStream os = response.getOutputStream();
		InputStream is = getClass().getClassLoader().getResourceAsStream(templatePath);
		JxlsHelper.getInstance().processTemplate(is, os, context);
		is.close();
	}
}
