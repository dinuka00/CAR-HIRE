/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.CarCategoryDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.CarCategoryService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CarCategoryController {

    CarCategoryService carCategoryService = (CarCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR_CATEGORY);

    public String addCategory(CarCategoryDto carCategoryDto) throws Exception {
        return carCategoryService.addCategory(carCategoryDto);
    }

    public ArrayList<CarCategoryDto> getAllCarCategories() throws Exception {
        return carCategoryService.getAllCarCategories();
    }

    public String updateCategory(CarCategoryDto carCategoryDto) throws Exception {
        return carCategoryService.updateCategory(carCategoryDto);
    }

    public CarCategoryDto getCategory(String categoryId) throws Exception {
        return carCategoryService.getCategory(categoryId);
    }

    public String deleteCategory(String categoryId) throws Exception {
        return carCategoryService.deleteCategory(categoryId);
    }

}
