/*
 * payment.java model class
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Anjalee Mendis
 */
public class Payment implements Serializable{
    private String pid;
    private double amount;
    private String pDate;

    public Payment() {
    }

    public Payment(String pid, double amount, String pDate) {
        this.pid = pid;
        this.amount = amount;
        this.pDate = pDate;
    }

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the pDate
     */
    public String getpDate() {
        return pDate;
    }

    /**
     * @param pDate the pDate to set
     */
    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    



}
