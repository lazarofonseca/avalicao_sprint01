package br.com.lazaro.app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.lazaro.entidades.Login;
import br.com.lazaro.entidades.Usuario;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

		Scanner sc = new Scanner(System.in);
		// List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Login loginSenha = new Login();

		Usuario usuario0 = new Usuario("lazaro", "123");
		loginSenha.adicionaUsuario(usuario0);
		Usuario usuario1 = new Usuario("teste1", "87540");
		loginSenha.adicionaUsuario(usuario1);
		Usuario usuario2 = new Usuario("teste2", "9743");
		loginSenha.adicionaUsuario(usuario2);
		Usuario usuario3 = new Usuario("teste3", "fddfu3");
		loginSenha.adicionaUsuario(usuario3);
		Usuario usuario4 = new Usuario("teste4", "63483");
		loginSenha.adicionaUsuario(usuario4);

		System.out.println("Digite seu usuário:");
		String login = sc.next();
		System.out.println("Digite sua senha: ");
		String senha = sc.next();

		boolean encontrou = true;

		for (int i = 0; i < loginSenha.getUsuarios().size(); i++) {

			if (loginSenha.getUsuarios().get(i).getNome().equals(login)
					&& loginSenha.getUsuarios().get(i).getSenha().equals(senha)) {
				// System.out.println("Bem vindo!");
				encontrou = true;
				break;
			} else {
				encontrou = false;
			}

		}

		Date horaAtual = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(horaAtual);
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		int minuto = cal.get(Calendar.MINUTE);

		System.out.println(encontrou);

		if (encontrou && hora > 6 && hora < 11 && minuto <= 59) {
			System.out.println("Bom dia, você se logou com sucesso.");
		} else if (encontrou && hora > 11 && hora < 17 && minuto <= 59) {
			System.out.println("Boa tarde, você se logou com sucesso.");
		} else if (encontrou && hora > 17 && hora < 23 && minuto <= 59) {
			System.out.println("Boa noite, você se logou ao nosso sistema.");
		} else if (encontrou && hora == 00 && hora < 5 && minuto <= 59) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema.");
		} else {
			System.out.println("Usuário e/ou senha incorretos.");
		}

	
		sc.close();
		
	}

}
