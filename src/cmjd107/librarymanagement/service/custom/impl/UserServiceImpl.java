/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.service.custom.impl;

import cmjd107.librarymanagement.dao.DaoFactory;
import cmjd107.librarymanagement.dao.custom.UserDao;
import cmjd107.librarymanagement.dto.UserDto;
import cmjd107.librarymanagement.entity.UserEntity;
import cmjd107.librarymanagement.service.custom.UserService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String save(UserDto t) throws Exception {
        UserEntity userEntity = getUserEntity(t);
        return userDao.save(userEntity);
    }

    @Override
    public String Update(UserDto t) throws Exception {
        UserEntity entity = getUserEntity(t);
        return userDao.Update(entity);
    }

    @Override
    public String Delete(String id) throws Exception {
        return userDao.Delete(id);
    }

    @Override
    public UserDto get(String id) throws Exception {
        UserEntity userEntity = userDao.get(id);
        if (userEntity != null) {
            return getUserDto(userEntity);
        }
        return null;
    }

    @Override
    public ArrayList<UserDto> getAll() throws Exception {
        ArrayList<UserDto> userDtos = new ArrayList<>();

        ArrayList<UserEntity> userEntities = userDao.getAll();

        for (UserEntity userEntity : userEntities) {
            UserDto userDto = getUserDto(userEntity);
            userDtos.add(userDto);
        }
        return userDtos;
    }

    @Override
    public UserDto getUserbyName(String name) throws Exception {
        UserEntity userEntity = userDao.getUserbyName(name);
        if (userEntity != null) {
            return getUserDto(userEntity);
        }
        return null;
    }

    private UserDto getUserDto(UserEntity userEntity) {
        UserDto userDto = new UserDto(userEntity.getUserId(), userEntity.getUserName(), userEntity.getPassword());
        return userDto;
    }

    private UserEntity getUserEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity(userDto.getUserId(), userDto.getUserName(), userDto.getPassword());
        return userEntity;
    }

    @Override
    public String getLatestId() throws Exception {
        return userDao.getLatestId();
    }
}
