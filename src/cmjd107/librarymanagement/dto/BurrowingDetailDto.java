/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dto;

import java.util.Date;

/**
 *
 * @author User
 */
public class BurrowingDetailDto {

    private String BookId;
    private Integer qty;
    private String dueDate;
    private boolean isReturned;

    public BurrowingDetailDto() {
    }

    public BurrowingDetailDto(String BookId, Integer qty, String dueDate, boolean isReturned) {
        this.BookId = BookId;
        this.qty = qty;
        this.dueDate = dueDate;
        this.isReturned = isReturned;
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
        return "BurrowingDetailDto{" + "BookId=" + BookId + ", qty=" + qty + ", dueDate=" + dueDate + ", isReturned=" + isReturned + '}';
    }

}
