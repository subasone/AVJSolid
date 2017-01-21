/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.avjsolid;
import com.leapfrog.avjsolid.command.MathCommand;
import com.leapfrog.avjsolid.command.MathCommandFactory;


/**
 *
 * @author subasone
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 2, y = 4;
        
        MathCommandFactory mfc = new MathCommandFactory();
        MathCommand cmd = mfc.get(5);
        double result = cmd.execute(x, y);
        System.out.println(result);
    }
    
}
