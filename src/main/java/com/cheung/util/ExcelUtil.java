package com.cheung.util;

import com.cheung.factory.ExportDataFactory;
import com.cheung.model.ExportDataModel;
import com.cheung.view.JxlsExcelView;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Excel 工具类
 *
 * @author Cheung
 */
@Slf4j
public class ExcelUtil {

	public static ModelAndView export(String beanSymbol, List<? extends ExportDataModel> list) {

		if (StringUtils.isBlank(beanSymbol)) {
			log.error("export error, beanSymbol is blank");
			return null;
		}

		// view
		ExportDataModel bean = ExportDataFactory.getBean(beanSymbol);
		JxlsExcelView view = new JxlsExcelView(bean.getETemplatePath(), bean.getEFileName());

		// model
		HashMap<String, List<? extends ExportDataModel>> model = new HashMap<>(1);
		model.put("result", CollectionUtils.isEmpty(list) ? new ArrayList<>(1) : list);

		return new ModelAndView(view, model);
	}

}
