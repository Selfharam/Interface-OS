package com.company;

import java.util.Scanner;

public class Toy extends Product {

    public String color;

    @Override
    public void init(Scanner scanner){
        //System.out.println("Вид товара:");
       /* System.out.println("Название товара:");
        System.out.println("Цена товара:");

        int n = scanner.nextInt();*/
    }

    @Override
    public int getCost() {
        //System.out.println("Седан тормозит!");
        return cost;
    }

    @Override
    public boolean canBuy(int balance){
        return this.cost <=balance;
    }
    /*
    @Override
    public void setCost() {
        cost = 5;
        //System.out.println(cost);
    }*/




    //public abstract int getCost();

}