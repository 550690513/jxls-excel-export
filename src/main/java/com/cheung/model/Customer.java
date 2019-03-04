package com.cheung.model;

import lombok.Data;

/**
 * @author Cheung
 */
@Data
public class Customer extends ExportDataModel {

	private Integer id;

	private String name;

	private String tel;

	public Customer() {
	}

	public Customer(Integer id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}
}
