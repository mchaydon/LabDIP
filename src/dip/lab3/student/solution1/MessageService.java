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
public class MessageService {
    private MessageInput MessageInput;
    private MessageOutput MessageOutput;
    
    public MessageService(MessageInput input, MessageOutput output){
        this.MessageInput = input;
        this.MessageOutput = output;
    }
    
    public final void processMessage(){
        MessageInput.inputMessage();
        MessageOutput.outputMessage(MessageInput.ouputMessage());
    }
}
