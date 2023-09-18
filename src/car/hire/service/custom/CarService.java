/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;


import car.hire.dto.CarDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public interface CarService extends  SuperService {

    String addCar(CarDto carDto) throws Exception;
    
    ArrayList<CarDto> getAllCars() throws Exception;

    String updateCar(CarDto carDto) throws Exception;

    CarDto getCar(String carId) throws Exception;

    String deleteCar(String carId) throws Exception;
    
}
