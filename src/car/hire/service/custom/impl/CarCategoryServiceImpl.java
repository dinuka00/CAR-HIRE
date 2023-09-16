/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarCategoryDao;
import car.hire.dto.CarCategoryDto;
import car.hire.entity.CarCategoryEntity;
import car.hire.service.custom.CarCategoryService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CarCategoryServiceImpl implements CarCategoryService {
    
    CarCategoryDao carCategoryDao = (CarCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR_CATEGORY);
    
    public String addCategory(CarCategoryDto dto) throws Exception {
        
        CarCategoryEntity cce = new CarCategoryEntity(dto.getId(), dto.getName());
        
        if (carCategoryDao.add(cce)) {
            return "Successfuly added";
        } else {
            return "Fail";
        }
        
    }
    
    public ArrayList<CarCategoryDto> getAllCarCategories() throws Exception {
        
        ArrayList<CarCategoryDto> carCategoryDtos = new ArrayList<>();
        
        ArrayList<CarCategoryEntity> carCategoryEntitys = carCategoryDao.getAll();
        
        for (CarCategoryEntity entity : carCategoryEntitys) {
            
            CarCategoryDto dto = new CarCategoryDto(entity.getId(), entity.getName());
            
            carCategoryDtos.add(dto);
        }
        
        return carCategoryDtos;
    }
    
    public String updateCategory(CarCategoryDto dto) throws Exception {
        
        CarCategoryDao carCategoryDao = (CarCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR_CATEGORY);
        
        CarCategoryEntity cce = new CarCategoryEntity(dto.getId(), dto.getName());
        
        if (carCategoryDao.update(cce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }
    
    public CarCategoryDto getCategory(String categoryId) throws Exception {
        CarCategoryEntity cce = carCategoryDao.get(categoryId);
        return new CarCategoryDto(cce.getId(), cce.getName());
    }
    
    @Override
    public String deleteCategory(String categoryId) throws Exception {
        if (carCategoryDao.delete(categoryId)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }
    
}
