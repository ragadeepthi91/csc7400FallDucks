/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.*;

/** 
 *  Main program that simulates a pond
 */
public class DuckSimulator {
	/** 
	 *  Runs the duck pond simulator
	 */	
	public static void main(String[] args) 
	{
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	/**
	 * Creates different types of ducks and simulate swim and spook
	 * 
	 */
	void simulate() 
	{
		Duck mallardDuck = new Mallard();
		Duck redheadDuck = new Redhead();
		Duck rubberDuck = new RubberDuck();
		Duck decoyDuck = new WoodenDecoy();
		  
		System.out.println("Adding ducks to duck pond");
		addDuck(mallardDuck);
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
