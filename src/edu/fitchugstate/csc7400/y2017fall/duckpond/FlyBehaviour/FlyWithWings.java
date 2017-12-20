/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour;

import external.GIF;

/**    
 * Fly with wings for duck
 */
public class FlyWithWings implements FlyBehaviour
{
	/**
	 * Initializes fly image
	 * @param flying fly image
	 */
	   public FlyWithWings(GIF flying)
	   {
		   this.flying = flying;
	   }
	/** 
	 *  Displays a flying animation of duck
	 */ 
      public void fly() 
      {
    	  flying.animate();
       }
      private GIF flying;
}
