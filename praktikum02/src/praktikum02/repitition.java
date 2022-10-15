
package praktikum02;

import java.util.Scanner;

public class repitition {

	public static void main(String[] args) {
		//if
		/*int nilai = 10;
		System.out.println("nilai = "+ nilai);
		
		if (nilai ==5) {
			System.out.println("ini adalah "+ nilai);
		}
		else {
			System.out.println("program berakhir");
		}
		
		//else if else
		
		int b = 8;
		if (b==8) {
			System.out.println("ini adalah "+ b);
		}
		else if (b==9) {
			System.out.println("ini adalah "+ b);
		}
		else {
			System.out.println("program end");
		}
		
		//switch case
	//	switch (ekspersi) //satuan int, long, byte, short, string {
	//	case :
	// statement
	// }
		
		int input;
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Menu : ");
		System.out.println("1. Kep");
		System.out.println("2. Kevina");
		System.out.println("3. Kevinaa");
		System.out.println("Masukkan pilihan : ");
		input = inputUser.nextInt();
		
		switch (input) {
		case 1 :
			System.out.println("Saya Kep");
			break;
			
		case 2 :
			System.out.println("Saya Kevina");
			break;
			
		case 3 :
			System.out.println("Saya Kevinaa");
			
		default:
			System.out.println("Anda memasukkan pilihan yang salah");
		}
		
		//Repitition For
	//	for (inisialisasi; kondisi; increment)
		for(int nilaii = 0; nilai <= 10; nilai++) {
			System.out.println(" *"+ nilai);
		}*/
		
		//while
		
		int a = 0;
		boolean kondisi = true;
		System.out.println("awal program");
		while (kondisi) {
			System.out.println("while loop ke a- "+ a);
			
			if (a ==10) {
				kondisi = false;
			}
			a++;
		}
	}

}
