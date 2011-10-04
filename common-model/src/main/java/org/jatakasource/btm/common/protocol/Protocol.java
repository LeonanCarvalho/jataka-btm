package org.jatakasource.btm.common.protocol;

import org.jatakasource.btm.common.Pojo;

public class Protocol implements Pojo<Long> {
	private static final long serialVersionUID = -2831252293428432016L;

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
