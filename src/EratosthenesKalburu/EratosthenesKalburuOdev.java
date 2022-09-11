package EratosthenesKalburu;
import java.util.Scanner;

public class EratosthenesKalburuOdev {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Limit degerini giriniz: ");
		int n = input.nextInt();
		input.close();
		eratosthenesKalburu(n);
		
	}
	
	public static void eratosthenesKalburu(int n) {
		boolean [] numbers = new boolean[n + 1 ];
		
		for(int i = 2 ; i<n; i++) {
			if (!numbers[i]) {
				if(i !=2) {
					System.out.print(", ");
				}
				System.out.print(i);
				for(int j=i*2; j<n;j+=i) {
					numbers[j]= true;
				}
		}
		
	}
		
  }	
}