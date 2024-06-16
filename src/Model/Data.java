/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package Model;

import com.sun.jdi.connect.spi.Connection;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Data {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void passing(String name, String address, int tp_no, int workingday, int bonus1, int salary ){
    
    Connection con = null;
    PreparedStatement pst = null;
    
    try {
        
            String sqlquery = "INSERT INTO products(name, address, working_day, tp_no, bonus, salary) VALUES (?, ?, ?, ?, ?, ?)";
           
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setInt(3, tp_no);
            pst.setInt(4, workingday);
            pst.setInt(5, bonus1);
            pst.setInt(6, salary);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
*/
package Model;

//import com.sun.source.tree.TryTree;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Data {
    Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
   // Method to retrieve data from the database
    public DefaultTableModel getData() {
        
        DefaultTableModel model = new DefaultTableModel();
        try {
            con = Dbconnector.conn();
            String sqlquery = "SELECT * FROM employee_details";
            pst = con.prepareStatement(sqlquery);
            rs = pst.executeQuery();
            
            // Add columns to the table model
            model.addColumn("EMP_ID");
            model.addColumn("NAME");
            model.addColumn("ADDRESS");
            model.addColumn("WORKING_DAY");
            model.addColumn("TP_NO");
            model.addColumn("BONUS");
            model.addColumn("SALARY");
            
            // Add rows to the table model
            while (rs.next()) {
                Object[] row = new Object[7];
                for (int i = 0; i < 7; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
        return model;
    }

    // Method to insert data into the database (existing method)
    public void passing(String name, String address, int tp_no, int workingday, int bonus1, int salary) {
        // Your existing code for inserting data into the database
        Connection con = null;
        PreparedStatement pst = null;
        
        try {
            con = Dbconnector.conn(); // Initialize the connection here
            String sqlquery = "INSERT INTO employee_details(name, address, tp_no, working_day, bonus, salary) VALUES (?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setInt(3, tp_no);
            pst.setInt(4, workingday);
            pst.setInt(5, bonus1);
            pst.setInt(6, salary);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Inserted SUCCESSFULLY");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
    }

    public void updateEmployee(int empId, String name, String address, int tp_no, int workingday, int bonus, int salary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getEmpId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTpNo(int tp_no) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setWorkingDay(int workingday) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setBonus(int bonus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setSalary(int salary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ResultSet fetchTableData() {
        con = Dbconnector.conn();
        try {
            String sql = "SELECT itemname, tokenno , price FROM home_details";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    
    
}

