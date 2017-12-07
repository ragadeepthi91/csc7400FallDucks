/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour;
import external.GIF;

/**    
 * Can't fly behaviour for duck
 */
public class CantFly implements FlyBehaviour{
	/** 
	 *  Displays that duck can't fly
	 */ 
      public void fly(GIF flying) 
      {
    	  System.out.println("I cant Fly"); 
    	 }
}
