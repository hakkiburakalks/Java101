import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
      int mesafe,yas,yolculukTipi;
      
      double mesafeSabiti = 0.1;
	  double tutar = 0;
	  double indirimliYasTutari = 0;
	  double yolculukTipiIndirimi =0;
      Scanner input = new Scanner(System.in);
		
      System.out.println("Gitmek �stedi�iniz Mesafeyi Se�iniz:" );
      mesafe = input.nextInt();
      if (mesafe < 0) {
    	  System.out.println("Girdi�iniz Mesafe Ge�ersizdir");
      }
      else {
    	  tutar = mesafe * mesafeSabiti;
      }
		
      System.out.println("Yas�n�z� Giriniz" );
      yas = input.nextInt();
      
      if(yas < 0) {
    	  System.out.println("Girdi�iniz Ya� Ge�ersizdiir");
      }
      else {
    	  
    	  if (yas >= 0 && yas<12) {
    		  
    		  indirimliYasTutari = tutar - (tutar*0.5);
    	  }
    	  
    	  else if (yas >= 12 && yas <24) {
    		  indirimliYasTutari = tutar - (tutar * 0.1);
    	  }
    	  
    	  
    	  else if (yas > 65) {
    		  
    		  indirimliYasTutari = tutar - (tutar* 0.3);
    	  }
    	  
    	  else {
    		  indirimliYasTutari = tutar;
    	  }
    		  
    	  
      }
      
      System.out.println("Yolculuk Tipini Giriniz 1--> Tek Y�n 2--> Gidi� D�n��");
      yolculukTipi = input.nextInt();
      
        
      switch (yolculukTipi) {
	   case 1: yolculukTipiIndirimi = indirimliYasTutari ; break;
	   case 2: yolculukTipiIndirimi =  2 * (indirimliYasTutari - (indirimliYasTutari * 0.2)); break; 
	   default: System.out.println("Girdi�iniz Yolculuk Tipi Ge�ersizdir");break;
	}
      
      System.out.println("Toplam Tutar "+yolculukTipiIndirimi);
      
      
     
  
		
	}

}
