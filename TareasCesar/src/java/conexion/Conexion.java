/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
        Connection con;
       public Conexion() {
            try {
                String dbDriver = "com.mysql.jdbc.Driver";
                String dbURL = "jdbc:mysql://localhost:3306/";
                // Database name to access
                String dbName = "";//Aqui el nombre de tu BD
                String dbUsername = "";// nombre
                String dbPassword = ""; //contra
                
                Class.forName(dbDriver).newInstance();
                con = DriverManager.getConnection(dbURL + dbName,
                        dbUsername,
                        dbPassword);
                System.out.println("se conecto");
            } catch (Exception e ) {
                System.err.println("Error"+e);
            }
        
        }
       public Connection getConnection(){
           return con;
       }

}

