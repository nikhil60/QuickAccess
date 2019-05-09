package com.carpro.setup.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carpro.setup.model.OperationArea;
import com.carpro.setup.service.CRUDService;

@RestController
public class OperationAreaController {
	
	@Autowired
	@Qualifier(value="OperationAreaService")
	CRUDService operationAreaService;

	@GetMapping(path = "/operationAreas", produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<OperationArea> getOperationAreas()
	{
		return operationAreaService.getAlloperationAreas();
	}
	
	@GetMapping(path="/operationAreas/{id}" , produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public OperationArea getOperationArea(@PathVariable("id") Integer operationAreaId)
	{
			return operationAreaService.getOperationArea(operationAreaId);		
	}
	
	@PostMapping(path="/operationAreas",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public void saveOperationArea(@Valid @RequestBody OperationArea operationArea)
	{
		operationAreaService.saveOperationArea(operationArea);
	}
	
	@DeleteMapping(path="/operationAreas/{id}")
	public void deleteOperationArea(@PathVariable("id") Integer operationAreaId)
	{
			operationAreaService.deleteOperationArea(operationAreaId);
	}
}
