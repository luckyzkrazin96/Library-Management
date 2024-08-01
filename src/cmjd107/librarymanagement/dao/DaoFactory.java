/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao;

import cmjd107.librarymanagement.dao.custom.impl.BookDaoImpl;
import cmjd107.librarymanagement.dao.custom.impl.BurrowingDaoImpl;
import cmjd107.librarymanagement.dao.custom.impl.BurrowingDetailDaoImpl;
import cmjd107.librarymanagement.dao.custom.impl.CategoryDaoImpl;
import cmjd107.librarymanagement.dao.custom.impl.MemberDaoImpl;
import cmjd107.librarymanagement.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author User
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {

    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case USER:
                return new UserDaoImpl();
            case MEMBER:
                return new MemberDaoImpl();
            case CATEGORY:
                return new CategoryDaoImpl();
            case BOOK:
                return new BookDaoImpl();
            case BURROWING:
                return new BurrowingDaoImpl();
            case BURROWING_DETAIL:
                return new BurrowingDetailDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        USER, MEMBER, CATEGORY, BOOK, BURROWING, BURROWING_DETAIL
    }
}
