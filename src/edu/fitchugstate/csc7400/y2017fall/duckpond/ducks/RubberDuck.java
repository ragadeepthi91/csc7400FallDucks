/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.ducks;
import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.*;

/** 
 *  Rubber duck for pond
 */
public class RubberDuck extends Duck {
	
	/** 
	   *  Creates a new Rubber duck with appropriate bitmap and behavior using factory
	   */
  public RubberDuck() 
  {
	super("rubber_duck_still.bmp", new RubberDuckBehaviorFactory(null, "rubber_duck_swim.gif"));
  }
  
}
