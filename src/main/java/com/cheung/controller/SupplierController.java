package com.cheung.controller;

import com.cheung.factory.ExportDataFactory;
import com.cheung.model.Supplier;
import com.cheung.service.SupplierService;
import com.cheung.util.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Cheung
 */
@Slf4j
@Controller
@RequestMapping(value = "supplier")
public class SupplierController {

	@Resource(name = "supplierService")
	private SupplierService supplierService;

	@RequestMapping(value = "export2Excel", method = RequestMethod.GET)
	private ModelAndView export2Excel() {

		List<Supplier> list = supplierService.list();

		return ExcelUtil.export(ExportDataFactory.EXPORT_SUPPLIER, list);
	}
}
