/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.CrudUtil;
import car.hire.dao.custom.RentDao;
import car.hire.entity.RentEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class RentDaoImpl implements RentDao {

    @Override
    public boolean add(RentEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO rentals VALUES(?,?,?,?,?)", t.getRentalID(),
                t.getCustID(),
                t.getCarID(),
                t.getStartDate(),
                t.getEndDate());
    }

    @Override
    public boolean update(RentEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RentEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<RentEntity> getAll() throws Exception {
        ArrayList<RentEntity> rentEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM rentals");
        
        while (rst.next()) {
            RentEntity rentEntity = new RentEntity(rst.getString(1), 
                    rst.getString(2), 
                    rst.getString(3), 
                    rst.getString(4), 
                    rst.getString(5));
            
            rentEntitys.add(rentEntity);
        }
        return rentEntitys;
    }

}
