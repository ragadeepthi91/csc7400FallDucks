/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  Rubber duck for pond
 */
public class RubberDuck extends Duck {

  /** 
   *  Creates a new rubber duck
   */
  public RubberDuck() {
	super("rubber_duck_still.bmp", null, "rubber_duck_swim.gif");
	flyBehaviour = new CantFly();
	quackBehaviour = new Squeak();
	swimBehaviour = new Float();
	System.out.println("I am a rubber duck");
  }

  /** 
   *  Rubber duck don't fly
   */
  /*public void display()
  {
	  System.out.println("I am a rubber duck");
  }*/
 /* public void fly() {
    System.out.println("Rubber duck continues to swim");
  }

  /** 
   *  Squeaks like a rubber duck.
   */
 /* public void quack() {
    System.out.println("Squeak");
  }*/
}
