package org.jatakasource.btm.common.event;

import org.jatakasource.btm.common.Pojo;

/**
 * Defines a base class for event name.<br/>
 * Event id must be a unique hash of event name.
 * 
 * @since 0.1.0
 */
public class EventName implements Pojo<Long> {
	private static final long serialVersionUID = -2079366837453670156L;

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
