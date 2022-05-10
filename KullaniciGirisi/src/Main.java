import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName,password,select,newPassword;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanýcý Adý Giriniz");
		userName = input.nextLine();
		
		System.out.println("Þifre Giriniz");
		password = input.nextLine();
		
		
       if (userName.equals("patika") && password.equals("java123")) {
    	   
		System.out.println("Giriþ Yaptýnýz");
		
       }
       
       else {
		
    	   System.out.println("Þifreniz Yanlýþ");
    	   System.out.println("Yeni Bir Þifre Oluþturmak Ýstiyorsanýz 1-Hayýr 2-Evet");
    	   select = input.nextLine();
    	   
    	   switch(select) {
    	   
    	   case "1":System.out.println("Ýyi Günler");break;
    	   case "2":System.out.println("Yeni Þifre Giriniz");
    	             newPassword = input.nextLine();
    	   
    	         if (newPassword.equals(password)) {
    	        	 System.out.println("Yanlýþ Þifre Girdiniz Tekrar Deneyiniz");
    	         }
    	   
    	         else {
    	        	 password = newPassword;
    	        	 System.out.println("Parola Oluþturuldu");
    	        	 
    	         }   break;
    	         
    	         
    	   default:System.out.println("Yanlýþ Seçim");break;      
    	   
    	   }
    	   
	}
     
       
       
       }

}
