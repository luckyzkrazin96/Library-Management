/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao.custom.impl;

import cmjd107.librarymanagement.dao.CrudUtil;
import cmjd107.librarymanagement.dao.custom.MemberDao;
import cmjd107.librarymanagement.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public String save(MemberEntity t) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO member VALUES (?,?,?,?)", t.getMemberId(), t.getName(), t.getAddress(), t.getContactNumber());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String Update(MemberEntity t) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE member SET name = ?, address = ?, contactNumber = ? WHERE memberId = ?",
                t.getName(), t.getAddress(), t.getContactNumber(), t.getMemberId());
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String Delete(String id) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM member WHERE memberId = ?", id);
        return isDeleted ? "Success" : "Fail";
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member WHERE memberId = ?", id);
        if (rst.next()) {
            return new MemberEntity(rst.getString("MemberId"), rst.getString("Name"), rst.getString("Address"), rst.getInt("ContactNumber"));
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ArrayList<MemberEntity> memberEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member");
        while (rst.next()) {
            MemberEntity entity = new MemberEntity(rst.getString("MemberId"), rst.getString("Name"), rst.getString("Address"), rst.getInt("ContactNumber"));
            memberEntities.add(entity);
        }
        return memberEntities;
    }

}
