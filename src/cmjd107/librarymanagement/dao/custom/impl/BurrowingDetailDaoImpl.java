/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao.custom.impl;

import cmjd107.librarymanagement.dao.CrudUtil;
import cmjd107.librarymanagement.dao.custom.BurrowingDetailDao;
import cmjd107.librarymanagement.entity.BurrowingDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BurrowingDetailDaoImpl implements BurrowingDetailDao {

    @Override
    public String save(BurrowingDetailEntity t) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO burrowingDetail VALUES(?,?,?,?,?)", t.getBurrowingId(), t.getBookId(), t.getQty(), t.getDueDate(), t.isIsReturned());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String Update(BurrowingDetailEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Delete(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BurrowingDetailEntity get(Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<BurrowingDetailEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getLatestId() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
