package com.cheung.model;

import lombok.Data;

/**
 * @author Cheung
 */
@Data
public class Supplier extends ExportDataModel {

	private Integer id;

	private String name;

	private String address;

	public Supplier() {
	}

	public Supplier(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
