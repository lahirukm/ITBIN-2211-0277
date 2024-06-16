/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package controller;


public class Employeecontroller {
    
    public void datapasing(String name, String address, int tp_no, int workingday, int bonus1, int salary ){
        new Model.Data().passing(name, address, tp_no, workingday, bonus1, salary);
    }
}
*/
package controller;

import Model.Data;
import javax.swing.table.DefaultTableModel;

public class Employeecontroller {
        // Method to get data from Data class
    public DefaultTableModel getData() {
        return new Data().getData();
    }
    public void datapasing(String name, String address, int tp_no, int workingday, int bonus1, int salary) {
        new Data().passing(name, address, tp_no, workingday, bonus1, salary);
    }
}





