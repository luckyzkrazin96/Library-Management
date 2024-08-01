/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.controller;

import cmjd107.librarymanagement.dto.BookDto;
import cmjd107.librarymanagement.service.ServiceFactory;
import cmjd107.librarymanagement.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BookController {

    BookService bookService = (BookService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);

    public String save(BookDto bookDto) throws Exception {
        return bookService.save(bookDto);
    }

    public String update(BookDto dto) throws Exception {
        return bookService.Update(dto);
    }

    public String delete(String id) throws Exception {
        return bookService.Delete(id);
    }

    public BookDto getBookById(String id) throws Exception {
        return bookService.get(id);
    }

    public ArrayList<BookDto> getAllBooks() throws Exception {
        return bookService.getAll();
    }

    public String getLatestId() throws Exception {
        return bookService.getLatestId();
    }
}
