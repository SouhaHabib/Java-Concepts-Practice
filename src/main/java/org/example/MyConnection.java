package org.example;

import java.sql.Connection;
import java.sql.*;
public class MyConnection {

      static String url = "jdbc:mysql://localhost:3306/mydatabase";
      static String user = "root";
      static String password = "";

      static String query2 = "Select * from User ";
      static String query3 = "Select * from User where User.name ='Souha'";
      static String query4 = "DELETE FROM User WHERE User.id = 4";
      static String q4="DELETE FROM user WHERE id=4";

    public static void main(String[] args) {
        try  {   Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");
            System.out.println("Connected to database");
            Statement stmt = connection.createStatement();

            ResultSet rs2 = stmt.executeQuery(query2);


        while (rs2.next()) {

            System.out.println("Resultat d'affichage:" + rs2.getString("name")+ "email : " + rs2.getString("email"));
        }
             ResultSet rs3 = stmt.executeQuery(query3);

        while (rs3.next()) {
            System.out.println("Resultat for User Souha:" + rs3.getString("name")+ "email : " + rs3.getString("email"));
        }

//        ResultSet rs4 = stmt.executeQuery(q4);
//            System.out.println("****test****");

        if (rs3==null) {
            throw new MyException("Request is not verified");
        }

        } catch (SQLException e) {} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
