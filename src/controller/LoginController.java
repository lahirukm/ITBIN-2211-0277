/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import View.Homes;
import Model.Dbconnector;
import Model.DBSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.Logins;


/**
 *
 * @author Sithumi
 */
public class LoginController {
    public static void login(String usName, String pass) {
 try {
 String username = null; // initial value of the username
 String password = null; // initial value of the password
 ResultSet rs = new DBSearch().searchLogin(usName);
//Process the Query
 while (rs.next()) {
        username = rs.getString("username"); //assign database login name to the variable
        password = rs.getString("password"); //assign database password to the variable
 }
 if (username != null && password != null) {
 if (password.equals(pass)) {
 System.out.println("Login Successfull");
 Logins.getFrames()[1].dispose();
 new Homes().setVisible(true);
 } else {
    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 } else {
JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE);
 }
 Dbconnector.closeCon();
 } catch (SQLException ex) {
Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
 }
 }

    public static void Logins(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
