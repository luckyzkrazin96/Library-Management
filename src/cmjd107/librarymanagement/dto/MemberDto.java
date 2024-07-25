/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dto;

/**
 *
 * @author User
 */
public class MemberDto {

    private String membetId;
    private String name;
    private String address;
    private Integer contactNumber;

    public MemberDto() {
    }

    public MemberDto(String membetId, String name, String address, Integer contactNumber) {
        this.membetId = membetId;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    /**
     * @return the membetId
     */
    public String getMembetId() {
        return membetId;
    }

    /**
     * @param membetId the membetId to set
     */
    public void setMembetId(String membetId) {
        this.membetId = membetId;
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
        return "MemberDto{" + "membetId=" + membetId + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber + '}';
    }

    

}
