package com.cheung.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据导出 model
 *
 * @author Cheung
 */
@Data
public class ExportDataModel {

	/**
	 * 导出模板路径
	 */
	private String eTemplatePath;

	/**
	 * 导出文件名
	 */
	private String eFileName;

	/**
	 * 导出数据源
	 */
	protected Map<String, Object> eResult = new HashMap<>();

}
