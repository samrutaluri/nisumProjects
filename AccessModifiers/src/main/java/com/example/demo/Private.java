package com.example.demo;

class Data {
    // private variable
    String name;
}

public class Private {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "sai";
    }
}