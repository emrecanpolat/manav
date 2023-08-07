package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00, toplamFiyat;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        System.out.println("Armut Kaç kilo? : ");
        armutKilo = input.nextDouble();

        System.out.println("Elma Kaç kilo? : ");
        elmaKilo = input.nextDouble();

        System.out.println("Domates Kaç kilo? : ");
        domatesKilo = input.nextDouble();

        System.out.println("Muz Kaç kilo? : ");
        muzKilo = input.nextDouble();

        System.out.println("Patlican Kaç kilo? : ");
        patlicanKilo = input.nextDouble();

        toplamFiyat = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) + (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) + (patlicanFiyat*patlicanKilo);
        System.out.println(toplamFiyat + "TL");

    }
}
