
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airflight;

import com.mysql.jdbc.Connection;
import static java.lang.Class.forName;
import java.sql.DriverManager;

/**
 *
 * @author NAVAJEEVAN REDDY
 */
public class DBconnection {
    Connection DBconnection;
public    Connection connect()
    {
        try{
        Class.forName("com.mysql.jdbc.driver");
        System.out.println("connection success");
        
    }catch(Exception e)
    {
     System.out.println("error="+e);   
    }
    String url="jdbc:mysql://localhost:3306/myapp";
            
    try{
        DBconnection=(Connection) DriverManager.getConnection(url,"root","");
        System.out.println("connection");
        
    }
    catch(Exception e)
    {

        System.out.println("error="+e);
    }
    return DBconnection;
    }

   }
    
    

