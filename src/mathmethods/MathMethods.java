/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathmethods;

import java.text.DecimalFormat;


/**
 *
 * @author rkaune
 */
public class MathMethods {

    /**
     * @param args the command line arguments     
     */
    public static void main(String[] args) {
       long      a = 11+27 ;  // adding two constant values
       long      b=a/11;     //adding a variable and a constant
       long      c=a*b;     //adding two variables
                 a++;
                 b--;
                 c%=7;
                 System.out.println(a);
                 System.out.println(b);
                 System.out.println(c);
                 
                 
  
        }

   
    
}