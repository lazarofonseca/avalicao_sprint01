package br.com.lazaro.app;

import java.util.Locale;
import java.util.Scanner;

import br.com.lazaro.entidade.Usuario;

public class Quiz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);


		String[] questoes = new String[] { "Qual a capital do Brasil?", "Qual a capitalda Paraíba?",
				"Qual a capital da França?" };
		String[] respostas = new String[] { "A - Brasilia", "B - João Pessoa", "C - Paris" };

		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o nome do Jogador ?");
		String nome = sc.nextLine();
		
		Usuario usuario = new Usuario(nome);
		
		System.out.println("-----------------------------QUIZ---------------------------------------");

		for (int i = 0; i < questoes.length; i++) {
			System.out.println((i + 1) + "º pergunta: ");
			System.out.println(questoes[i]);
			for (int j = 0; j < respostas.length; j++) {
				System.out.println(respostas[j]);
			}
			System.out.println("Dgite a opção correspondente: ");
			String resp = sc.nextLine();
			
			System.out.println("--------------------------------------------------------------");

			
			if (i == 0 && resp.equalsIgnoreCase("a")) {
				Usuario.acerto += 1;
			}
			else if (i == 1 && resp.equalsIgnoreCase("b")) {
				Usuario.acerto += 1;
			}
			else if (i == 2 && resp.equalsIgnoreCase("c")) {
				Usuario.acerto += 1;
			} else {
				Usuario.erro += 1;
			}

		}

		System.out.println("-----------------------RESULTADO-----------------------------");
		System.out.println("Usuário :" + usuario.getNome());
		System.out.println("Acertos :" + Usuario.getAcerto());
		System.out.println("Erros :" + Usuario.getErro());

		 sc.close();
	}
}
