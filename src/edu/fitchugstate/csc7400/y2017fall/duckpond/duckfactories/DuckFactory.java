/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.duckfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Mallard;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Redhead;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.RubberDuck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.WoodenDecoy;

/**
 * creates objects for different types of ducks
 */
public class DuckFactory extends AbstractDuckFactory
{
	/**
	 * @return object mallardDuck
	 */
	public Duck CreateMallardDuck() 
	{
		return new Mallard();
	}
  
	/**
	 * @return object redheadDuck
	 */
	public Duck CreateRedHeadDuck() 
	{
		return new Redhead();
	}
   
	/**
	 * @return object rubberDuck
	 */
	public Duck CreateRubberDuck() 
	{
		return new RubberDuck();
	}
	
	/**
	 * @return object woodenDecoy 
	 */
	public Duck CreateDecoyDuck() 
	{
		return new WoodenDecoy();
	}
}
