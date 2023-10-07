/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarDao;
import car.hire.dao.custom.RentDao;
import car.hire.db.DBConnection;
import car.hire.dto.RentDto;
import car.hire.entity.CarEntity;
import car.hire.entity.RentEntity;
import car.hire.service.custom.RentService;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class RentServiceImpl implements RentService {

    private RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);
    private CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

    public String rent(RentDto dto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        if (rentDao.add(new RentEntity(dto.getRentalId(), dto.getCustId(),
                dto.getCarId(), dto.getStartDate(), dto.getEndDate()))) {

            CarEntity carEntity = carDao.get(dto.getCarId());
            if (carEntity != null) {
                carEntity.setAvailable("No");
                if (carDao.updateAvailability(carEntity)) {
                    connection.commit();
                    return "Success";
                } else {
                    connection.rollback();
                    return "Car Update Error";
                }
            } else {
                connection.rollback();
                return "Rent Save Error";
            }

        }
        return null;
    }

    public ArrayList<RentDto> getAllRents() throws Exception {

        ArrayList<RentDto> rentDtos = new ArrayList<>();

        ArrayList<RentEntity> rentEntitys = rentDao.getAll();

        for (RentEntity entity : rentEntitys) {

            RentDto dto = new RentDto(entity.getRentalID(),
                    entity.getCustID(),
                    entity.getCarID(),
                    entity.getStartDate(),
                    entity.getEndDate());

            rentDtos.add(dto);

        }
        return rentDtos;
    }

}
