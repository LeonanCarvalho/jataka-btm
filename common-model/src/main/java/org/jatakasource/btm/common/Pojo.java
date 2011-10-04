package org.jatakasource.btm.common;

import java.io.Serializable;

public interface Pojo<ID extends Serializable> extends Serializable {

	public ID getId();

	public void setId(ID id);
}
