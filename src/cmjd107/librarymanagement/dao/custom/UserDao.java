/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cmjd107.librarymanagement.dao.custom;

import cmjd107.librarymanagement.dao.CrudDao;
import cmjd107.librarymanagement.entity.UserEntity;

/**
 *
 * @author User
 */
public interface UserDao extends CrudDao<UserEntity, String>{
    UserEntity getUserbyName(String name)throws Exception;
}
