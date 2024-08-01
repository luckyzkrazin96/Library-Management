/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class BurrowingDto {

    private String burrowingId;
    private String memberId;
    private String burrowDate;

    private ArrayList<BurrowingDetailDto> burrowingDetailDtos;

    public BurrowingDto() {
    }

    public BurrowingDto(String burrowingId, String memberId, String burrowDate, ArrayList<BurrowingDetailDto> burrowingDetailDtos) {
        this.burrowingId = burrowingId;
        this.memberId = memberId;
        this.burrowDate = burrowDate;
        this.burrowingDetailDtos = burrowingDetailDtos;
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

    /**
     * @return the burrowingDetailDtos
     */
    public ArrayList<BurrowingDetailDto> getBurrowingDetailDtos() {
        return burrowingDetailDtos;
    }

    /**
     * @param burrowingDetailDtos the burrowingDetailDtos to set
     */
    public void setBurrowingDetailDtos(ArrayList<BurrowingDetailDto> burrowingDetailDtos) {
        this.burrowingDetailDtos = burrowingDetailDtos;
    }

    @Override
    public String toString() {
        return "BurrowingDto{" + "burrowingId=" + burrowingId + ", memberId=" + memberId + ", burrowDate=" + burrowDate + ", burrowingDetailDtos=" + burrowingDetailDtos + '}';
    }

    
}
