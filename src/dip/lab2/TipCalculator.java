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
public interface TipCalculator {
    public abstract double getTip();
    
    public abstract void setItemTotal(double itemTotal);
    
    public abstract void setServiceRating(ServiceQuality q);
    
    public abstract ServiceQuality getServiceQuality();
}
