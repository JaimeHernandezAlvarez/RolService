package com.service.rol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.rol.model.Rol;
import com.service.rol.repository.RolRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    //Listar Propietarios
    public List<Rol> findAll(){
        return rolRepository.findAll();
    }

    //Listar Propietarios por ID
    public Rol findById(long id){
        return rolRepository.findById(id).get();
    }

    //guardar Propietarios por ID
    public Rol save(Rol rol){
        return rolRepository.save(rol);
    }

    //Eliminar Propietarios
    public void delete(long id){
        rolRepository.deleteById(id);
    }
}
