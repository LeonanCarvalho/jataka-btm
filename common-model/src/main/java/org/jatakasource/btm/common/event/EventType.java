package org.jatakasource.btm.common.event;

import org.jatakasource.btm.common.Pojo;
import org.jatakasource.btm.common.application.Application;

public class EventType implements Pojo<Long> {
	private static final long serialVersionUID = 8766200568740898584L;

	private Long id;

	private EventName name;
	private String description;
	private Long timestamp;
	private Application application;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;

	}

	public EventName getName() {
		return name;
	}

	public void setName(EventName name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}
}
