package br.com.lazaro.entidades;

import java.util.ArrayList;
import java.util.List;

public class Login {
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void adicionaUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

}
