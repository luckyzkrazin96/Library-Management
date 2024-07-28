/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.service.custom.impl;

import cmjd107.librarymanagement.dao.DaoFactory;
import cmjd107.librarymanagement.dao.custom.BookDao;
import cmjd107.librarymanagement.dto.BookDto;
import cmjd107.librarymanagement.entity.BookEntity;
import cmjd107.librarymanagement.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BookServiceImpl implements BookService {

    BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto t) throws Exception {
        BookEntity entity = getBookEntity(t);
        return bookDao.save(entity);
    }

    @Override
    public String Update(BookDto t) throws Exception {
        BookEntity entity = getBookEntity(t);
        return bookDao.Update(entity);
    }

    @Override
    public String Delete(String id) throws Exception {
        return bookDao.Delete(id);
    }

    @Override
    public BookDto get(String id) throws Exception {
        BookEntity entity = bookDao.get(id);
        if (entity != null) {
            return getBookDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
        ArrayList<BookDto> dtos = new ArrayList<>();

        ArrayList<BookEntity> entities = bookDao.getAll();

        for (BookEntity entity : entities) {
            BookDto dto = getBookDto(entity);
            dtos.add(dto);
        }
        return dtos;
    }

    private BookEntity getBookEntity(BookDto t) {
        return new BookEntity(t.getBookId(), t.getCategoryId(), t.getTitle(), t.getAuthor(), t.getQty());
    }

    private BookDto getBookDto(BookEntity entity) {
        return new BookDto(entity.getBookId(), entity.getCategoryId(), entity.getTitle(), entity.getAuthor(), entity.getQty());
    }

}
