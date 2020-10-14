package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Введите кол-во товаров:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        System.out.println("Кол-во товаров " + n);
        scanner.nextLine();

        Product[] prodList; // объявление массива
        prodList = new Product[n];

        for (int i=0; i<n; i++)
        {
           //prodList[i] = new Cube();
            //prodList[i].init(scanner);
            //Cube c1 = new Cube();

            //scanner.nextLine();

            System.out.println("Тип товара:");
            String str = scanner.nextLine();
            switch (str){

                case ("Cube"):
                    prodList[i] = new Cube();
                    prodList[i].init(scanner);
                    break;
                case ("Cheese"):
                    prodList[i] = new Cheese();
                    prodList[i].init(scanner);
                    break;
                case ("Camera"):
                    prodList[i] = new Camera();
                    prodList[i].init(scanner);
                    break;
                case ("TV"):
                    prodList[i] = new TV();
                    prodList[i].init(scanner);
                    break;
            }

        }
        int min = 999999;
        int minIndex = 0;
        for (int i=0; i<n; i++){
            if( prodList[i].getCost() < min ){
                min = prodList[i].getCost();
                minIndex = i;
            }
        }

        System.out.println(prodList[minIndex].toString());
        //scanner.reset();
/*
        Cube c1 = new Cube();
        scanner.nextLine();
        c1.init(scanner);
        System.out.println(c1.toString());

        int balance = 15;

        if (c1.canBuy(balance)) System.out.println("Mojna");
        else System.out.println("Niz9");

        System.out.println(c1.getCost());
*/
        /*
        Toy ball = new Toy();
        ball.setCost();
        int t=ball.getCost();
        System.out.println(t);*/
    }
}
