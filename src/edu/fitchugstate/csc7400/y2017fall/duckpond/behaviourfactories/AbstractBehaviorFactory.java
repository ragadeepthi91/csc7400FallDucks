/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/

package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.*;
import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.*;
import external.GIF;
import external.GifImpl;
import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.*;
/**
 * Declares abstract methods to create behavior objects
 */
public abstract class AbstractBehaviorFactory 
{
	/**
	 * Initializes images to display
	 * @param flyingGifFilename flying image
	 * @param swimmingGifFilename swimming image
	 */
	public AbstractBehaviorFactory(String flyingGifFilename, String swimmingGifFilename)
	{ 
		 this.flying = this.createGif(flyingGifFilename);
		 this.swimming = this.createGif(swimmingGifFilename);
	 }
     public abstract FlyBehaviour CreateFlyBehavior();
     public abstract SwimBehaviour CreateSwimBehavior();
     public abstract QuackBehaviour CreateQuackBehavior();
     /** 
      * Creates a new GIF object 
      * @param fileName image to be displayed
      * @return GIF object
      */
     protected GIF createGif(String fileName) 
     {
    	    return new GifImpl(fileName);
     }
     
     public GIF flying;  
     public GIF swimming;
}
