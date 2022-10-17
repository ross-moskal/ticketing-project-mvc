package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.CrudService;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RoleServiceImp extends AbstractMapService<RoleDTO, Long> implements RoleService {

    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(), object);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}