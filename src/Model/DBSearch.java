/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBSearch {
 Statement stmt;
 ResultSet rs;
    private Object Dbconnecotor;
public ResultSet searchLogin(String usName) {
 try {
 stmt = Dbconnector.getStatementConnection();
 String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where username='"
+ name + "'");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }
}


