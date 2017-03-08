/*
 * ReservationDetails.java model class
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Anjalee Mendis
 */
public class ReservationDetails implements Serializable{
    private String rid;
    private String date;
    private double meter;

    public ReservationDetails() {
    }

    public ReservationDetails(String rid, String date, double meter) {
        this.rid = rid;
        this.date = date;
        this.meter = meter;
    }

    /**
     * @return the rid
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the meter
     */
    public double getMeter() {
        return meter;
    }

    /**
     * @param meter the meter to set
     */
    public void setMeter(double meter) {
        this.meter = meter;
    }
    
    
}
