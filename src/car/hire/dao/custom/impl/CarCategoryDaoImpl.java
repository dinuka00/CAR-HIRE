/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.CrudUtil;
import car.hire.dao.custom.CarCategoryDao;
import car.hire.entity.CarCategoryEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CarCategoryDaoImpl implements CarCategoryDao {

    @Override
    public boolean add(CarCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO carcategories VALUES(?,?)", t.getId(), t.getName());
    }

    @Override
    public boolean update(CarCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE carcategories SET  CategoryName=? WHERE CategoryID=? ", t.getName(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
         return  CrudUtil.executeUpdate("DELETE FROM carcategories WHERE CategoryID=?", id);
    
    }

    public CarCategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM carcategories WHERE CategoryID=?", id);

        while (rst.next()) {
            CarCategoryEntity carCategoryEntity = new CarCategoryEntity(rst.getString(1),
                    rst.getString(2));

            return carCategoryEntity;
        }
        return null;

    }

    public ArrayList<CarCategoryEntity> getAll() throws Exception {
        ArrayList<CarCategoryEntity> carCategoryEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM CarCategories");

        while (rst.next()) {
            CarCategoryEntity carCategoryEntity = new CarCategoryEntity(rst.getString(1), rst.getString(2));

            carCategoryEntitys.add(carCategoryEntity);
        }

        return carCategoryEntitys;

    }

}
