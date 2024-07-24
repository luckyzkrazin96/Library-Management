/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.dao;

import cmjd107.librarymanagement.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author User
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    
    public static DaoFactory getInstance(){
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case USER:
               return new UserDaoImpl();
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        USER
    }
}
