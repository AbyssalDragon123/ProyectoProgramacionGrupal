/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Conexion {
    public static Connection getConexion(){
       String url = "jdbc:sqlserver://localhost:1433;"
    + "database=escuela;"
    + "user=sa;"
    + "password=1234;"
    + "encrypt=true;"
    + "trustServerCertificate=true;";


        try{
            Connection con = DriverManager.getConnection(url);
        return con;    
        } catch(SQLException e){
        System.out.println(e.toString());
        return null;
        }
    }
}
