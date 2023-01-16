package com.example.demo.dto.servicio;

import com.example.demo.dto.UsuarioRegistrodto;
import com.users.bim.modelo.usuario;

public interface UsuarioServicio {
	
	public usuario save( UsuarioRegistrodto registroDTO );
	
}
