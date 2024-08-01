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
    private String memberId;
    private String burrowDate;

    public BurrowingEntity() {
    }

    public BurrowingEntity(String burrowingId, String memberId, String burrowDate) {
        this.burrowingId = burrowingId;
        this.memberId = memberId;
        this.burrowDate = burrowDate;
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
    public String getBurrowDate() {
        return burrowDate;
    }

    /**
     * @param burrowDate the burrowDate to set
     */
    public void setBurrowDate(String burrowDate) {
        this.burrowDate = burrowDate;
    }

    @Override
    public String toString() {
        return "BurrowingEntity{" + "burrowingId=" + burrowingId + ", memberId=" + memberId + ", burrowDate=" + burrowDate + '}';
    }

}
