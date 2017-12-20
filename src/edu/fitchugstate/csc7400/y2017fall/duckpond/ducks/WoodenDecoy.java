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
 *  Wooden decoy duck.
 */
public class WoodenDecoy extends Duck {
	/** 
	   *  Creates a new decoy duck with appropriate bitmap and behavior using factory
	   */
  public WoodenDecoy() 
  {
    super("decoy_still.bmp", new DecoyDuckBehaviorFactory(null, "decoy_swim.gif"));
  }
  
}
