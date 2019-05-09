package com.carpro.setup.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class OperationArea {

	@NotNull
	@Positive(message="Operation Area Id Should be positive")
	@Id
	private Integer operationAreaId;
	
	private String operationAreaName;

	protected OperationArea() {
		super();
	}

	public OperationArea(Integer operationAreaId, String operationAreaName) {
		super();
		this.operationAreaId = operationAreaId;
		this.operationAreaName = operationAreaName;
	}

	public Integer getOperationAreaId() {
		return operationAreaId;
	}

	public void setOperationAreaId(Integer operationAreaId) {
		this.operationAreaId = operationAreaId;
	}

	public String getOperationAreaName() {
		return operationAreaName;
	}

	public void setOperationAreaName(String operationAreaName) {
		this.operationAreaName = operationAreaName;
	}

	@Override
	public String toString() {
		return "OperationArea [operationAreaId=" + operationAreaId + ", operationAreaName=" + operationAreaName + "]";
	}
	
}
