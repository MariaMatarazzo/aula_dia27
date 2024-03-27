package aula27;
import java.util.Scanner;
public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String loginCerto = "Maria";
		String senhaCerta = "123456";
		
		Scanner ler = new Scanner (System.in);
		String login;
		String senha;
		
        System.out.print("informe seu login: ");
		login = ler.next();
		
		System.out.print("informe sua senha: ");
		senha = ler.next();
		
		if (login.equals(loginCerto) && senha.equals(senhaCerta)) {
		System.out.println(" Bem vindo ao sistema Senai");
		}
		else {
			System.out.println (" Dados incorretos, informe os dados novamente");

		}
		ler.close();

	}

}
