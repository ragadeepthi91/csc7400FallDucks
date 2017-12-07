/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Mallard;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Redhead;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.RubberDuck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.WoodenDecoy;
import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.*;
/**
 * creates objects for different Fly behaviours
 */
public class FlyFactory extends AbstractFlyBehaviourFactory
{
	/**
	 * @return object flywithwings
	 */
	public FlyBehaviour CreateFlyWithWings() 
	{
		return new FlyWithWings();
	}
	
	/**
	 * @return object can't fly
	 */
	public FlyBehaviour CreateNoFly() 
	{
		return new CantFly();
	}
	
	/**
	 * @return object fly with rocket power
	 */
	public FlyBehaviour CreateFlyWithRocketPowered() 
	{
		return new flyRocketPowered();
	}
	
	
}
