package com.cheung.service;

import com.cheung.pojo.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cheung
 */
@Slf4j
@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> list() {
		// 模拟数据
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Elsa", "18"));
		list.add(new Employee(2, "Oleg", "25"));
		return list;
	}

}
