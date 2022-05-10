import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int n1,n2,select;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci Sayýyý Giriniz");
		n1= input.nextInt();
		System.out.println("Ýkinci Sayýyý Giriniz");
		n2 = input.nextInt();
		
		System.out.println("Yapmak Ýstediðiniz Ýþlemi Giriniz 1-Toplama\n 2-Çýkarma\n 3-Çarpma\n 4-Bölme ");
                select = input.nextInt();		
		int sonuc = 0;
		
		switch (select) {
		case 1:  sonuc =n1+n2; break;
		case 2:  sonuc =n1-n2; break;	
		case 3:  sonuc =n1*n2; break;	
		case 4:  sonuc =n1/n2; break;
		default:
			break;
		}
		
		System.out.println(sonuc);
		
		
		
		
		
		
		
	}

}
