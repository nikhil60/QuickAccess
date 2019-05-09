package com.carpro.setup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpro.setup.exception.OperationAreaNotFoundException;
import com.carpro.setup.model.OperationArea;
import com.carpro.setup.repository.OperationAreaRepository;

@Service(value="OperationAreaService")
public class OperationAreaService implements CRUDService {

	@Autowired
	OperationAreaRepository operationAreaRepository;
	
	//public static List<OperationArea> operationAreaList = new ArrayList<OperationArea>();
	
	/*static
	{
		operationAreaList.add(new OperationArea(1,"Pune"));
		operationAreaList.add(new OperationArea(2,"Mumbai"));
		operationAreaList.add(new OperationArea(3,"Delhi"));
	}*/
	
	/* (non-Javadoc)
	 * @see com.carpro.setup.service.CRUDService#getAlloperationAreas()
	 */
	@Override
	public List<OperationArea> getAlloperationAreas()
	{
		return operationAreaRepository.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.carpro.setup.service.CRUDService#getOperationArea(java.lang.Integer)
	 */
	@Override
	public OperationArea getOperationArea(Integer operationAreaId)
	{
		Optional<OperationArea> operationArea = operationAreaRepository.findById(operationAreaId);
		if(!operationArea.isPresent())
			throw new OperationAreaNotFoundException("Operation Area Id "+operationAreaId+" Not Found");
		return operationArea.get();
	}
	
	/* (non-Javadoc)
	 * @see com.carpro.setup.service.CRUDService#saveOperationArea(com.carpro.setup.model.OperationArea)
	 */
	@Override
	public void saveOperationArea(OperationArea operationArea)
	{
		operationAreaRepository.save(operationArea);
	}
	
	/* (non-Javadoc)
	 * @see com.carpro.setup.service.CRUDService#deleteOperationArea(java.lang.Integer)
	 */
	@Override
	public void deleteOperationArea(Integer operationAreaId)
	{
		Optional<OperationArea> operationArea = operationAreaRepository.findById(operationAreaId);
		if(!operationArea.isPresent())
			throw new OperationAreaNotFoundException("Operation Area Id "+operationAreaId+" Not Found");
		operationAreaRepository.deleteById(operationAreaId);
	}
}
