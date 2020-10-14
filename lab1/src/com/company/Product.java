package com.company;

import java.util.Scanner;

public abstract class Product {

    public String type;//вид товара
    public String name;//название товара
    public int cost;//цена


    public abstract void init(Scanner scanner); // считывание параметров с консоли
    public abstract int getCost(); // возвращает стоимость товара
    public abstract boolean canBuy(int balance); // определяет, можно ли купить товар за имеющуюся сумму
    //public String toString(); // возвращается состояние объекта в виде строки(определяется только в наследниках
    //public abstract void setCost();


/*
    private int maxSpeed;

    public abstract void gas();

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }*/
}


