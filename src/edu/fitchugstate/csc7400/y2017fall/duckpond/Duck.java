/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.GIF;
import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.FlyBehaviour;
import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.QuackBehaviour;
import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.SwimBehaviour;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.AbstractFlyBehaviourFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.AbstractQuackBehaviourFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.AbstractSwimBehaviourFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.FlyFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.QuackFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.SwimFactory;
import external.Bitmap;
import external.BitmapImpl;
import external.GifImpl;

/** 
 *  Sets methods to define duck properties
 */
public class Duck implements DuckType {

	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	SwimBehaviour swimBehaviour;
	
	/**
	 * Duck constructor to initialize animations
	 * @param bitmapFilename Display image
	 * @param flyingGifFilename Flying image
	 * @param swimmingGifFilename Swimming image
	 */
	
  public Duck(String bitmapFilename, String flyingGifFilename, String swimmingGifFilename) {
    this.still = this.createBitmap(bitmapFilename);
    this.flying = this.createGif(flyingGifFilename);
    this.swimming = this.createGif(swimmingGifFilename);
  }
  /**
   * Sets the fly behavior
   * @param fb FlyBehaviour object
   */
  public void setFlyBehaviour(FlyBehaviour fb)
  {
	  flyBehaviour = fb;
  }
  /**
	 * Sets the Quack behavior of duck
	 * @param qb QuackBehaviour object
	 */
  public void setQuackBehaviour(QuackBehaviour qb)
  {
	  quackBehaviour = qb;
  }
  /**
	 * Sets the Swim behavior of duck
	 * @param sb SwimBehaviour object
	 */
  public void setSwimBehaviour(SwimBehaviour sb)
  {
	  swimBehaviour = sb;
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
	  flyBehaviour.fly(flying);
  }
  
  /** 
   *  Duck quacks and corresponding image is shown
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
	  swimBehaviour.swim(swimming);
  }

  /** 
   * Creates a new bitmap object 
   * @param fileName image to be displayed
   * @return Bitmap object
   */
  protected Bitmap createBitmap(String fileName) {
    return new BitmapImpl(fileName);
  }

  /** 
   * Creates a new GIF object 
   * @param fileName image to be displayed
   * @return GIF object
   */
  protected GIF createGif(String fileName) {
    return new GifImpl(fileName);
  }

  
  protected Bitmap still;


  protected GIF flying;  

  
  protected GIF swimming;
}
