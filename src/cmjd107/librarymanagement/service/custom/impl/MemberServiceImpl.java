/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmjd107.librarymanagement.service.custom.impl;

import cmjd107.librarymanagement.dao.DaoFactory;
import cmjd107.librarymanagement.dao.custom.MemberDao;
import cmjd107.librarymanagement.dto.MemberDto;
import cmjd107.librarymanagement.entity.MemberEntity;
import cmjd107.librarymanagement.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MemberServiceImpl implements MemberService {

    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto t) throws Exception {
        MemberEntity entity = getMemberEntity(t);
        return memberDao.save(entity);
    }

    @Override
    public String Update(MemberDto t) throws Exception {
        MemberEntity entity = getMemberEntity(t);
        return memberDao.Update(entity);
    }

    @Override
    public String Delete(String id) throws Exception {
        return memberDao.Delete(id);
    }

    @Override
    public MemberDto get(String id) throws Exception {
        MemberEntity entity = memberDao.get(id);
        if (entity != null) {
            return getMemberDto(entity);
        }
        return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        ArrayList<MemberDto> dtos = new ArrayList<>();

        ArrayList<MemberEntity> entities = memberDao.getAll();

        for (MemberEntity entity : entities) {
            MemberDto dto = getMemberDto(entity);
            dtos.add(dto);
        }

        return dtos;
    }

    private MemberEntity getMemberEntity(MemberDto t) {
        return new MemberEntity(t.getMembetId(), t.getName(), t.getAddress(), t.getContactNumber());
    }

    private MemberDto getMemberDto(MemberEntity entity) {
        return new MemberDto(entity.getMemberId(), entity.getName(), entity.getAddress(), entity.getContactNumber());
    }

}
