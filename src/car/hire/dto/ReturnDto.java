/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dto;

/**
 *
 * @author DinukaThemiya
 */
public class ReturnDto {

    private String rentId;
    private String returnDate;
    private String latefees;

    public ReturnDto() {
    }

    public ReturnDto(String rentId, String returnDate, String Latefees) {
        this.rentId = rentId;
        this.returnDate = returnDate;
        this.latefees = Latefees;
    }

    /**
     * @return the rentId
     */
    public String getRentId() {
        return rentId;
    }

    /**
     * @param rentId the rentId to set
     */
    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    /**
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the latefees
     */
    public String getLatefees() {
        return latefees;
    }

    /**
     * @param Latefees the latefees to set
     */
    public void setLatefees(String Latefees) {
        this.latefees = Latefees;
    }

    @Override
    public String toString() {
        return "ReturnDto{" + "rentId=" + rentId + ", returnDate=" + returnDate + ", Latefees=" + latefees + '}';
    }

}
