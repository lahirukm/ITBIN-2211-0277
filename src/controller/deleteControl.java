/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Sithumi
 */
public class deleteControl {
    
    
    public void delete(int id){
        
        new Model.deleteProduct().delete(id);
        
    }
    
}
