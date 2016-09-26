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
public class Startup {
    public static void main(String[] args) {
        //Config
        //Create Input Objects
        KeyboardInput keyboardInput = new KeyboardInput();
        RandomMessageInput randomMessageInput = new RandomMessageInput();
        
        //Create Output Objects
        ConsoleOutput consoleOuput = new ConsoleOutput();
        GUIOutput guiOutput = new GUIOutput();
        
        //Create MessageService
        MessageService m1 = new MessageService(randomMessageInput, guiOutput);
        
        m1.doMessage();
       
    }
}
