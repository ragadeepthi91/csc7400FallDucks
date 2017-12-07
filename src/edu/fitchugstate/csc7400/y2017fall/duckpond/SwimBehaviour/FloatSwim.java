/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/

package edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour;

import external.GIF;
/**    
 * Float behaviour for duck
 */
public class FloatSwim implements SwimBehaviour{
	  /** 
	   *  Displays that duck can float
	   */  
      public void swim(GIF swimming) 
      {
    	  System.out.println("I cant swim, I float");  
      }
}
