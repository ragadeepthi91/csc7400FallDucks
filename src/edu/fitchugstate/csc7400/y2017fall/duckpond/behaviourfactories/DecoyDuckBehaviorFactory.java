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
 * creates objects for different behaviours of Decoy duck
 */
public class DecoyDuckBehaviorFactory extends AbstractBehaviorFactory
{
	/**
	 * Invokes parent constructor
	 * @param flyingGifFilename flying image of Decoy duck
	 * @param swimmingGifFilename swimming image of Decoy duck
	 */
	public DecoyDuckBehaviorFactory(String flyingGifFilename, String swimmingGifFilename)
	{
		super(flyingGifFilename, swimmingGifFilename);
	}
	/**
	 * Set's fly behavior
	 * @return object Can't fly
	 */
	public FlyBehaviour CreateFlyBehavior() 
	{
		return new CantFly("Decoy still swims");
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
	 * @return object mute quack
	 */
	public QuackBehaviour CreateQuackBehavior() 
	{
		return new MuteQuack("Decoy is silent");
	}
	
	
}
