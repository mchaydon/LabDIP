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
public class KeyboardInput implements Input{
    private Scanner input = new Scanner(System.in);
    private String message;

    @Override
    public void setMessage() {
        System.out.print("What would you like to be your message? ");
        message = input.nextLine();
    }

    @Override
    public Object getMessage() {
        return message;
    }
    
}
