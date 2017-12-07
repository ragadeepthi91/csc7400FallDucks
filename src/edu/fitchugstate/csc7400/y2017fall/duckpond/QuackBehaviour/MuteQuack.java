/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour;
/**    
 * Mute behaviour for duck
 */
public class MuteQuack implements QuackBehaviour{
      /** 
	   *  Displays that duck can't quack
	   */ 
      public void quack()
      {
    	  System.out.println("Cannot quack");
      }
}
