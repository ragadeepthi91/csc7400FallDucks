package edu.fitchugstate.csc7400.y2017fall.duckpond;

public class DuckSimulator {

	public static void main(String[] args) 
	{
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new DuckFactory();
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Duck mallardDuck = duckFactory.CreateMallardDuck();
		Duck redheadDuck = duckFactory.CreateRedHeadDuck();
		Duck decoyDuck = duckFactory.CreateDecoyDuck();
		Duck rubberDuck = duckFactory.CreateRubberDuck();
		
		System.out.println("\nDuck Simulator: With Abstract Factory");
 
		/*simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(decoyDuck);
		simulate(rubberDuck); */
		
		Duck myDuck = new RubberDuck();
		  myDuck.setFlyBehaviour(new flyRocketPowered());
		  myDuck.setQuackBehaviour(new Squeak());
		  myDuck.setSwimBehaviour(new Float());
		  
		System.out.println("Adding ducks to duck pond");
		addDuck(mallardDuck);
		addDuck(redheadDuck);
		addDuck(myDuck);
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
 
	/*void simulate(Duck duck) 
	{
		duck.PerformQuack();
		duck.PerformFly();
		duck.PerformSwim();
	}*/

}
