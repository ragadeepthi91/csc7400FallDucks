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
 *  Mallard duck for pond
 */
public class Mallard extends Duck {
 
  /** 
   *  Creates a new Mallard duck with appropriate bitmaps and GIFs
   */
  public Mallard() 
  {
    super("mallard_still.bmp", "mallard_fly.gif", "mallad_swim.gif");
	System.out.println("I am a Mallard duck");
  }
}
