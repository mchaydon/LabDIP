/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Mike
 */
public class ConsoleOutput implements Output{

    @Override
    public void outputMessage(Object message) {
        System.out.println(message);
    }
 
    public static void main(String[] args) {
        String message = "Hello World";
        ConsoleOutput c1 = new ConsoleOutput();
        c1.outputMessage(message);
    }
}
