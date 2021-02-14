package com.company;


import java.util.Scanner;

public class Bazal {
    public static double Bazal(String cinsiyet, double kilo,double boy,int yas){
        double bazal = 0;
        double toplam=0;
        int aktiv;
        double saat;
        double hedef;
        hedef = 21*(boy*boy);
        Scanner scan = new Scanner(System.in);
        System.out.println("Hedef Kilonuz: "+hedef);

        if(cinsiyet.equals("erkek")){
            bazal=66+(13.7*hedef)+(5*(boy*100))-(6.8*yas);
        }else if(cinsiyet.equals("kız")|| cinsiyet.equals("kadın")){
            bazal=655+(9.6*kilo)+(1.8*boy)-(4.7*yas);
        }

        System.out.println("1.)Kestirme yolla hesapla\n2.)Uzun yolla hesapla(Detaylı anket)");
        int sayi=scan.nextInt();
        if(sayi==1){
            System.out.println("1.)Hareketsiz Yaşam\n2.)Hafif Hareketli Yaşam\n3.)Orta Hareketli Yaşam\n4.)Hareketli Yaşam\n5.)Çok Hareketli Yaşam");
            int yasam=scan.nextInt();
                if(yasam==1){
                bazal=bazal*1.20;
                }else if(yasam==2){
                    bazal=bazal*1.375;
                }else if(yasam==3){
                    bazal = bazal*1.55;
                }else if(yasam==4){
                    bazal=bazal*1.725;
                }else if(yasam==5){
                    bazal=bazal*1.9;
                }
        }else{
                System.out.println("Günlük yapılan aktiviteler:");
                do{
                    System.out.println("1.)Uyku\n2.)Otobüs yolculuğu\n3.)Hafif boş zaman\n4.)Oturmak\n5.)Araba kullanma\n6.)Yemek yapmak\n7.)Ayakta durmak\n8.)Ev işleri\n9.)Kişisel bakım\n10.)Yürüyüş\n11.)Bahçe işler\n12.)Hafif jimnastik hareketleri yapmak\n13.)Ağır spor yapmak\n0.)Bitir.");
                    aktiv=scan.nextInt();

                    if(aktiv!=0){
                        System.out.println("Kaç saat: ");
                        saat=scan.nextDouble();
                    if(aktiv==1){
                        toplam=saat*1;
                    }else if(aktiv==2){
                        toplam=saat*1.2;
                    }else if(aktiv==3){
                        toplam=saat*1.4;
                    }else if(aktiv==4){
                        toplam=saat*1.5;
                    }else if(aktiv==5){
                        toplam=saat*2;
                    }else if(aktiv==6){
                        toplam=saat*2.1;
                    }else if(aktiv==7){
                        toplam=saat*2.2;
                    }else if(aktiv==8){
                        toplam=saat*2.3;
                    }else if(aktiv==9){
                        toplam=saat*2.3;
                    }else if(aktiv==10){
                        toplam=saat*3.2;
                    }else if(aktiv==11){
                        toplam=saat*4.1;
                    }else if(aktiv==12){
                        toplam=saat*4.2;
                    }else if(aktiv==13){
                        toplam=saat*5.2;
                    }}

                }while(aktiv!=0);
                toplam=toplam/24;
                bazal=bazal*toplam;






        }

        System.out.println("Kahvaltı: "+(bazal*40)/100);
        System.out.println("Öğle: "+(bazal*20)/100);
        System.out.println("Akşam: "+(bazal*20)/100);
        System.out.println("Karbonhidrat: "+(bazal*55)/100);
        System.out.println("Yağ: "+(bazal*30)/100);
        System.out.println("Protein: "+(bazal*15)/100);
        System.out.println("Hedefinize ulaşmak için günde almanız gereken kalori miktarı: "+bazal);
        return bazal;
    }
}
