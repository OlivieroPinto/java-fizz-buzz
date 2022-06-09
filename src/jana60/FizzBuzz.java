package jana60;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int numero;
		int n=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci numero tra 1 e 100");
		numero = scan.nextInt();
		while(!((numero>=1) && (numero<=100))) {
			System.out.println("Hai sbagliato numero, riprova:");
			numero = scan.nextInt();
		}
		
		while (n <=numero) {
			if((n%3==0) && (n%5==0)) {
				System.out.println("Fizz Buzz");
				n ++;
			}
			else if(n%3==0) {
				System.out.println("Fizz");
				
			}
			else if(n%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(n);
			}
			n ++;
		}

	}

}
