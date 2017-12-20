/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour;
import external.GIF;
/**    
 * Swim behaviour for duck
 */
public class GeneralSwim implements SwimBehaviour{
	/**
	 * Initializes swim image
	 * @param swimming swim image
	 */
	 public GeneralSwim(GIF swimming)
	   {
		   this.swimming = swimming;
	   }
	  /** 
	   * Animates swim image
	   */  
      public void swim() 
      {
    	  swimming.animate();
       }
      private GIF swimming;
}
