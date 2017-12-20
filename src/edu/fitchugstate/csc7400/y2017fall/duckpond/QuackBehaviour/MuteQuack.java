/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour;
/**    
 * Mute behavior for duck
 */
public class MuteQuack implements QuackBehaviour{
	/**
	 * Initializes sound message
	 * @param quacking message to be displayed
	 */
	public MuteQuack(String quacking)
	{
		this.quacking = quacking;
	}
      /** 
	   *  Displays the message that a duck a cant quack
	   **/ 
      public void quack()
      {
    	  System.out.println(""+quacking);
      }
      private String quacking;
}
