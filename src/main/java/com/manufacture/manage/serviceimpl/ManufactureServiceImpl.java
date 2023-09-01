package com.manufacture.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manufacture.manage.entity.ManufactureEntity;
import com.manufacture.manage.exception.ManufactureNotFound;
import com.manufacture.manage.mapper.ManufacturerEntityMapper;
import com.manufacture.manage.mapper.ManufacturerModelMapper;
import com.manufacture.manage.model.ManufacturerModel;
import com.manufacture.manage.repository.ManufactureRepositoty;
import com.manufacture.manage.service.ManufactureService;

@Service
public class ManufactureServiceImpl implements ManufactureService {

	@Autowired
	private ManufactureRepositoty manufacturerDao;

	@Autowired
	private ManufacturerEntityMapper manufacturerEntityMapper;

	@Autowired
	private ManufacturerModelMapper manufacturerModelMapper;

	@Override
	public void createManufacturer(ManufacturerModel manufacturerModel) {
		manufacturerDao.save(manufacturerEntityMapper.modelToManufacturerEntity(manufacturerModel));
	}

	@Override
	public void updateManufacturer(ManufacturerModel manufacturerModel) {
		manufacturerDao.save(manufacturerEntityMapper.modelToManufacturerEntity(manufacturerModel));
	}

	@Override
	public ManufacturerModel findByManufacturerId(int manufacturerId) {
		ManufacturerModel manufacturerModel;
		Optional<ManufactureEntity> manufacturerEntityOptional = manufacturerDao.findById(manufacturerId);
		if (manufacturerEntityOptional.isPresent()) {
			manufacturerModel = manufacturerModelMapper.entityToManufacturerModel(manufacturerEntityOptional.get());
		} else {
			throw new ManufactureNotFound("manufactureId evvu deepika 😒😒🤦‍♀️ --->" + manufacturerId);
		}
		return manufacturerModel;
	}

	@Override
	public void deleteByManufacturerId(int manufacturerId) {
		manufacturerDao.deleteById(manufacturerId);
	}

}
