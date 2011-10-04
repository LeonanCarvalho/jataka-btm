package org.jatakasource.btm.common.node;

/**
 * Unique port and ip
 */
public class NodeId {
	private String ip;
	private Integer port;

	public NodeId(String ip, Integer port) {
		super();
		this.ip = ip;
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
