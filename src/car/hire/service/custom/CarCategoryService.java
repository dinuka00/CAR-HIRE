/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.CarCategoryDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public interface CarCategoryService extends SuperService {

    String addCategory(CarCategoryDto carCategoryDto) throws Exception;

    ArrayList<CarCategoryDto> getAllCarCategories() throws Exception;

    String updateCategory(CarCategoryDto carCategoryDto) throws Exception;

    CarCategoryDto getCategory(String categoryId) throws Exception;

    String deleteCategory(String categoryId) throws Exception;

}
