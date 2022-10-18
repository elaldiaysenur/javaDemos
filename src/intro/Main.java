package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		/*
		// Hello World Method
		System.out.println("Merhaba Java");
		*/
		
		
		/*
		// Java Variables
		int ogrenciSayisi=10;
		String mesaj="Öğrenci Sayısı :";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
		*/
		/* 
		
		
		//Java Data Types
		double sayi=15.5;
		int sayi1 = 5;               // İnteger (whole number)
		float floatSayi = 5.99f;    // Floating point number
		char karakter = 'D';         // Character
		boolean dogruMu = true;       // Boolean
		String yazi = "Hello";     // String
		*/
		
		
		/*
		//Java if ... Else
		int sayi=24;
		if (sayi<20) {
			System.out.println("Sayı 20'den küçüktür");
		}else if(sayi==20){
			System.out.println("Sayı 20'ye eşittir");
		}else {
			System.out.println("Sayı 20'den Büyüktür");
		}
		*/
		
		
		/*
		//UC SAYIDAN EN BÜYÜĞÜNÜ BULMA ReCap-->1
		int sayi1=30;
		int sayi2=25;
		int sayi3=2;
		int enBuyuk=sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En Büyük ="+enBuyuk);
		*/
		
		
		/*
		// Switch Bloklari -->Geçti kaldı harf notuna göre
		char grade='F';


		switch (grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel: Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi: Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil: Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
				System.out.println("Geçersiz Not Girdiniz");
		}
		*/
		
		
		/*
		//FOR 
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For Döngüsü Bitti");
		
		
		
		//While
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");
		
		
		//Do-While
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		System.out.println("Do-While Döngüsü Bitti");
		*/
		
		
		/*
		//Diziler-Arrays
		String ogrenci1="Engin";
		String ogrenci2="Nur";
		String ogrenci3="Ela";
		String ogrenci4="Esma";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------");
		
		
		String[] ogrenciler=new String[5];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Nur";
		ogrenciler[2]="Ela";
		ogrenciler[3]="Esma";
		ogrenciler[4]="Ali";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("--------------");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		*/
		
		/*
		//RECAP DEMO-->2
		double[] myList= {1.2,1.3,4.3,5.6};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println("TOPLAM ="+total);
		System.out.println("EN BUYUK ="+max);
		*/
		
		//Çok Boyutlu Diziler
		/*
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakır";
		sehirler[2][1]="Şanlıurfa";
		sehirler[2][2]="Gaziantep";
		
		for(int i=0;i<=2;i++) {
			System.out.println("------------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}*/
		
		
		//Stringlerle Çalışmak-->1
		/*
		String mesaj="Bugün Hava Çok Güzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: "+mesaj.length());
		System.out.println("5.Eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!")); //birleştirme
		System.out.println(mesaj.startsWith("A"));//true-false
		System.out.println(mesaj.endsWith("l"));
		char[] karakterler=new char[5]; //karakterleri al
		mesaj.getChars(0, 5,karakterler, 0); 
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));//kaçıncı eleman
		System.out.println(mesaj.lastIndexOf('a'));*/
		
		
		//Stringlerle Çalışmak-->2
		/*
		String mesaj="Bugün Hava Çok Güzel";
		System.out.println(mesaj);
		
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2,4));//2'den basla 4'e kadar
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//tüm harfler küçük
		System.out.println(mesaj.toUpperCase());//tüm harfler büyük
		
		System.out.println(mesaj.trim());*/
		
		
		//Proje-->1 -- Sayı Asal mı?
		/*
		int number=-2;
		int remainder=number%2;
		//System.out.println(remainder);
		boolean isPrime=true;
		
		if(number==1) {
			System.out.println("Sayı Asal Değildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz Sayı");
		}
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("Sayı Asaldır");
		}
		else {
			System.out.println("Sayı Asal Değildir");
		}*/
		
		
		//Proje-->2 -- Kalın Sesli ve İnce Sesli Harfler
		/*
		char harf='I';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
			default:
				System.out.println("İnce sesli Harfler");
		}*/
		
		//Proje-->3 --Mükemmel Sayılar 
		//6-->1,2,3
		//28-->1,2,4,7,14
		/*
		int number=5;
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total=total+1;
			}
		}
		if(total==number) {
			System.out.println("Mükemmel Sayıdır");
		}else {
			System.out.println("Mükemmel Sayı Değildir");
		}*/
		
		
		
		//Proje-->4 --Arkadaş Sayılar 
		//220-284
		/*
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1=toplam1+i;
			}
		}
		

		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2=toplam2+i;
			}
		}

		if(sayi1==toplam2&&sayi2==toplam1) {
			System.out.println("Bu iki sayi arkadaş");
		}else {
			System.out.println("Bu iki sayı arkadaş değildir");
		}*/
		
		
		
		
		
		//Proje-->5--sayı bulma
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=5;
		
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı Mevcuttur");
		}
		else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

}
