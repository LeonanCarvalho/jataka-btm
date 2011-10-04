/**
 * Copyright (C) 2011 JatakaSource <support@jatakasource.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jatakasource.btm.common.event;

import org.jatakasource.btm.common.Pojo;
import org.jatakasource.btm.common.process.OsInfo;

/**
 * Base implementation for
 * {@link org.jatakasource.btm.common.event.AbstractEvent AbstractEvent} wishing
 * to log a single event.
 * <p>
 * This base class represent a single atomic event and wraps all relevant data.
 * 
 * <p>
 * Subclasses have only to create the
 * 
 * @since 0.1.0
 */
public abstract class AbstractEvent implements Pojo<Long> {
	private static final long serialVersionUID = 1079363815841039280L;

	/*
	 * If null this event is considered either parent or orphaned.
	 */
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
