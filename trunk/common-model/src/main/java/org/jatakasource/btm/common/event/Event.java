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

import org.jatakasource.btm.common.protocol.Protocol;

/**
 * Base implementation for
 * {@link org.jatakasource.btm.common.event.AbstractEvent AbstractEvent} wishing
 * to log a single event.
 * <p>
 * This base class represent a single atomic event and wraps all relevant data.
 * 
 * @since 0.1.0
 */
public class Event extends AbstractEvent {
	private static final long serialVersionUID = 2681029214025230841L;

	private Long id;
	/*
	 * Number on events on the same tree level.
	 */
	private Long descendantCount;

	/*
	 * Request attributes
	 */
	private String attributes;
	private Protocol protocol;
	private EventName eventName;
	private EventType eventType;
	private Integer treeLevel;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Long getDescendantCount() {
		return descendantCount;
	}

	public void setDescendantCount(Long descendantCount) {
		this.descendantCount = descendantCount;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public EventName getEventName() {
		return eventName;
	}

	public void setEventName(EventName eventName) {
		this.eventName = eventName;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public Integer getTreeLevel() {
		return treeLevel;
	}

	public void setTreeLevel(Integer treeLevel) {
		this.treeLevel = treeLevel;
	}
}
