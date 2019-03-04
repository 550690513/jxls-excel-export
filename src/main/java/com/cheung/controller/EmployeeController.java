package com.cheung.controller;

import com.cheung.pojo.Employee;
import com.cheung.service.EmployeeService;
import com.cheung.view.JxlsExcelView;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Cheung
 */
@Slf4j
@Controller
@RequestMapping(value = "employee")
public class EmployeeController {

	@Resource(name = "employeeService")
	private EmployeeService employeeService;

	@RequestMapping(value = "export2Excel", method = RequestMethod.GET)
	private ModelAndView export2Excel() {
		List<Employee> employees = employeeService.list();
		Map<String, Object> model = new HashMap<>();
		model.put("result", CollectionUtils.isEmpty(employees) ? new ArrayList<>(1) : employees);
		return new ModelAndView(new JxlsExcelView("/excelTemplate/export_employee_template.xls", "员工列表"), model);
	}
}
