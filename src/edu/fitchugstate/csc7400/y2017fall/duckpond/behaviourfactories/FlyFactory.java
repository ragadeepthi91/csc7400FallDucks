package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;

import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Mallard;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Redhead;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.RubberDuck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.WoodenDecoy;
import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.*;

public class FlyFactory extends AbstractFlyBehaviourFactory
{
	public FlyBehaviour CreateFlyWithWings() 
	{
		return new FlyWithWings();
	}
  
	public FlyBehaviour CreateNoFly() 
	{
		return new CantFly();
	}
   
	public FlyBehaviour CreateFlyWithRocketPowered() 
	{
		return new flyRocketPowered();
	}
	
	
}
