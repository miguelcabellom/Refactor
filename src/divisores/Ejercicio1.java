package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	private static final String MENSAJE = "Número de divisores: ";
	public static Scanner lectura;

	public static void main(String[] args) {
		int numeroUsuario;
		long numDivisores;
		lectura = new Scanner(System.in);
		
		numeroUsuario = lectura.nextInt();
		numDivisores = primeDivisors(numeroUsuario);
		
		System.out.println(MENSAJE + numDivisores);
		lectura.close();
	}

	private static long primeDivisors(long number) {
		int cont = 0;
		
		for(int i=2; i<=number; i++) {
			if(number%i==0 && isPrime(i)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static boolean isPrime(long number) {
		boolean esPrimo = true;
		for(int i=2; i<number; i++) {
			long modulo = number%i;
			if(modulo == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
