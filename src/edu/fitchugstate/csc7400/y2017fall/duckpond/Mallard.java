/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

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
    quackBehaviour = new Quack();
	flyBehaviour = new FlyWithWings();
	swimBehaviour = new GeneralSwim();
	System.out.println("I am a Mallard duck");
  }
}
