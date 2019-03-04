package com.cheung.controller;

import com.cheung.factory.ExportDataFactory;
import com.cheung.model.Customer;
import com.cheung.service.CustomerService;
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
@RequestMapping(value = "customer")
public class CustomerController {

	@Resource(name = "customerService")
	private CustomerService customerService;

	@RequestMapping(value = "export2Excel", method = RequestMethod.GET)
	private ModelAndView export2Excel() {

		List<Customer> list = customerService.list();

		return ExcelUtil.export(ExportDataFactory.EXPORT_CUSTOMER, list);
	}
}
