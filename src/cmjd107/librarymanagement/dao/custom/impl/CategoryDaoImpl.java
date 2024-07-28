/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao.custom.impl;

import cmjd107.librarymanagement.dao.CrudUtil;
import cmjd107.librarymanagement.dao.custom.CategoryDao;
import cmjd107.librarymanagement.entity.CategoryEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public String save(CategoryEntity t) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO category VALUES (?,?)", t.getCategoryId(), t.getCategoryName());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String Update(CategoryEntity t) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE category SET categoryName = ? WHERE CategoryId = ?", t.getCategoryName(), t.getCategoryId());
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String Delete(String id) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM category WHERE categoryId = ?", id);
        return isDeleted ? "Success" : "Fail";
    }

    @Override
    public CategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE categoryId = ?", id);
        if (rst.next()) {
            return new CategoryEntity(rst.getString("CategoryId"), rst.getString("CategoryName"));
        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> entities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category");
        while (rst.next()) {
            CategoryEntity entity = new CategoryEntity(rst.getString("CategoryId"), rst.getString("CategoryName"));
            entities.add(entity);
        }
        return entities;
    }

    @Override
    public CategoryEntity getCategoryByName(String name) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE categoryName = ?", name);
        if (rst.next()) {
            return new CategoryEntity(rst.getString("CategoryId"), rst.getString("CategoryName"));
        }
        return null;
    }

}
