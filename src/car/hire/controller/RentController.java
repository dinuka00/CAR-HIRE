/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.RentDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class RentController {
    
    private RentService rentService = (RentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENT);

    public String rent(RentDto rentDto) throws Exception {
        return rentService.rent(rentDto);
    }

    public ArrayList<RentDto> getAllRents() throws Exception{
        return rentService.getAllRents();
    }
    
}
