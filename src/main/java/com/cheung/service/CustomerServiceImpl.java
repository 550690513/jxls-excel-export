package com.cheung.service;

import com.cheung.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cheung
 */
@Slf4j
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> list() {
		// 模拟数据
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1, "Elsa", "13811112222"));
		list.add(new Customer(2, "Oleg", "15266661234"));
		return list;
	}

}
