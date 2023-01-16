package com.example.demo.dto.servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UsuarioRegistrodto;
import com.example.demo.repositorio.UsuarioRepositorio;
import com.users.bim.modelo.Rol;
import com.users.bim.modelo.usuario;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	private UsuarioRepositorio usuarioRepositorio;

	public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public usuario save (UsuarioRegistrodto registroDTO) {
		 usuario usuario = new usuario(registroDTO.getEmail(), registroDTO.getUsuario(),registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
	
		 return usuarioRepositorio.save(usuario);
	}

}
