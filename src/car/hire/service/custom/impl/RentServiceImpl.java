/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.RentDao;
import car.hire.dto.RentDto;
import car.hire.entity.RentEntity;
import car.hire.service.custom.RentService;

/**
 *
 * @author DinukaThemiya
 */
public class RentServiceImpl implements RentService {

    private RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);

    public String rent(RentDto dto) throws Exception {

        //  Connection connection = DBConnection.getInstance().getConnection();
        //   connection.setAutoCommit(false);
        RentEntity re = new RentEntity(dto.getRentalId(), dto.getCustId(),
                dto.getCarId(), dto.getStartDate(), dto.getEndDate());

        if (rentDao.add(re)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }
}
