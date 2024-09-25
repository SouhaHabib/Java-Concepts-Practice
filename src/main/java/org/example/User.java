package org.example;

public class User {
    private String name;
    private String email;
    private String password;
    private int age;
    private double salary;
    double [] tab = new double [3];

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double[] getTab() {
        return tab;
    }
    public void setTab(double[] tab) {
        this.tab = tab;
    }

    public User() {
    }

    public User(String name, String email, String password, int age, double salary) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.salary = salary;
    }

    public void Affiche() {
        System.out.println("Les coordonées sont :" + this.name + "||" + this.email + "||" + this.password + "||" + this.age + "||" + this.salary);
    }

    public double Augmenter ( double x, int a, int b , int c) {
        double result= this.salary + x;

        System.out.println("Le nouveau salaire est:" + result);

        if( result > 2500.0 ){
            System.out.println("Vous avez le droit  d’un crédit");
            double reste = result - (((result * 35) / 100) + (73.0 * 28));
            System.out.println("Le reste du Salaire après le crédit:" + reste);
            tab [0] = (result*a)/100;
            tab [1] = (result*b)/100;
            tab [2] = (result*c)/100;

            double somme = 0;
            for (int i=0; i< tab.length; i++) {
                somme = somme + tab[i];
            }

            double moyenne = somme / tab.length;

            System.out.println("Le Crédit du tab[0] est: " + tab[0] + "  ");
            System.out.println("Le Crédit du tab[1] est: " + tab[1] + "  ");
            System.out.println("Le Crédit du tab[2] est: " + tab[2] + "  ");
            // System.out.println("Le Crédit du tab[3] est: " + tab[3] + "  ");

            System.out.println("La Moyenne est:" + moyenne);
            
        } else if (result==2500.0) {
            System.out.println("Vous avez le droit  d’un crédit mais avec des contraintes");
            double resteContrainte = result - (((result * 35) / 100) + (73.0 * 28));
            System.out.println("Le rest du Salaire:" + resteContrainte);
        }

        else {
                System.out.println("Vous n'avez pas le droit  d’un crédit");
            }
        return result;
    }


}
