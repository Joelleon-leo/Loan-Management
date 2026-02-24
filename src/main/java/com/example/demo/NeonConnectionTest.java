package com.example.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NeonConnectionTest {
    private static final String URL = "jdbc:postgresql://ep-wild-band-aiw3y8or-pooler.c-4.us-east-1.aws.neon.tech/neondb?user=neondb_owner&password=npg_uaRzs52lnkpK&sslmode=require&channelBinding=require";
    private static final String USER = "neondb_owner";
    private static final String PASSWORD = "npg_uaRzs52lnkpK";


    public static void main(String[] args) {
       try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * from customer");

            while (rs.next()) {
                System.out.println("Customer Name: " + rs.getString("customer_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
