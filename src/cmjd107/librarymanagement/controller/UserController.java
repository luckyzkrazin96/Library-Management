/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.controller;

import cmjd107.librarymanagement.dto.UserDto;
import cmjd107.librarymanagement.service.ServiceFactory;
import cmjd107.librarymanagement.service.custom.UserService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserController {

    UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public ArrayList<UserDto> getAllUsers() throws Exception {
        return userService.getAll();
    }

    public UserDto getUserbyName(String name) throws Exception {
        return userService.getUserbyName(name);
    }

    public String save(UserDto dto) throws Exception {
        return userService.save(dto);
    }

    public String update(UserDto dto) throws Exception {
        return userService.Update(dto);
    }

    public String delete(String id) throws Exception {
        return userService.Delete(id);
    }

    public UserDto getUserById(String id) throws Exception {
        return userService.get(id);
    }

    public String getLatestId() throws Exception {
        return userService.getLatestId();
    }
}
