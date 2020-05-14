package com.company;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void Meow(int num){
        for(int i = 0; i < num; i++){
            System.out.println("Meow meow motherfucker");
        }
    }

}
