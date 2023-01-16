package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.bim.modelo.usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<usuario, Long>  {

}
