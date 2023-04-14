/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import business.Formando;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.DBWorker;

/**
 *
 * @author efapp0122
 */
public class TestBD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        DBWorker workerBD = new DBWorker("192.168.64.8:3306", "rodrigo", "123", "java_formando");
            
        Formando f = new Formando("Rodrigo", 34, "Programador", "EFA", 15.7);
        
        workerBD.guardar(f);
     
        System.out.println(workerBD.getAllFormandos());
        
    }
    
}
