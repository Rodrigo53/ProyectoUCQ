package proyecto_ucq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion1 {
    
    
    Connection conectar=null;
    
    
 
  
    public static String conexion = "jdbc:mysql://localhost:3306/proyecto_ucq";
    public static String usuario = "root";
    public static String pass = "";
    public Statement stmt;//consultas
    public static Connection con;
    public ResultSet rs;
    Statement st;
  
    public  Conexion1(){
       
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = (Connection) DriverManager.getConnection(conexion, usuario, pass);
            st = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Conexion correcta");
        }
        catch (Exception e)
        {
           System.out.println( e + "No hubo conexion");
        }
       
        
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Ivan".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new Acceso_Oracle().setVisible(true);
                new Conexion1();
            }
        });
    }
    /*
    public  Conexion1(){
       
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            con = (Connection) DriverManager.getConnection(conexion, usuario, pass);
            st = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Conexion correcta");
        }
        catch (Exception e)
        {
           System.out.println( e + "No hubo conexion");
        }
        
    }
public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conexion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new Acceso_Oracle().setVisible(true);
                new Conexion1();
            }
        });
    }
   */
    }
    