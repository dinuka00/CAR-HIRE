/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dto;

/**
 *
 * @author DinukaThemiya
 */
public class RentDto {
    
    private String rentalId;
    private String custId;
    private String carId;
    private String startDate;
    private String endDate;

    public RentDto() {
    }

    public RentDto(String rentalId, String custId, String carId, String startDate, String endDate) {
        this.rentalId = rentalId;
        this.custId = custId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @return the rentalId
     */
    public String getRentalId() {
        return rentalId;
    }

    /**
     * @param rentalId the rentalId to set
     */
    public void setRentalId(String rentalId) {
        this.rentalId = rentalId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
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
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RentDto{" + "rentalId=" + rentalId + ", custId=" + custId + ", carId=" + carId + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
}