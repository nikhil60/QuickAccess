package com.carpro.setup.service;

import java.util.List;

import com.carpro.setup.model.OperationArea;

public interface CRUDService {

	List<OperationArea> getAlloperationAreas();

	OperationArea getOperationArea(Integer operationAreaId);

	void saveOperationArea(OperationArea operationArea);

	void deleteOperationArea(Integer operationAreaId);

}