/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.controller;

import cmjd107.librarymanagement.dto.CategoryDto;
import cmjd107.librarymanagement.service.ServiceFactory;
import cmjd107.librarymanagement.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CategoryController {

    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String save(CategoryDto dto) throws Exception {
        return categoryService.save(dto);
    }

    public String update(CategoryDto dto) throws Exception {
        return categoryService.Update(dto);
    }

    public String delete(String id) throws Exception {
        return categoryService.Delete(id);
    }

    public CategoryDto getCategorybyId(String id) throws Exception {
        return categoryService.get(id);
    }

    public ArrayList<CategoryDto> getAllCategories() throws Exception {
        return categoryService.getAll();
    }
}
