/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dto;

/**
 *
 * @author DinukaThemiya
 */
public class CarDto {

    private String carId;
    private String licensePlate;
    private String make;
    private String model;
    private Integer year;
    private String categoryId;
    private Double dailyRentalRate;
    private String available;

    public CarDto() {
    }

    public CarDto(String carId, String licensePlate, String make, String model, Integer year, String categoryId, Double dailyRentalRate, String available) {
        this.carId = carId;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.categoryId = categoryId;
        this.dailyRentalRate = dailyRentalRate;
        this.available = available;
    }

    /**
     * @return the carId
     */
    public String getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the dailyRentalRate
     */
    public Double getDailyRentalRate() {
        return dailyRentalRate;
    }

    /**
     * @param dailyRentalRate the dailyRentalRate to set
     */
    public void setDailyRentalRate(Double dailyRentalRate) {
        this.dailyRentalRate = dailyRentalRate;
    }

    /**
     * @return the available
     */
    public String getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "CarDto{" + "carId=" + carId + ", licensePlate=" + licensePlate + ", make=" + make + ", model=" + model + ", year=" + year + ", categoryId=" + categoryId + ", dailyRentalRate=" + dailyRentalRate + ", available=" + available + '}';
    }

   
    

}
