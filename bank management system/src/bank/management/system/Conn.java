
package bank.management.system;

import java.sql.*;

public class Conn {
           
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "srishti2022@");
            s = c.createStatement();
        }
           
        catch (SQLException e) 
        {
            System.out.println(e);
        }
    }

}    
    
    
