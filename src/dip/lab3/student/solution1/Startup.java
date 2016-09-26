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
        KeyboardInput k1 = new KeyboardInput();
        MessageRandomizer mr1 = new MessageRandomizer();
        
        //Create Output Objects
        ConsoleOutput c1 = new ConsoleOutput();
        GUIOutput g1 = new GUIOutput();
        
        //Create MessageService
        MessageService m1 = new MessageService(mr1, c1);
        
        m1.doMessage();
        
    }
}
