package com.company;

import java.util.Scanner;

public class Technic extends Product {

    public int powerkVt;
    public String color;

    @Override
    public void init(Scanner scanner){

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
}
