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
import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.*;

/**
 * creates objects for different Swim behaviours
 */
public class SwimFactory extends AbstractSwimBehaviourFactory
{
	/**
	 * @return object generalswim
	 */
	public SwimBehaviour CreateGeneralSwim() 
	{
		return new GeneralSwim();
	}
	
	/**
	 * @return object floatswim
	 */
	public SwimBehaviour CreateFloatSwim() 
	{
		return new FloatSwim();
	}
	
}
