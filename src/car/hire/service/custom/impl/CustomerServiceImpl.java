/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CustomerDao;
import car.hire.dto.CustomerDto;
import car.hire.entity.CustomerEntity;
import car.hire.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    public String addCustomer(CustomerDto dto) throws Exception {

        CustomerEntity ce = new CustomerEntity(dto.getId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getPhone(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());

        if (customerDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();

        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();

        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getId(),
                    entity.getTitle(),
                    entity.getName(),
                    entity.getDob(),
                    entity.getPhone(),
                    entity.getAddress(),
                    entity.getCity(),
                    entity.getProvince(),
                    entity.getZip());

            customerDtos.add(dto);

        }
        return customerDtos;
    }

    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getPhone(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());

        if (customerDao.update(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    public CustomerDto getCustomer(String custId) throws Exception {

        CustomerEntity entity = customerDao.get(custId);
        return new CustomerDto(entity.getId(),
                entity.getTitle(),
                entity.getName(),
                entity.getDob(),
                entity.getPhone(),
                entity.getAddress(),
                entity.getCity(),
                entity.getProvince(),
                entity.getZip());
    }

    public String deleteCustomer(String custId) throws Exception {
        if (customerDao.delete(custId)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

}
