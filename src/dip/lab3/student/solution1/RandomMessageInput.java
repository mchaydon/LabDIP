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
public class RandomMessageInput implements Input{
    String[] messages = {"Good morning!", "Your dreams don't work unless you do.", "Doubt kills dreams more than failure ever will", "Good-bye and hello, as always." };
    Random rand = new Random();
    int number;
    
    @Override
    public final void setMessage() {
        number = rand.nextInt(4);
    }

    @Override
    public final Object getMessage() {
        return messages[number];
    }
    
    
}
