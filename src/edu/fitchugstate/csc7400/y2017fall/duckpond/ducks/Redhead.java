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
 *  Redhead duck for pond
 */
public class Redhead extends Duck {
	
	/** 
	   *  Creates a new Red head duck with appropriate bitmap and behavior using factory
	   */
  public Redhead() 
  {
	super("redhead_still.bmp", new DuckBehaviorFactory("redhead_fly.gif", "redhead_swim.gif"));
  }
}
