/**
 * Copyright (C) 2011 Yaniv Marom-Nachumi <support@jatakasource.org>
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
