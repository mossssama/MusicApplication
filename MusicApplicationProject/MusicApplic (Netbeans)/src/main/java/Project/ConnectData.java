/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class ConnectData {

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public String URL,username,password;
   public Connection connect;
   
   
   public ConnectData(String URL , String username  , String password)
   {
       this.URL = URL ;
       this.username = username;
       this.password = password;
       connect();
       
   }
   private boolean connect(){
        try{
            // Get a connection to database
            
             connect = DriverManager.getConnection(this.URL ,this.username , this.password);
            System.out.println("DB: Connecteed ......");
            return(true);
            }
        catch(Exception e){
            // if the connection fails print the exception and return false 
        
            System.out.println(e);
            System.out.println("DB: Failed.............................!");
            return(false);
            }
    }
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectData ab= new ConnectData("jdbc:mysql://localhost:3306/login?zeroDateTimeBehavior=convertToNull","root","");
    }
    
}
