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
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class RentServiceImpl implements RentService {

    private RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);

    public String rent(RentDto dto) throws Exception {

       
        RentEntity re = new RentEntity(dto.getRentalId(), dto.getCustId(),
                dto.getCarId(), dto.getStartDate(), dto.getEndDate());

        if (rentDao.add(re)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

    @Override
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
