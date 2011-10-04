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
package org.jatakasource.btm.common.node;

import org.jatakasource.btm.common.Pojo;
import org.jatakasource.btm.common.agent.Agent;
import org.jatakasource.btm.common.tier.Tier;

/**
 * Defines a base class for a Datacenter Node.<br/>
 * Node can be physical or logical server running on unique port and ip.
 * 
 * @since 0.1.0
 */
public class Node implements Pojo<Long> {
	private static final long serialVersionUID = 6843037434195705996L;

	private Long id;
	/*
	 * Unique port and ip
	 */
	private NodeId nodeId;
	/*
	 * User Description
	 */
	private String description;
	/*
	 * Does this node deployed with agent collectors
	 */
	private Boolean collector = Boolean.FALSE;

	/*
	 * Logical datacenter tier (e.g Web, DB, LB)
	 */
	private Tier tier;
	/*
	 * Reported agent
	 */
	private Agent agent;
	/*
	 * Represent a client node, mostly used to represent end user browser.
	 */
	private Boolean client;
	/*
	 * Server node.
	 */
	private Boolean server;
	/*
	 * Does this node use HTTP tagging.
	 */
	private Boolean tagger = Boolean.FALSE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public NodeId getNodeId() {
		return nodeId;
	}

	public void setNodeId(NodeId nodeId) {
		this.nodeId = nodeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getCollector() {
		return collector;
	}

	public void setCollector(Boolean collector) {
		this.collector = collector;
	}

	public Tier getTier() {
		return tier;
	}

	public void setTier(Tier tier) {
		this.tier = tier;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Boolean getClient() {
		return client;
	}

	public void setClient(Boolean client) {
		this.client = client;
	}

	public Boolean getServer() {
		return server;
	}

	public void setServer(Boolean server) {
		this.server = server;
	}

	public Boolean getTagger() {
		return tagger;
	}

	public void setTagger(Boolean tagger) {
		this.tagger = tagger;
	}

}
