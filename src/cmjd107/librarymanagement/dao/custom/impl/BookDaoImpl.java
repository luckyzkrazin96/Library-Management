/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao.custom.impl;

import cmjd107.librarymanagement.dao.CrudUtil;
import cmjd107.librarymanagement.dao.custom.BookDao;
import cmjd107.librarymanagement.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class BookDaoImpl implements BookDao {

    @Override
    public String save(BookEntity t) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO book VALUES(?,?,?,?,?)",
                t.getBookId(), t.getCategoryId(), t.getTitle(), t.getAuthor(), t.getQty());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String Update(BookEntity t) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE book SET categoryId = ?, title = ?, author = ?, qty = ? WHERE bookId =?",
                t.getCategoryId(), t.getTitle(), t.getAuthor(), t.getQty(), t.getBookId());
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String Delete(String id) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM book WHERE bookId = ?", id);
        return isDeleted ? "Success" : "Fail";
    }

    @Override
    public BookEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book WHERE bookId = ?", id);
        if (rst.next()) {
            return new BookEntity(rst.getString("BookId"), rst.getString("CategoryId"), rst.getString("Title"), rst.getString("Author"), rst.getInt("Qty"));

        }
        return null;
    }

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
        ArrayList<BookEntity> entities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book");
        while (rst.next()) {
            BookEntity entity = new BookEntity(rst.getString("BookId"), rst.getString("CategoryId"), rst.getString("Title"), rst.getString("Author"), rst.getInt("Qty"));
            entities.add(entity);
        }
        return entities;
    }

}
