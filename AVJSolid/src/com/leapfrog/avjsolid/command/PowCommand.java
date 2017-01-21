/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.avjsolid.command;

/**
 *
 * @author subasone
 */
public class PowCommand extends MathCommand {

    @Override
    public double execute(double x, double y) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double total = 1;
        for(int i = 1; i <= y; i++){
            total = total * x;
        }
        return total;
    }
    
}
