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
public class MyTemplatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------------no 1 --------");
        Insurance ins1 = new BasicInsurance();
        ins1.options(true, false, true);
        System.out.println("\tTotal Basic Insurance cost will be :"+ ins1.getCost());
        
        System.out.println("------------------no 2 ------");
        Insurance ins2 = new PremiumInsurance();
        ins2.options(false, true, true);
        System.out.println("\tTotal premium Insurance cost will be :"+ ins2.getCost());
        
        System.out.println("--------------no 3 ----------");
        Insurance ins3 = new PremiumInsurance();
        ins3.options(true, true, true);
        System.out.println("\tTotal premium Insurance cost will be :"+ ins3.getCost());
        
        System.out.println("---------------no 4 ---------");
        Insurance ins4 = new BasicInsurance();
        ins4.options(false, true, false);
        System.out.println("\tTotal Basic Insurance cost will be :"+ ins4.getCost());
        
        System.out.println("---------------no 5 ---------");
        Insurance ins5 = new BasicInsurance();
        ins5.options(true, true, true);
        System.out.println("\tTotal Basic Insurance cost will be :"+ ins5.getCost());
        
    }
    
}
