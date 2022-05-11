import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
		 
	  int n,k,sonuc = 1;
	  System.out.println("Üssü Alýnacak Sayýyý Giriniz");
	  n = scn.nextInt();
	  System.out.println("üs olacak sayý: ");
	   k = 	scn.nextInt();;	
	   for (int i=1; i<=k;i++) {
	   sonuc *= n; 
		  
		
		  
	  }
		
		System.out.println(sonuc);
		
		

	}

}
