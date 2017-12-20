/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Ragadeepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.FlyBehaviour;
import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.QuackBehaviour;
import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.SwimBehaviour;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.AbstractBehaviorFactory;
import external.Bitmap;
import external.BitmapImpl;


/** 
 *  Sets methods to define different duck behaviors 
 */
public class Duck implements DuckType {

	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	SwimBehaviour swimBehaviour;
	
	/**
	 * Duck constructor to assign behaviors using factories
	 * 
	 * @param bitmapFilename Display image
	 * @param factory Behaviour factory
	 */
	
  public Duck(String bitmapFilename, AbstractBehaviorFactory factory) {
    this.still = this.createBitmap(bitmapFilename);
    this.flyBehaviour = factory.CreateFlyBehavior();
    this.quackBehaviour = factory.CreateQuackBehavior();
    this.swimBehaviour = factory.CreateSwimBehavior();
  }

  /**
   * Displays duck using bitmap
   */
  public void display() 
  {
    this.still.show();
  }

  /** 
   *  Duck flies and corresponding image is shown
   */ 
  public void PerformFly()
  {
	  flyBehaviour.fly();
  }
  
  /** 
   *  Duck quacks 
   */ 
  public void PerformQuack()
  {
	  quackBehaviour.quack();
  }
  
  /** 
   *  Duck swims and corresponding image is shown
   */ 
  public void PerformSwim()
  {
	  swimBehaviour.swim();
  }

  /** 
   * Creates a new bitmap object 
   * @param fileName image to be displayed
   * @return Bitmap object
   */
  protected Bitmap createBitmap(String fileName) {
    return new BitmapImpl(fileName);
  }
 
  protected Bitmap still;
 
}
