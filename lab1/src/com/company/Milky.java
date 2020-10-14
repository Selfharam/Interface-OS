package com.company;

import java.util.Scanner;

public class Milky extends Product{

    public int oiliness;

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
