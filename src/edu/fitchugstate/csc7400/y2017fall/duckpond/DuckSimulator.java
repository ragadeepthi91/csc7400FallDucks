/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond;
import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.flyRocketPowered;
import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.Squeak;
import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.FloatSwim;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.AbstractFlyBehaviourFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.AbstractQuackBehaviourFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.AbstractSwimBehaviourFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.FlyFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.QuackFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories.SwimFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.duckfactories.AbstractDuckFactory;
import edu.fitchugstate.csc7400.y2017fall.duckpond.duckfactories.DuckFactory;

/** 
 *  Main program that simulates a pond
 */
public class DuckSimulator {

	AbstractQuackBehaviourFactory quackfactory = new QuackFactory();
	AbstractSwimBehaviourFactory swimfactory = new SwimFactory();
	AbstractFlyBehaviourFactory flyfactory = new FlyFactory();

	/** 
	 *  Runs the duck pond simulator
	 */	
	public static void main(String[] args) 
	{
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new DuckFactory();
		simulator.simulate(duckFactory);
	}
	
	/**
	 * creates and add behaviors to the different types of ducks
	 * @param duckFactory
	 */
	void simulate(AbstractDuckFactory duckFactory) 
	{
		System.out.println("\nDuck Simulator: With Abstract Factory");
		Duck mallardDuck = duckFactory.CreateMallardDuck();
		Duck redheadDuck = duckFactory.CreateRedHeadDuck();
		Duck decoyDuck = duckFactory.CreateDecoyDuck();
		Duck rubberDuck = duckFactory.CreateRubberDuck();
 
		  rubberDuck.setFlyBehaviour(flyfactory.CreateNoFly());
		  rubberDuck.setQuackBehaviour(quackfactory.CreateSqueak());
		  rubberDuck.setSwimBehaviour(swimfactory.CreateFloatSwim());
		  
		  mallardDuck.setQuackBehaviour(quackfactory.CreateQuack());
		  mallardDuck.setFlyBehaviour(flyfactory.CreateFlyWithWings());
		  mallardDuck.setSwimBehaviour(swimfactory.CreateGeneralSwim());
		  
		  redheadDuck.setFlyBehaviour(flyfactory.CreateFlyWithRocketPowered());
		  redheadDuck.setQuackBehaviour(quackfactory.CreateQuack());
		  redheadDuck.setSwimBehaviour(swimfactory.CreateGeneralSwim());
		  
		  decoyDuck.setFlyBehaviour(flyfactory.CreateNoFly());
		  decoyDuck.setQuackBehaviour(quackfactory.CreateMuteQuack());
		  decoyDuck.setSwimBehaviour(swimfactory.CreateFloatSwim());
		  
		System.out.println("Adding ducks to duck pond");
		addDuck(mallardDuck);
		addDuck(redheadDuck);
		addDuck(rubberDuck);
		addDuck(decoyDuck);
		
		System.out.println("\nIdyllic pond");
		pond.swimming();
		
		System.out.println("\nDog runs into pond");
		pond.spook();
	  }
	  
	  /**
	   * Adds a duck to the pond, just a helper function
	   * @param duck the duck to add to the pond
	   */
	  public static void addDuck(DuckType duck) 
	  {
		duck.display();
	    pond.addDuck(duck);
	  }

	  /**
	   * The pond for the simulation
	   */
	  private static DuckPond pond = new DuckPond();

}
