/*
 * Cab.java model class
package model;

import java.io.Serializable;

/**
 *
 * @author Anjalee Mendis
 */
public class Cab implements Serializable{
    private String cid;
    private String cabno;
    private String category;

    public Cab() {
    }

    public Cab(String cid, String cabno, String category) {
        this.cid = cid;
        this.cabno = cabno;
        this.category = category;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the cabno
     */
    public String getCabno() {
        return cabno;
    }

    /**
     * @param cabno the cabno to set
     */
    public void setCabno(String cabno) {
        this.cabno = cabno;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    
}
