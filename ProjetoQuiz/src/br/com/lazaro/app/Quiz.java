package br.com.lazaro.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.lazaro.entidade.Usuario;

public class Quiz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String[] questoes = new String[2];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o nome do Jogador?");
		String nome = sc.next();
		
		Usuario usuario = new Usuario(nome);
		
		
		
		
		
		System.out.println("Usuário :" + usuario.getNome());
		System.out.println("Acertos :" + usuario.getAcerto());
		System.out.println("Erros :" + usuario.getErro());
		
		
		
		
		sc.close();

	}

}
