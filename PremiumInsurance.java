/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytemplatepattern;

/**
 *
 * @author arash
 */
public class PremiumInsurance extends Insurance{
    private final double price1=56.5; 
    private final double price2=232.3; 
    private final double price3=182.0; 
    private double totalCost=0;
    @Override
    void options(boolean opt1, boolean opt2, boolean opt3) {
        if (opt1){
            System.out.println("Payment "+price1+ " for smoking.");
             totalCost +=price1;
       }
        if (opt2){
            System.out.println("Payment "+price2+ " for unexpected events.");
             totalCost +=price2;
       }
        if (opt3){
            System.out.println("Payment "+price3+ " for child support after death.");
           totalCost +=price3;
        }
    }

    @Override
    double getCost() {
         return totalCost;
    }
    
}
