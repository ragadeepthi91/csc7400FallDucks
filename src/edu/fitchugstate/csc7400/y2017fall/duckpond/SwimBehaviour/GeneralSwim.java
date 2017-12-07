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
 * Swim behaviour for duck
 */
public class GeneralSwim implements SwimBehaviour{
	  /** 
	   *  Displays that duck can swim and animates image
	   */  
      public void swim(GIF swimming) 
      {
    	  System.out.println("I'm Swimming");
    	  swimming.animate();
       }
}
