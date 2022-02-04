package br.com.lazaro.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.lazaro.entidades.Login;
import br.com.lazaro.entidades.Usuario;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Usuario usuario0 = new Usuario("lazaro", "123");
		Usuario usuario1 = new Usuario("teste1", "87540");
		Usuario usuario2 = new Usuario("teste2", "9743");
		Usuario usuario3 = new Usuario("teste3", "fddfu3");
		Usuario usuario4 = new Usuario("teste4", "63483");

		listaUsuarios.add(usuario0);
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario3);
		listaUsuarios.add(usuario4);

		sc.close();

		for (int i = 0; i < listaUsuarios.size(); i++) {
			System.out.println("Usuário e senha");
			System.out.println("Usuário : " + listaUsuarios.get(i).getNome() + " Senha ; " + 
			listaUsuarios.get(i).getSenha());
		}

	}

}
