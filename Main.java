package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double boy;
        double kilo;
        int yas;
        String cinsiyet;
        int sayi;


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi girin: ");
        String ad =scan.next();
        System.out.print("Lütfen soyisminizi girin: ");
        String soyad =scan.next();

        //yaş sorgusu
        System.out.print("Lütfen yaşınızı girin: ");
        yas=scan.nextInt();


        //Cinsiyet sorgusu
        System.out.println("Cinsiyetinizi girin(Erkek/Kadın): ");
        cinsiyet=scan.next();
        cinsiyet=cinsiyet.toLowerCase();
        cinsiyet=cinsiyet.trim();

        //Kilo sorgusu
        System.out.println("Lütfen kilonuzu girin: ");
         kilo= scan.nextDouble();


         //Boy sorgusu
        System.out.println("Lütfen boyunuzu metre cinsinden girin girin: ");
        boy =scan.nextDouble();

       do{
           //İşlem sorgusu
           System.out.println("1.)İndex Hesaplama\n2.)Toplam enerji ihtiyacı hesapla\n0.)Çıkış");
            sayi=scan.nextInt();
            if(sayi==1){
                Index.Index(kilo,boy);
            }else if(sayi==2){
                Bazal.Bazal(cinsiyet,kilo,boy,yas);
            }
       }while(sayi!=0);
            System.out.println("Sağlıklı Günler Dilerim.");



    }
}
