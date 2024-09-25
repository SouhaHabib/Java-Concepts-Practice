package org.example;

public class Test2 implements Calcule{
    @Override
    public double addition(double a, double b) {
        int x = 7;
        double a2 = a + b + x;
        System.out.println("Ceci est l'Addition dans la classe Test 2: " + a2);
        return a2;
    }

    @Override
    public double soustraction(double a, double b) {
        int y = 2;
        double s2 = (a - b) - y;
        System.out.println("Ceci est la Soustraction dans la classe Test 2: " + s2);
        return s2;
    }

    public double division (double a, double b) {

        System.out.println("Ceci est la Division dans la classe Test 2: " + (a/b));
        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        double z = 2.3;
        double m2 = (a * b)* z;
        System.out.println("Ceci est la Multiplication dans la classe Test 2: " + m2);
        return m2;
    }

    @Override
    public double moyenne(double a, double b, double c) {
        int m = 5;
        double moy2 = (a + b + c + m) /4 ;
        System.out.println("Ceci est la Moyenne dans la classe Test 2: " + moy2);
        return moy2;
    }

    @Override
    public double pourcentage(double a, int b) {
        int f = 34;
        double p2 = ((a +f) * b ) /100;
        System.out.println("Ceci est la pourcentage dans la classe Test 2: " + p2);
        return p2;
    }
}
