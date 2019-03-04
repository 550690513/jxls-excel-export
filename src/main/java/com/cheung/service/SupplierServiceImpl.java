package com.cheung.service;

import com.cheung.model.Supplier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cheung
 */
@Slf4j
@Service(value = "supplierService")
public class SupplierServiceImpl implements SupplierService {

	@Override
	public List<Supplier> list() {
		// 模拟数据
		List<Supplier> list = new ArrayList<>();
		list.add(new Supplier(1, "供应商1", "北京市海淀区西二旗"));
		list.add(new Supplier(2, "供应商2", "浙江省杭州市余杭区"));
		return list;
	}

}
