/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9
 * 
 * Date: 2017-11-28
 */
package edu.fitchugstate.csc7400.y2017fall.duckpond.ducks;
import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;

import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.*;


/** 
 *  Rubber duck for pond
 */
public class RubberDuck extends Duck {
	AbstractQuackBehaviourFactory quackfactory = new QuackFactory();
	AbstractSwimBehaviourFactory swimfactory = new SwimFactory();
	AbstractFlyBehaviourFactory flyfactory = new FlyFactory();
  /** 
   *  Creates a new rubber duck
   */
  public RubberDuck() {
	super("rubber_duck_still.bmp", null, "rubber_duck_swim.gif");
	setFlyBehaviour(flyfactory.CreateNoFly());
	setQuackBehaviour(quackfactory.CreateSqueak());
	setSwimBehaviour(swimfactory.CreateFloatSwim());
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
