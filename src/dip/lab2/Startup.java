package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup { 
    public static void main(String[] args) {
        TipManager mgr = new TipManager();
        
        //Create different types of tips 
        Tip tipFoodService = new FoodServiceTipCalculator(ServiceQuality.POOR, 15);
        Tip tipBaggage = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 15);
        
        //Pass the manager the first tip type
        mgr.setTypeOfTip(tipFoodService);
        /* While the Food Service Calculator does not calculate off of items
        ** assigning a value does not break the code.*/
        mgr.setBagAmount(5);
        System.out.println(mgr.getTipAmount());
        
        //Pass the manager the second tip type
        mgr.setTypeOfTip(tipBaggage);
        mgr.setBagAmount(5);
        System.out.println(mgr.getTipAmount());
        
        /* Tip manager relies on the tip interface. Then the individual types
        **  of tips extend that interface.*/
        
        
        
    }

}