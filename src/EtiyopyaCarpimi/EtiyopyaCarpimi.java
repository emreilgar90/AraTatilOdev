package EtiyopyaCarpimi;

import java.util.ArrayList;
import java.util.Scanner;

public class EtiyopyaCarpimi {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci Sayiyi Giriniz: ");
		int n1 = input.nextInt();
		
		System.out.println("Ikinci Sayiyi Giriniz: ");
		int n2 = input.nextInt();
		input.close();
		
		ArrayList <Integer> list = new ArrayList<>();
		do {
			System.out.println(n1 + " " + n2 );
			if(n1%2 != 0 ) {
				list.add(n2);
			}
			n1 = n1/2;
			n2 = n2*2;
		}
		while (n1>0);
		
		System.out.println(list);
		for (int i=0; i <= list.size()-1; i++) {
			sum += list.get(i); 
		}
		System.out.println("Sonuc: "+sum);		

	}

}
			
		