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
 * Fly with wings for duck
 */
public class FlyWithWings implements FlyBehaviour{
	   
	/** 
	 *  Displays that duck can fly and a flying animation
	 */ 
      public void fly(GIF flying) 
      {
    	  System.out.println("I'm flying");
    	  flying.animate();
       }
}
