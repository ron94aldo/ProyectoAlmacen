
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionMySQL {
    //Incorporar libreria SQL
    private static String driver = "com.mysql.jdbc.Driver";
    //Nombre de la base de datos
    private static String database = "almacen";
    //Servidor
    private static String hostname = "localhost";
    //Puerto
    private static String port = "3306";
    //Usuario
    private static String username = "root";
    //Clave
    private static String password = "";
    //Url de conexion a la base de datos
    private static String connectionURL;
    //Conector
    public static Connection conn;
   
    // Constructor de la clase Conexion
    public ConexionMySQL(){
        this.connectionURL = "jdbc:mysql://";
        this.connectionURL += hostname + ":" + port + "/" + database;
        this.connectionURL += "?autoReconnect=true&useSSL=false";
        this.getConnection();
    }
    
    public static Connection getConnection(){
        try {
            Class.forName(driver);
            try {
                conn = DriverManager.getConnection(connectionURL, username, password);
            } catch(SQLException e) {
                System.out.print("No se puede conectar: "+e.getMessage());
            }
        } catch(ClassNotFoundException ex) {
            System.out.print("La clase "+driver+" no existe en el sistema");
        }
        return conn;
    } 
    

  
}