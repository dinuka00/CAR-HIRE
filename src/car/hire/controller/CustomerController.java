/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.CustomerDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getAllCustomers();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String text) throws Exception {
        return customerService.deleteCustomer(text);
    }

    public CustomerDto getCustomer(String custId) throws Exception {
        return customerService.getCustomer(custId);

    }
}
