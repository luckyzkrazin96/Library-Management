/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cmjd107.librarymanagement.service.custom;

import cmjd107.librarymanagement.dto.BurrowingDto;
import cmjd107.librarymanagement.service.CrudService;

/**
 *
 * @author User
 */
public interface BurrowingService extends CrudService<BurrowingDto, String>{
    public String makeBurrowing(BurrowingDto burrowingDto) throws Exception;
}
