package com.company;

import java.util.Scanner;

public class Index {

    public static double Index(double kilo,double boy){

        Scanner scan = new Scanner(System.in);
        double index;

        index=kilo/(boy*boy);
        System.out.println("Vücut kütle indexiniz: "+index);
        return index;
    }





}
