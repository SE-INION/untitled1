package org.example;
import  java.sql.Connection;
import java.sql.DriverManager;

public class bdConnection {

 public  static Connection getConnection(){
    return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/postgres",
            "postgres",
            "112507 "
    );
 }
}
