/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.RentDto;
import car.hire.service.SuperService;

/**
 *
 * @author DinukaThemiya
 */
public interface RentService extends SuperService{
    
    String rent(RentDto dto) throws Exception;
}
