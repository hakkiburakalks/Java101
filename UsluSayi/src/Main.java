import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
		 
	  int n,k,sonuc = 1;
	  System.out.println("�ss� Al�nacak Say�y� Giriniz");
	  n = scn.nextInt();
	  System.out.println("�s olacak say�: ");
	   k = 	scn.nextInt();;	
	   for (int i=1; i<=k;i++) {
	   sonuc *= n; 
		  
		
		  
	  }
		
		System.out.println(sonuc);
		
		

	}

}
