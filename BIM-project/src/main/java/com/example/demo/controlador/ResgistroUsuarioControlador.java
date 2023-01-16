package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UsuarioRegistrodto;
import com.example.demo.dto.servicio.UsuarioServicio;

@Controller
@RequestMapping("/registro")
public class ResgistroUsuarioControlador {

	private UsuarioServicio usuarioServicio;

	public ResgistroUsuarioControlador(UsuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}

	@ModelAttribute("usuario")
	public UsuarioRegistrodto retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistrodto();
	}

	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";	
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistrodto registroDTO) {
		usuarioServicio.save(registroDTO);
		return "redirect:/registro?exito";
	}
	
	
}
