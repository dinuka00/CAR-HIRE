/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

/**
 *
 * @author DinukaThemiya
 */
public class RentEntity {
    
    private String RentalID;
    private String CustID;
    private String CarID;
    private String StartDate;
    private String EndDate;

    public RentEntity() {
    }

    public RentEntity(String RentalID, String CustID, String CarID, String StartDate, String EndDate) {
        this.RentalID = RentalID;
        this.CustID = CustID;
        this.CarID = CarID;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    /**
     * @return the RentalID
     */
    public String getRentalID() {
        return RentalID;
    }

    /**
     * @param RentalID the RentalID to set
     */
    public void setRentalID(String RentalID) {
        this.RentalID = RentalID;
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the CarID
     */
    public String getCarID() {
        return CarID;
    }

    /**
     * @param CarID the CarID to set
     */
    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    /**
     * @return the StartDate
     */
    public String getStartDate() {
        return StartDate;
    }

    /**
     * @param StartDate the StartDate to set
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * @return the EndDate
     */
    public String getEndDate() {
        return EndDate;
    }

    /**
     * @param EndDate the EndDate to set
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    @Override
    public String toString() {
        return "RentEntity{" + "RentalID=" + RentalID + ", CustID=" + CustID + ", CarID=" + CarID + ", StartDate=" + StartDate + ", EndDate=" + EndDate + '}';
    }
    
    
    
}
