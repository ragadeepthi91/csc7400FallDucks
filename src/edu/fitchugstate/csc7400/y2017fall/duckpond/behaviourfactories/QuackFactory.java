/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.*;

/**
 * creates objects for different Quack behaviours
 */
public class QuackFactory extends AbstractQuackBehaviourFactory
{
	/**
	 * @return object MuteQuack
	 */
	public QuackBehaviour CreateMuteQuack() 
	{
		return new MuteQuack();
	}
  
	/**
	 * @return object CreateQuack
	 */
	public QuackBehaviour CreateQuack() 
	{
		return new Quack();
	}
   
	/**
	 * @return object CreateSqueak
	 */
	public QuackBehaviour CreateSqueak() 
	{
		return new Squeak();
	}
	
	
}
