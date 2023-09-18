/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarDao;
import car.hire.dto.CarDto;
import car.hire.entity.CarEntity;
import car.hire.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CarServiceImpl implements CarService {

    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

    public String addCar(CarDto dto) throws Exception {

        CarEntity ce = new CarEntity(dto.getCarId(),
                dto.getLicensePlate(),
                dto.getMake(),
                dto.getModel(),
                dto.getYear(),
                dto.getCategoryId(),
                dto.getDailyRentalRate(),
                dto.getAvailable());

        if (carDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

    public ArrayList<CarDto> getAllCars() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();

        ArrayList<CarEntity> carEntitys = carDao.getAll();

        for (CarEntity entity : carEntitys) {
            CarDto dto = new CarDto(entity.getCarId(),
                    entity.getLicensePlate(),
                    entity.getMake(),
                    entity.getModel(),
                    entity.getYear(),
                    entity.getCategoryId(),
                    entity.getDailyRentalRate(),
                    entity.getAvailable());

            carDtos.add(dto);
        }
        return carDtos;
    }

    public String updateCar(CarDto dto) throws Exception {
        CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

        CarEntity ce = new CarEntity(dto.getCarId(),
                dto.getLicensePlate(),
                dto.getMake(),
                dto.getModel(),
                dto.getYear(),
                dto.getCategoryId(),
                dto.getDailyRentalRate(),
                dto.getAvailable());

        if (carDao.update(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

    public CarDto getCar(String carId) throws Exception {
        CarEntity entity = carDao.get(carId);

        return new CarDto(entity.getCarId(),
                entity.getLicensePlate(),
                entity.getMake(),
                entity.getModel(),
                entity.getYear(),
                entity.getCategoryId(),
                entity.getDailyRentalRate(),
                entity.getAvailable());
    }

    @Override
    public String deleteCar(String carId) throws Exception {
        if (carDao.delete(carId)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

}
