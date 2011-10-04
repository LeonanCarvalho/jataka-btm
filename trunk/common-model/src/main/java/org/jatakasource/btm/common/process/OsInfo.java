package org.jatakasource.btm.common.process;

import org.jatakasource.btm.common.Pojo;

public class OsInfo implements Pojo<Long> {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long cpuUsage;
	private Long memoryUsage;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Long getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(Long cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public Long getMemoryUsage() {
		return memoryUsage;
	}

	public void setMemoryUsage(Long memoryUsage) {
		this.memoryUsage = memoryUsage;
	}
}
