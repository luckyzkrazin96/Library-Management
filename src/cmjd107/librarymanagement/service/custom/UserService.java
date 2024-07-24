/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cmjd107.librarymanagement.service.custom;

import cmjd107.librarymanagement.dto.UserDto;
import cmjd107.librarymanagement.service.CrudService;
import cmjd107.librarymanagement.service.SuperService;

/**
 *
 * @author User
 */
public interface UserService extends CrudService<UserDto, String> {
    UserDto getUserbyName(String name) throws Exception;
}
