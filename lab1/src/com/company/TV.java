package com.company;

import java.util.Scanner;

public class TV extends Technic{

    public String resolution;

    public void init(Scanner scanner){

        this.type = "TV";

        System.out.println("Название товара:");
        //this.name = scanner.nextLine();
        this.name = scanner.nextLine();

        System.out.println("Цена товара:");
        this.cost = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Разрешение");
        this.resolution = scanner.nextLine();

        System.out.println("Цвет:");
        this.color = scanner.nextLine();

        System.out.println("Потребление");
        this.powerkVt = scanner.nextInt();
        scanner.nextLine();

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

        return ("Вид товара: " + this.type + " Название товара: " + this.name + " Цена товара: " + this.cost + " Разрешение: " + this.resolution + "Цвет: " + this.color + " Потребление: " + this.powerkVt);

    }
}
