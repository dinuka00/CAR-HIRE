/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;


import car.hire.dto.CustomerDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public interface CustomerService extends SuperService{
    
    String addCustomer(CustomerDto customerDto) throws Exception;
    
    ArrayList<CustomerDto> getAllCustomers() throws Exception;

    String updateCustomer(CustomerDto customerDto) throws Exception;

    CustomerDto getCustomer(String custId) throws Exception;

    String deleteCustomer(String custId) throws Exception;
    
}
