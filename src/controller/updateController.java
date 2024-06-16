/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Sithumi
 */
public class updateController {
    
    public void update(int id, String name, String address, int num,int b, int s){
       
        new Model.updateData().update(id, name, address, num, b, s);
    }
    
}
