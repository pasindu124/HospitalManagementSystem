package mypackge;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    public static Statement getStatement(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            Statement stat= con.createStatement();
            return stat;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
