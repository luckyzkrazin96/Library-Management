/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.service.custom.impl;

import cmjd107.librarymanagement.dao.DaoFactory;
import cmjd107.librarymanagement.dao.custom.BookDao;
import cmjd107.librarymanagement.dao.custom.BurrowingDao;
import cmjd107.librarymanagement.dao.custom.BurrowingDetailDao;
import cmjd107.librarymanagement.db.DBConnection;
import cmjd107.librarymanagement.dto.BurrowingDetailDto;
import cmjd107.librarymanagement.dto.BurrowingDto;
import cmjd107.librarymanagement.entity.BookEntity;
import cmjd107.librarymanagement.entity.BurrowingDetailEntity;
import cmjd107.librarymanagement.entity.BurrowingEntity;
import cmjd107.librarymanagement.service.custom.BurrowingService;
import java.util.ArrayList;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class BurrowingServiceImpl implements BurrowingService {

    BurrowingDao burrowingDao = (BurrowingDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BURROWING);
    BurrowingDetailDao burrowingDetaildao = (BurrowingDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BURROWING_DETAIL);
    BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BurrowingDto t) throws Exception {
        return null;
    }

    @Override
    public String Update(BurrowingDto t) throws Exception {
        return null;
    }

    @Override
    public String Delete(String id) throws Exception {
        return null;
    }

    @Override
    public BurrowingDto get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<BurrowingDto> getAll() throws Exception {
        return null;
    }

    @Override
    public String getLatestId() throws Exception {
        return burrowingDao.getLatestId();
    }

    @Override
    public String makeBurrowing(BurrowingDto burrowingDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);

            BurrowingEntity burrowingEntity = new BurrowingEntity(burrowingDto.getBurrowingId(), burrowingDto.getMemberId(), burrowingDto.getBurrowDate());
            String resp = burrowingDao.save(burrowingEntity);
            if (resp.equals("Success")) {
                boolean isBurrowingDetailSave = true;
                for (BurrowingDetailDto burrowingDetailDto : burrowingDto.getBurrowingDetailDtos()) {
                    BurrowingDetailEntity burrowingDetailEntity = new BurrowingDetailEntity(burrowingDto.getBurrowingId(),
                            burrowingDetailDto.getBookId(), burrowingDetailDto.getQty(), burrowingDetailDto.getDueDate(), burrowingDetailDto.isIsReturned());
                    String bdResp = burrowingDetaildao.save(burrowingDetailEntity);
                    if (!bdResp.equals("Success")) {
                        isBurrowingDetailSave = false;
                    }
                }

                if (isBurrowingDetailSave) {
                    boolean isBookUpdate = true;
                    for (BurrowingDetailDto burrowingDetailDto : burrowingDto.getBurrowingDetailDtos()) {
                        BookEntity bookEntity = bookDao.get(burrowingDetailDto.getBookId());
                        bookEntity.setQty(bookEntity.getQty() - burrowingDetailDto.getQty());
                        String bookResp = bookDao.Update(bookEntity);
                        if (!bookResp.equals("Success")) {
                            isBookUpdate = false;
                        }
                    }

                    if (isBookUpdate) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Book update Error";
                    }
                } else {
                    connection.rollback();
                    return "Burrowing Detail Save error";
                }
            } else {
                connection.rollback();
                return "Burrowing save error";
            }
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return "Server Error";
        } finally {
            connection.setAutoCommit(true);
        }
    }

}
