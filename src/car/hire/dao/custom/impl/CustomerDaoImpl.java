/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.CrudUtil;
import car.hire.dao.custom.CustomerDao;
import car.hire.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CustomerDaoImpl implements CustomerDao {

    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customers VALUES(?,?,?,?,?,?,?,?,?)",
                t.getId(), t.getTitle(), t.getName(), t.getDob(),
                t.getPhone(), t.getAddress(), t.getCity(),
                t.getProvince(), t.getZip());
    }

    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customers SET  CustTitle=?, CustName=?, DOB=?, Phone=?, Address=?, City=?, Province=?, PostalCode=?  WHERE CustID=?",
                t.getTitle(), t.getName(), t.getDob(),
                t.getPhone(), t.getAddress(), t.getCity(),
                t.getProvince(), t.getZip(), t.getId());
    }

    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customers WHERE CustID=?", id);
    }

    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customers WHERE custID = ?", id);

        while (rst.next()) {
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            return customerEntity;
        }

        return null;

    }

    public ArrayList<CustomerEntity> getAll() throws Exception {

        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customers");

        while (rst.next()) {
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            customerEntitys.add(customerEntity);
        }
        return customerEntitys;
    }
}
