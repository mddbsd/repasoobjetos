package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Clases.Productos;

public class Sql {
    private static String MYSQLJDBCDRIVERCLASS="com.mysql.cj.jdbc.Driver";
    private static String MYSQLDBURL = "jdbc:mysql://localhost:3306/sqljava";
    private static String MYSQLDBUSER = "empresa";
    private static String MYSQLDBUSERPASSWORD = "admin123456";
    private static String MYSQLQUERY = "select * from productos";

    public static ArrayList<Productos> consulta(){
        ArrayList<Productos> lista = new ArrayList<Productos>();
        try(Connection con = DriverManager.getConnection(MYSQLDBURL,MYSQLDBUSER,MYSQLDBUSERPASSWORD)){
            Class.forName(MYSQLJDBCDRIVERCLASS);
            Statement consulta = con.createStatement();
            ResultSet rs = consulta.executeQuery(MYSQLQUERY);
            

            while(rs.next()){
                /*System.out.println(rs.getString("cod") + " " + 
                                   rs.getString("nombre") + " " + 
                                   rs.getString("descripcion") + " " +
                                   rs.getInt("precio"));*/
                lista.add(new Productos(rs.getString("cod"),
                                       rs.getString("nombre"),
                                       rs.getString("descripcion"),
                                       rs.getInt("precio")));
            }
            
        }catch(ClassNotFoundException e){
            System.out.println("Driver no encontrado");
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("Error en la consulta " + MYSQLQUERY);
            e.printStackTrace();
        }
        return lista;
        
    }
}
