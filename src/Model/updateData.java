/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Sithumi
 */
public class updateData {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int id, String name, String address, int num,int b, int s){
        
        con = Dbconnector.conn();
        
        try {
            String sqlquery = "UPDATE employee_details SET name = '"+name+"', address = '"+address+"', tp_no = '"+num+"', bonus = '"+b+"', salary = '"+s+"' WHERE emp_id  = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPDATE UNSUCCESSFULY");
        }
    }
    
    
}
