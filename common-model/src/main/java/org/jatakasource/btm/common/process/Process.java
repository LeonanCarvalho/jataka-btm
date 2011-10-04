package org.jatakasource.btm.common.process;

import org.jatakasource.btm.common.Pojo;

public class Process implements Pojo<Long> {
	private static final long serialVersionUID = -6666579418584019371L;

	private Long id;
	private String name;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
