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
public class BurrowingEntity {

    private String burrowingId;
    private String bookId;
    private String memberId;
    private Date burrowDate;
    private Date dueDate;

    public BurrowingEntity() {
    }

    public BurrowingEntity(String burrowingId, String bookId, String memberId, Date burrowDate, Date dueDate) {
        this.burrowingId = burrowingId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.burrowDate = burrowDate;
        this.dueDate = dueDate;
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
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the burrowDate
     */
    public Date getBurrowDate() {
        return burrowDate;
    }

    /**
     * @param burrowDate the burrowDate to set
     */
    public void setBurrowDate(Date burrowDate) {
        this.burrowDate = burrowDate;
    }

    /**
     * @return the dueDate
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "BurrowingEntity{" + "burrowingId=" + burrowingId + ", bookId=" + bookId + ", memberId=" + memberId + ", burrowDate=" + burrowDate + ", dueDate=" + dueDate + '}';
    }
    
    

}
