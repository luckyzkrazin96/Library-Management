/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.entity;

/**
 *
 * @author User
 */
public class MemberEntity {

    private String memberId;
    private String name;
    private String address;
    private Integer contactNumber;

    public MemberEntity() {
    }

    public MemberEntity(String memberId, String name, String address, Integer contactNumber) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNumber
     */
    public Integer getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "MemberEntity{" + "memberId=" + memberId + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber + '}';
    }

}
