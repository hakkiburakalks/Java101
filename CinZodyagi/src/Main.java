import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int birthDate;
		System.out.println("Doðum Tarihi Giriniz");
		Scanner inp = new Scanner(System.in);
		birthDate = inp.nextInt();
		int select = birthDate % 12;
		
		switch (select) {
		case 1:System.out.println("Horoz"); break;
		case 2:System.out.println("Köpek"); break;
		case 3:System.out.println("Domuz"); break;
		case 4:System.out.println("Fare"); break;
		case 5:System.out.println("Öküz");break;
		case 6:System.out.println("Kaplan"); break;
		case 7:System.out.println("Tavþan"); break;
		case 8:System.out.println("Ejderha"); break;
		case 9:System.out.println("Yýlan"); break;
		case 10:System.out.println("At"); break;
		case 11:System.out.println("Koyun"); break;
		case 0:System.out.println("Maymun");break;

		default:break;
		}
		
		
		
		
		
		
	}

}
