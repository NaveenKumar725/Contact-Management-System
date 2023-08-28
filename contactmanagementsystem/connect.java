
package contactmanagementsystem;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class connect {
    
    Connection c;
    Statement s;
    
    connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/contactmanagement","root", "");
            s=c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    } public static void main(String[] args) {
    Connection connect = null;}
}