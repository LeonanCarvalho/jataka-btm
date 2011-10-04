package org.jatakasource.btm.common.event;

import org.jatakasource.btm.common.Pojo;

public class RequestInfo implements Pojo<Long> {
	private static final long serialVersionUID = 3773081583245580093L;

	private Long id;
	private Long sentBytes;
	private Long receivedBytes;
	private String parameters;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Long getReceivedBytes() {
		return receivedBytes;
	}

	public void setReceivedBytes(Long receivedBytes) {
		this.receivedBytes = receivedBytes;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public Long getSentBytes() {
		return sentBytes;
	}

	public void setSentBytes(Long sentBytes) {
		this.sentBytes = sentBytes;
	}
}
