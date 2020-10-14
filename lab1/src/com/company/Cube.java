package com.company;

import java.util.Scanner;

public class Cube extends Toy {

    public String segments;//размер (AxA)

    @Override
    // считывание параметров с консоли
    public void init(Scanner scanner){

        this.type = "Cube";

        System.out.println("Название товара:");
        //this.name = scanner.nextLine();
        this.name = scanner.nextLine();

        System.out.println("Цена товара:");
        this.cost = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Цвет:");
        this.color = scanner.nextLine();


        System.out.println("Кол-во сегментов:");
        this.segments = scanner.nextLine();

    }

    // возвращает стоимость товара
    @Override
    public int getCost(){
        return this.cost;
    }

    // определяет, можно ли купить товар за имеющуюся сумму
    @Override
    public boolean canBuy(int balance){
        return this.cost <=balance;
    }

    // возвращается состояние объекта
    @Override
    public String toString(){

        return ("Вид товара: " + this.type + " Название товара: " + this.name + " Цена товара: " + this.cost + " Кол-во сегментов: " + this.segments);

    }
    /*
        System.out.println("Вид товара:");
        System.out.println(this.type);

        System.out.println("Название товара:");
        System.out.println(this.name);

        System.out.println("Цена товара:");
        System.out.println(this.cost);


        System.out.println("Кол-во сегментов:");
        System.out.println(this.segments);
        */
}
