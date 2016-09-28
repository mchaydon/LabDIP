/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class KeyboardInput implements MessageInput{
    private Scanner input = new Scanner(System.in);
    private String message;

    @Override
    public final void inputMessage() {
        System.out.print("What would you like to be your message? ");
        message = input.nextLine();
    }

    @Override
    public final String ouputMessage() {
        return message;
    }
    
}
