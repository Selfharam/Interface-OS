package com.company;

import java.util.Scanner;

public class Cheese extends Milky{

    public int dotCoast;

    public void init(Scanner scanner){

        this.type = "Cheese";

        System.out.println("Название товара:");
        //this.name = scanner.nextLine();
        this.name = scanner.nextLine();

        System.out.println("Цена товара:");
        this.cost = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Жирность:");
        this.oiliness = scanner.nextInt();

        System.out.println("Кол-во дырочек:");
        this.dotCoast = scanner.nextInt();
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

        return ("Вид товара: " + this.type + " Название товара: " + this.name + " Цена товара: " + this.cost + " Жирность: " + this.oiliness + " Кол-во дырочек: " + this.dotCoast);

    }
}
