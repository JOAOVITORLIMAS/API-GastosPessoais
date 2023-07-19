package com.albuquerquelima.meusgastos.Domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albuquerquelima.meusgastos.Domain.model.Usuario;


public interface UsuarioRepository extends JpaRepository< Usuario, Long> {

    List<Usuario> findByEmail(String email);
}
