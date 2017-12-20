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
 * creates objects for different behaviors of duck
 */
public class DuckBehaviorFactory extends AbstractBehaviorFactory
{
	/**
	 * Invokes parent constructor
	 * @param flyingGifFilename flying image of duck
	 * @param swimmingGifFilename swimming image of duck
	 */
	public DuckBehaviorFactory(String flyingGifFilename, String swimmingGifFilename)
	{
		super(flyingGifFilename, swimmingGifFilename);
	}
	/**
	 * Set's fly behaviour
	 * @return object Fly with wings
	 */
	public FlyBehaviour CreateFlyBehavior() 
	{
		return new FlyWithWings(flying);
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
	 * @return object quack
	 */
	public QuackBehaviour CreateQuackBehavior() 
	{
		return new Quack();
	}
	
	
}
