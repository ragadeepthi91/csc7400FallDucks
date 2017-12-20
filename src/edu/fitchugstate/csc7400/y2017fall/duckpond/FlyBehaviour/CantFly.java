/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour;

/**    
 * Can't fly behavior for duck
 */
public class CantFly implements FlyBehaviour{
	/**
	 * Initializes fly message
	 * @param flymessage message to be displayed while flying
	 */
	public CantFly(String flymessage)
	{
		this.flymessage = flymessage;
	}
	/** 
	 *  Displays the fly message
	 */ 
      public void fly() 
      {
    	  System.out.println(""+flymessage); 
      }
      private String flymessage;
}
