/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.service.custom.impl;

import cmjd107.librarymanagement.dao.DaoFactory;
import cmjd107.librarymanagement.dao.custom.CategoryDao;
import cmjd107.librarymanagement.dto.CategoryDto;
import cmjd107.librarymanagement.entity.CategoryEntity;
import cmjd107.librarymanagement.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public String save(CategoryDto t) throws Exception {
        CategoryEntity entity = getCategoryEntity(t);
        return categoryDao.save(entity);
    }

    @Override
    public String Update(CategoryDto t) throws Exception {
        CategoryEntity entity = getCategoryEntity(t);
        return categoryDao.Update(entity);
    }

    @Override
    public String Delete(String id) throws Exception {
        return categoryDao.Delete(id);
    }

    @Override
    public CategoryDto get(String id) throws Exception {
        CategoryEntity entity = categoryDao.get(id);
        if (entity != null) {
            return getCategoryDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<CategoryDto> getAll() throws Exception {
        ArrayList<CategoryDto> dtos = new ArrayList<>();
        ArrayList<CategoryEntity> entities = categoryDao.getAll();
        for (CategoryEntity entity : entities) {
            CategoryDto dto = getCategoryDto(entity);
            dtos.add(dto);
        }

        return dtos;
    }

    private CategoryEntity getCategoryEntity(CategoryDto t) {
        return new CategoryEntity(t.getCategoryId(), t.getCategoryName());
    }

    private CategoryDto getCategoryDto(CategoryEntity entity) {
        return new CategoryDto(entity.getCategoryId(), entity.getCategoryName());
    }

    @Override
    public CategoryDto getCategorybyName(String name) throws Exception {
        CategoryEntity entity = categoryDao.getCategoryByName(name);
        if (entity != null) {
            return getCategoryDto(entity);
        }
        return null;
    }

    @Override
    public String getLatestId() throws Exception {
        return categoryDao.getLatestId();
    }

}
