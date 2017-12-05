/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Wooden decoys for the duck.
 */
public class WoodenDecoy extends Duck {

  /** 
   *  Creates a new wooden decoy with appropriate bitmaps and GIFs
   */
  public WoodenDecoy() 
  {
    super("decoy_still.bmp", null, "decoy_swim.gif");
    setFlyBehaviour(new CantFly());
	setQuackBehaviour(new MuteQuack());
	setSwimBehaviour(new Float());
	System.out.println("I am a wooden decoy duck");
  }

  /** 
   *  Wooden decoys don't fly.
   */
  

  /** 
   *  Wooden decoys don't quack
   */
  
}
