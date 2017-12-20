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
 *  Mallard duck for pond
 */
public class Mallard extends Duck {
 
  /** 
   *  Creates a new Mallard duck with appropriate bitmap and behavior using factory
   */
  public Mallard() 
  {
    super("mallard_still.bmp", new DuckBehaviorFactory("mallard_fly.gif", "mallad_swim.gif"));
  }
}
