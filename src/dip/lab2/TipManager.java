/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Mike
 */
public class TipManager {
    private Tip tip;
    
    public final void setTypeOfTip(Tip tip){
        this.tip = tip;
    }
    
    public final double getTipAmount(){
       return tip.getTip();
    }
    
    public final void setBagAmount(int bag){
        tip.setBaseTipPerBag(bag);
    }
}
