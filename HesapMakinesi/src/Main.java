import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int n1,n2,select;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci Say�y� Giriniz");
		n1= input.nextInt();
		System.out.println("�kinci Say�y� Giriniz");
		n2 = input.nextInt();
		
		System.out.println("Yapmak �stedi�iniz ��lemi Giriniz 1-Toplama\n 2-��karma\n 3-�arpma\n 4-B�lme ");
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
