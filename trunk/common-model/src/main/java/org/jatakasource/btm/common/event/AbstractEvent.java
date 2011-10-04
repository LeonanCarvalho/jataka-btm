package org.jatakasource.btm.common.event;

import org.jatakasource.btm.common.Pojo;
import org.jatakasource.btm.common.process.OsInfo;

public abstract class AbstractEvent implements Pojo<Long> {
	private static final long serialVersionUID = 1079363815841039280L;

	private Long parentId;

	private Process srcProces;
	private Process destProcess;
	private OsInfo osInfo;
	private ResponseInfo responseInfo;
	private RequestInfo requestInfo;

	private Integer version;

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Process getSrcProces() {
		return srcProces;
	}

	public void setSrcProces(Process srcProces) {
		this.srcProces = srcProces;
	}

	public Process getDestProcess() {
		return destProcess;
	}

	public void setDestProcess(Process destProcess) {
		this.destProcess = destProcess;
	}

	public OsInfo getOsInfo() {
		return osInfo;
	}

	public void setOsInfo(OsInfo osInfo) {
		this.osInfo = osInfo;
	}

	public ResponseInfo getResponseInfo() {
		return responseInfo;
	}

	public void setResponseInfo(ResponseInfo responseInfo) {
		this.responseInfo = responseInfo;
	}

	public RequestInfo getRequestInfo() {
		return requestInfo;
	}

	public void setRequestInfo(RequestInfo requestInfo) {
		this.requestInfo = requestInfo;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
