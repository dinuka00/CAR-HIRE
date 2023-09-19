/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.CrudUtil;
import car.hire.dao.custom.CarDao;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DinukaThemiya
 */
public class CarDaoImpl implements CarDao {

    public boolean add(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO car VALUES(?,?,?,?,?,?,?,?)", t.getCarId(),
                t.getLicensePlate(),
                t.getMake(),
                t.getModel(),
                t.getYear(),
                t.getCategoryId(),
                t.getDailyRentalRate(),
                t.getAvailable());
    }

    public boolean update(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE car SET  CarNumber=?, Make=?, Model=?, Year=?, CategoryID=?, DailyRentalRate=?, IsAvailable=?  WHERE CarID=? ",
                t.getLicensePlate(), t.getMake(), t.getModel(),
                t.getYear(), t.getCategoryId(), t.getDailyRentalRate(), t.getAvailable(), t.getCarId());

    }

    public CarEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM car WHERE CarID = ?", id);

        while (rst.next()) {
            CarEntity carEntity = new CarEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6),
                    rst.getDouble(7),
                    rst.getString(8));

            return carEntity;
        }
        return null;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE  FROM car WHERE CarID = ? ",
                id);
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {

        ArrayList<CarEntity> carEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM car");

        while (rst.next()) {

            CarEntity carEntity = new CarEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6),
                    rst.getDouble(7),
                    rst.getString(8));

            carEntitys.add(carEntity);
        }
        return carEntitys;
    }

    
}
