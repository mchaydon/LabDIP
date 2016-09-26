/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author Mike
 */
public class MessageRandomizer implements Input{
    String[] messages = {"Good morning!", "Your dreams don't work unless you do.", "Doubt kills dreams more than failure ever will" };
    Random rand = new Random();
    int n;
    
    @Override
    public void setMessage() {
        n = rand.nextInt(3);
    }

    @Override
    public Object getMessage() {
        return messages[n];
    }
    
    
}
