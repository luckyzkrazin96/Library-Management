/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao.custom.impl;

import cmjd107.librarymanagement.dao.CrudUtil;
import cmjd107.librarymanagement.dao.custom.BurrowingDao;
import cmjd107.librarymanagement.entity.BurrowingEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class BurrowingDaoImpl implements BurrowingDao {

    @Override
    public String save(BurrowingEntity t) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO burrowing VALUES (?,?,?)",
                t.getBurrowingId(), t.getMemberId(), t.getBurrowDate());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String Update(BurrowingEntity t) throws Exception {
        return null;
    }

    @Override
    public String Delete(String id) throws Exception {
        return null;
    }

    @Override
    public BurrowingEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BurrowingEntity> getAll() throws Exception {
        ArrayList<BurrowingEntity> entities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM burrowing");
        while (rst.next()) {
            BurrowingEntity entity = new BurrowingEntity(rst.getString("BurrowingId"), rst.getString("MemberId"), rst.getString("BurrowDate"));
            entities.add(entity);
        }
        return entities;
    }

    @Override
    public String getLatestId() throws Exception {
        String latestId = null;
        ResultSet rst = CrudUtil.executeQuery("SELECT burrowingId from burrowing ORDER BY burrowingId DESC LIMIT 1");
        if (rst.next()) {
            latestId = rst.getString("burrowingId");
        }

        return latestId;
    }

}
