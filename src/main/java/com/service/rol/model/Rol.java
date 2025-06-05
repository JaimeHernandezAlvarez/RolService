package com.service.rol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_seq")
    @SequenceGenerator(name = "veterinario_seq", sequenceName = "SEQ_ROL", allocationSize = 1)
    @Column(name = "id_rol")
    private Integer id;

    @Column(name = "nombre", length = 10)
    private String nombre;
}
