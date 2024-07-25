/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.controller;

import cmjd107.librarymanagement.dto.MemberDto;
import cmjd107.librarymanagement.service.ServiceFactory;
import cmjd107.librarymanagement.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MemberController {
    MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    
    public String save(MemberDto dto) throws Exception{
        return memberService.save(dto);
    }
    
    public String update(MemberDto dto) throws Exception{
        return memberService.Update(dto);
    }
    
    public String delete(String id) throws Exception{
        return memberService.Delete(id);
    }
    
    public MemberDto getMemberbyId(String id) throws Exception{
        return memberService.get(id);
    }
    
    public ArrayList<MemberDto> getAllMembers() throws Exception{
        return memberService.getAll();
    }
}
