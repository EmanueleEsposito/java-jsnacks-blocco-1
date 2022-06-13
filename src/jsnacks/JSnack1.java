//Il software deve chiedere per 5 volte all’utente di inserire un numero.
//Il programma stampa la somma di tutti i numeri inseriti.
//Esegui questo programma in due versioni, con il for e con il while.

package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeroUtente = new int[5];
		
Scanner scan = new Scanner(System.in);



for(int index = 0; index<numeroUtente.length; index++ ) {
	System.out.println("Scrivi un numero  ");
	numeroUtente[index] = scan.nextInt();

}
int sommaUtente=0;
for( int i=0; i<numeroUtente.length; i++);{
	System.out.println(numeroUtente[sommaUtente]);
}
		
scan.close();	
	}

}
