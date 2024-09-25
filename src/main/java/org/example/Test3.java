package org.example;

public class Test3 {
    double sold;

    public Test3(double sold) {
        this.sold = sold;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    // Méthode de réduction
    public double reduction(double x) {
        if (x > sold) {
            throw new InsufficientException("Invalid Operation: Insufficient funds, x is greater than sold");
        }
        double reduc = sold - x;
        sold = reduc;  // Mise à jour du solde après réduction
        System.out.println("Valid Operation");
        return reduc;  // Retourne le nouveau solde
    }
}
