package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello SOUHA");

        User p = new User("Souha" , "souha@gmail.com" , "1234" , 28 , 2000);
        p.Affiche();


        System.out.println("*****************************ADMIN**************************************");

        Admin ad = new Admin("Roua" , "roua@gmail.com" , "book.ent", 23 , 1650 , "987abc") ;
        ad.DetailCodeAdmin();
        ad.Affiche();
        ad.Augmenter(1500.0, 30, 50 , 75 );

        System.out.println("*****************************CLIENT**************************************");

        Client c = new Client("Asma" , "asma@gmail.com" , "network_3" , 35 , 1000.0 , "c1Z23");
        c.Affiche();
        c.DetailCodeClient();
        c.Augmenter(300.0, 10 , 20 , 30);

        System.out.println("*****************************INTERFACE**************************************");

        System.out.println("_______Test 1______");
        Test t = new Test();
        t.addition(12.9, 21.5);
        t.soustraction(21.9, 5.2);
        t.division(21, 7.3);
        t.multiplication(13.3, 5);
        t.moyenne(70.8 , 1.2 , 99.3);
        t.pourcentage(50.5 , 3);

        System.out.println("______Test 2_______");
        Test t2 = new Test();
        t2.addition(40, 51.7);
        t2.soustraction(81.9, 7);
        t2.division(24, 0);
        t2.multiplication(10.2, 9);
        t2.moyenne(90.8 , 11.23 , 97.37);
        t2.pourcentage(52.9 , 7);

        System.out.println("______ Exception in Test3_______");

        Test3 test = new Test3(100.0);

        try {
            double x = 150.0;  // Exemple de montant à retirer
            double remainingSold = test.reduction(x);  // Appelle la méthode reduction
            System.out.println("Remaining sold: " + remainingSold);

        } catch (InsufficientException e) {
            System.out.println(e.getMessage());  // Affiche le message de l'exception
        }

    }


}