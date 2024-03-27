package aula27;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		String login;
		String senha;
		String cadastroLogin;
		String cadastroSenha;
		
		System.out.println("/////// Cadastre-se ////////");
		
		System.out.print("Cadastre seu login: ");
		cadastroLogin = ler.next();
		
		System.out.print("Cadastre sua senha: ");
		cadastroSenha= ler.next();
		System.out.println("        ");
		System.out.println("--------Cadastrado com sucesso--------");
		
		
        System.out.print("informe seu login: ");
		login = ler.next();
		
		System.out.print("informe sua senha: ");
		senha = ler.next();
		
		if (login.equals(cadastroLogin) && senha.equals(cadastroSenha)) {
		System.out.println("~~~~~~Bem Vindo ao sistema Senai~~~~~~");
		}
		else {
			System.out.println (" Dados incorretos, informe os dados novamente");

		}
		ler.close();

	




	}

}
