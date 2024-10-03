//Se corrigen errores de sintaxys en general

import java.util.Scanner;
public class Codigo6 {
	public static void main(String[] arg) {
	    int [] n = new int [20];
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }//for
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	  
	    //Aqui se sustituye por un Scanner para introducir el valor en la variable opcion
	    Scanner sc= new Scanner(System.in);
	    
		int opcion = sc.nextInt();
	    // se modifica el ciclo foreach por un for
	    int multiplo = (opcion == 1)? 5 : 7;
	    for (int numero  : n){
	      if (numero % multiplo == 0) {
	        System.out.print("[" + numero + "] ");
	      } else {
	        System.out.print(numero + " ");
	      }//else
	}//for
	    sc.close();
}//main
}//class Codigo6