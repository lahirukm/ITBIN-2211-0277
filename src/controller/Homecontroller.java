/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Homedata;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sithumi
 */
public class Homecontroller {
    
        // Method to get data from Data class
    public DefaultTableModel getData() {
        return new Homedata().getData();
    }
    public void datapasing_1(String itemname, int tokenno , int price) {
        new Homedata().passing_1(itemname,tokenno, price);
    }

    public void datapasing(int aa, int cd, int ef) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }


