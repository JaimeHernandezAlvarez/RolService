package com.service.rol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.rol.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol,Long>{

}
