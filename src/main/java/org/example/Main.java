package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SingletonClass singleton=SingletonClass.getINSTANCE("Ravi");
        System.out.println(singleton.value);

        SingletonClass singleton1=SingletonClass.getINSTANCE("Vishwajeet");
        System.out.println(singleton1.value);
    }
}

//it will print ravi n Ravi only coz once instance is created now it will load the
// same instance again ans again , this is singleton design pattern;