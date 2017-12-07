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
 *  Redhead duck for pond
 */
public class Redhead extends Duck {
	
  /** 
   *  Creates new redhead duck with appropriate bitmaps and GIFs.
   */
  public Redhead() {
	super("redhead_still.bmp", "redhead_fly.gif", "redhead_swim.gif");
	System.out.println("I am a Redhead duck");
  }
}
