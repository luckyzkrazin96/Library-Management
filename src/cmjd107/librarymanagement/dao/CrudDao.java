/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cmjd107.librarymanagement.dao;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface CrudDao<T, ID> extends SuperDao {

    String save(T t) throws Exception;

    String Update(T t) throws Exception;

    String Delete(ID id) throws Exception;

    T get(ID id) throws Exception;

    ArrayList<T> getAll() throws Exception;
}
