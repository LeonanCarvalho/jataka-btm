package org.jatakasource.btm.common.event;

import org.jatakasource.btm.common.Pojo;

public class ResponseInfo implements Pojo<Long> {
	private static final long serialVersionUID = 5666848813400030615L;

	private Long id;
	private Long startTime;
	private Long overallTime;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getOverallTime() {
		return overallTime;
	}

	public void setOverallTime(Long overallTime) {
		this.overallTime = overallTime;
	}
}
