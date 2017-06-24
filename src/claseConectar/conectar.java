package claseConectar;

import java.sql.*;
import javax.swing.*;

public class conectar {
    
    
private static Connection conect;
private static final String driver = "com.mysql.jdbc.Driver";
private static final String usuario ="root";
private static final String contra ="";
private static final String url = "jdbc:mysql://localhost/proyecto_ucq";

public conectar(){
        conect =null;
        
      try {
             
           //Cargamos el Driver MySQL
         Class.forName(driver);
         conect = DriverManager.getConnection(url,usuario,contra);
         if(conect != null){
         System.out.println("Conexion correcta");
         } 
         
        } catch (ClassNotFoundException |SQLException e) {
            System.out.println( e + "No hubo conexion");
        }
}
//retorno abd
public Connection getConnection(){
    return conect;
}
 public void Desconectar(){
     
     conect = null;
     if(conect == null){
         System.out.println("Conexión  Terminada");
     
     }
 
 }

}
