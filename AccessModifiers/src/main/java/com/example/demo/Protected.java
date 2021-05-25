package com.example.demo;

class Soldier {
    // protected method
    protected void display() {
        System.out.println("I am an Indian");
    }
}

class Dog extends Soldier {
    public static void main(String[] args) {

        // create an object of Soldier class
        Soldier soldier = new Soldier();
         // access protected method
        soldier.display();
    }
}