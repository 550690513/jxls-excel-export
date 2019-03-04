package com.cheung.pojo;

import lombok.Data;

/**
 * @author Cheung
 */
@Data
public class Employee {

	private Integer id;

	private String name;

	private String number;

	public Employee() {
	}

	public Employee(Integer id, String name, String number) {
		this.id = id;
		this.name = name;
		this.number = number;
	}
}
