package com.cheung.factory;

import com.cheung.model.Customer;
import com.cheung.model.ExportDataModel;
import com.cheung.model.Supplier;
import lombok.extern.slf4j.Slf4j;

/**
 * 数据导出 工厂类
 *
 * @author Cheung
 */
@Slf4j
public class ExportDataFactory {

	public static final String EXPORT_CUSTOMER = "customer";
	public static final String EXPORT_SUPPLIER = "supplier";


	public static ExportDataModel getBean(String beanSymbol) {
		log.info("getBean beanSymbol = {}", beanSymbol);
		ExportDataModel exportDataModel = null;
		switch (beanSymbol) {
			case EXPORT_CUSTOMER:
				exportDataModel = new Customer();
				exportDataModel.setETemplatePath("/excelTemplate/export_list_customer.xls");
				exportDataModel.setEFileName("客户列表");
				break;
			case EXPORT_SUPPLIER:
				exportDataModel = new Supplier();
				exportDataModel.setETemplatePath("/excelTemplate/export_list_supplier.xls");
				exportDataModel.setEFileName("供应商列表");
				break;
			default:
				log.error("getBean error!");
				break;
		}
		return exportDataModel;
	}

}
