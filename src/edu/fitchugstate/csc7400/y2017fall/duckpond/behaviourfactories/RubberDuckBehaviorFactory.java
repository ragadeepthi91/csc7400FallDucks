/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;

import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.*;
import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.*;
import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.*;

/**
 * creates objects for different behaviors of rubber duck
 */
public class RubberDuckBehaviorFactory extends AbstractBehaviorFactory
{
	
	/**
	 * Invokes parent constructor
	 * @param flyingGifFilename flying image of rubber duck
	 * @param swimmingGifFilename swimming image of rubber duck
	 */
	public RubberDuckBehaviorFactory(String flyingGifFilename, String swimmingGifFilename)
	{
		super(flyingGifFilename, swimmingGifFilename);
		
	}
	/**
	 * Set's fly behaviour
	 * @return object Can't fly
	 */
	public FlyBehaviour CreateFlyBehavior() 
	{
		return new CantFly("Rubber duck continues to swim");
	}
	
	/**
	 * Set's swim behaviour
	 * @return object General swim
	 */
	public SwimBehaviour CreateSwimBehavior() 
	{
		return new GeneralSwim(swimming);
	}
	
	/**
	 * Set's quack behaviour
	 * @return object squeak
	 */
	public QuackBehaviour CreateQuackBehavior() 
	{
		return new Squeak();
	}
	
}
