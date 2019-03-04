package com.cheung.model;

import lombok.Data;

/**
 * @author Cheung
 */
@Data
public class Supplier extends ExportDataModel {

	private Integer id;

	private String name;

	private String number;

	public Supplier() {
	}

	public Supplier(Integer id, String name, String number) {
		this.id = id;
		this.name = name;
		this.number = number;
	}
}
