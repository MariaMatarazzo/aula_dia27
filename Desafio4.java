package aula27;
import java.util.Scanner;
public class Desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner (System.in);
		 int numero1;
		 int numero2;
		 int numero3;
		 
		 System.out.println("Digite tres numeros para compararmos e analizarmos!!!");
		 System.out.println(" ");
		 
		 System.out.print (" digite o primeiro numero:  ");
		 numero1= ler.nextInt();
		 
		 System.out.print (" digite o segundo numero:  ");
		 numero2 = ler.nextInt();
		 
		 System.out.print (" digite o terceiro numero:  ");
		 numero3 = ler.nextInt();
		 
		 //comparação dos maiores numeros
		 
		if (numero1 >= numero2 && numero1>=numero2) {
			System.out.println(" ");
			System.out.println("Agora vamos comparar!!!");
			System.out.println(" ");
		System.out.println ("----o primeiro numero é maior----");
		}
		
		
		else if (numero2>=numero1 && numero2>=numero3) {
			System.out.println(" ");
				System.out.println("Agora vamos comparar!!!");
				System.out.println(" ");
			System.out.println ("----o segundo numero é maior----");
			}
				
		else if (numero3>=numero1 && numero3>=numero2) {
			System.out.println(" ");
			System.out.println("Agora vamos comparar!!!");
			System.out.println(" ");
		System.out.println ("----o terceiro numero é maior----");
		}
		
		// comparação dos menores numeros
		
		if (numero1 <= numero2 && numero1<=numero3) {
			System.out.println(" ");
			System.out.println ("----o primeiro numero é menor----");
			}
		
			
	    else if (numero2<=numero1 && numero2<=numero3) {
				System.out.println(" ");
				System.out.println("----O segundo numero é menor----");
			}
				
		
	    else{
				System.out.println(" ");
				System.out.println ("----O terceiro numero é menor----");
            }
		
		ler.close();

		}
	}

		

	


