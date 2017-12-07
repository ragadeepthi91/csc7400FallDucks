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
 *  Wooden decoy for the duck.
 */
public class WoodenDecoy extends Duck {
  /** 
   *  Creates a new wooden decoy with appropriate bitmaps and GIFs
   */
  public WoodenDecoy() 
  {
    super("decoy_still.bmp", null, "decoy_swim.gif");
	System.out.println("I am a wooden decoy duck");
  }
  
}
