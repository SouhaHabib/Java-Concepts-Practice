package org.example;

public class Test implements Calcule {
    @Override
    public double addition(double a, double b) {

        System.out.println("Ceci est l'addition dans la classe Test: " + (a+b));
        return a + b;
    }

    @Override
    public double soustraction(double a, double b) {
        System.out.println("Ceci est la Sousstraction dans la classe Test: " + (a-b));
        return a - b;
    }

    public double division (double a, double b) {

        System.out.println("Ceci est la Division dans la classe Test: " + (a/b));
        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        System.out.println("Ceci est la Multiplication dans la classe Test: " + (a*b));
        return a * b;
    }


    @Override
    public double moyenne(double a , double b , double c) {

        double m = (a + b + c)/3 ;
        System.out.println("Ceci est la Moyenne dans la classe Test: " + m);
        return m;
    }

    @Override
    public double pourcentage(double a, int b) {
        double p = (a * b)/100;
        System.out.println("Ceci est la pourcentage dans la classe Test: " + p);
        return p;
    }
}
