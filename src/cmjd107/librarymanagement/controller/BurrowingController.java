/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.controller;

import cmjd107.librarymanagement.dto.BurrowingDto;
import cmjd107.librarymanagement.service.ServiceFactory;
import cmjd107.librarymanagement.service.custom.BurrowingService;

/**
 *
 * @author User
 */
public class BurrowingController {

    BurrowingService burrowingService = (BurrowingService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BURROWING);

    public String getLatestId() throws Exception {
        return burrowingService.getLatestId();
    }

    public String makeBurrowing(BurrowingDto burrowingDto) throws Exception {
        return burrowingService.makeBurrowing(burrowingDto);
    }
}
