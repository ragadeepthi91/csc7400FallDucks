/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.ducks;
import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;



/** 
 *  Rubber duck for pond
 */
public class RubberDuck extends Duck {
	
  /** 
   *  Creates a new rubber duck
   */
  public RubberDuck() {
	super("rubber_duck_still.bmp", null, "rubber_duck_swim.gif");
	
	System.out.println("I am a rubber duck");
  }
}
