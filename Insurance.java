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
public abstract class Insurance {
     boolean opt1, opt2, opt3;
     abstract void options(boolean opt1, boolean opt2, boolean opt3 );
     abstract double getCost();
     public final void insurance(){
         //  choose options for insurance
         options(opt1,opt2,opt3 );
         
         // give total cost to the applicant
         getCost();
     }
}
