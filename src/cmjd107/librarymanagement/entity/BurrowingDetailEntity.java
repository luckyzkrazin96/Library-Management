/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.entity;

import java.util.Date;

/**
 *
 * @author User
 */
public class BurrowingDetailEntity {

    private String burrowingId;
    private String BookId;
    private Integer qty;
    private String dueDate;
    private boolean isReturned;

    public BurrowingDetailEntity() {
    }

    public BurrowingDetailEntity(String burrowingId, String BookId, Integer qty, String dueDate, boolean isReturned) {
        this.burrowingId = burrowingId;
        this.BookId = BookId;
        this.qty = qty;
        this.dueDate = dueDate;
        this.isReturned = isReturned;
    }

    /**
     * @return the burrowingId
     */
    public String getBurrowingId() {
        return burrowingId;
    }

    /**
     * @param burrowingId the burrowingId to set
     */
    public void setBurrowingId(String burrowingId) {
        this.burrowingId = burrowingId;
    }

    /**
     * @return the BookId
     */
    public String getBookId() {
        return BookId;
    }

    /**
     * @param BookId the BookId to set
     */
    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the isReturned
     */
    public boolean isIsReturned() {
        return isReturned;
    }

    /**
     * @param isReturned the isReturned to set
     */
    public void setIsReturned(boolean isReturned) {
        this.isReturned = isReturned;
    }

    @Override
    public String toString() {
        return "BurrowingDetailEntity{" + "burrowingId=" + burrowingId + ", BookId=" + BookId + ", qty=" + qty + ", dueDate=" + dueDate + ", isReturned=" + isReturned + '}';
    }

}
