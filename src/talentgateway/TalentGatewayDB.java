/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talentgateway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author waels
 */
public class TalentGatewayDB {

   public static Connection mycon(){
 
 
     Connection con = null ;
     
     try {
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/talentgateway","root","");
         return con;
     } catch (SQLException e) {
         System.out.println(e);
         return null;
     }
     catch(ClassNotFoundException x){
         System.err.println(x);
         return null;
     }
 }
    public static void main(String[] args) {
        mycon();
    }
    /**
     * @param args the command line arguments
     */
    public static void TalentGatewayDB(String[] args) {
        mycon();
        // TODO code application logic here
    }
    
}
