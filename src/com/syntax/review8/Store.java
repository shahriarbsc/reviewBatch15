package com.syntax.review8;

public class Store {

    public static void main(String[] args) {

        Furniture chair = new Chair();
        chair.assemble();
        chair.comfort(); // run time polymorphism

        Furniture table = new Table();
        table.assemble();
        table.comfort(); //run time polymorphism


        Table t = new Table();
        t.assemble();
        t.buildTable();
        t.comfort();
        t.buildTable("Wood");

        Chair.breaks();
        Furniture.breaks(); // static method called by using class name


        Furniture Chair=new Chair();
        chair.assemble();
        chair.comfort(); // runtime polymorphism
        // proof that method breaks is not overridden
        chair.breaks(); // since we are not overriding methods breaks will be executed from parent

                        // this is also not the right way to call static method
    }
}
