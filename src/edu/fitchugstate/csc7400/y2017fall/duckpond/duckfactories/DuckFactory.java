package edu.fitchugstate.csc7400.y2017fall.duckpond.duckfactories;

import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Mallard;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.Redhead;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.RubberDuck;
import edu.fitchugstate.csc7400.y2017fall.duckpond.ducks.WoodenDecoy;

public class DuckFactory extends AbstractDuckFactory
{
	public Duck CreateMallardDuck() 
	{
		return new Mallard();
	}
  
	public Duck CreateRedHeadDuck() 
	{
		return new Redhead();
	}
   
	public Duck CreateRubberDuck() 
	{
		return new RubberDuck();
	}
	
	public Duck CreateDecoyDuck() 
	{
		return new WoodenDecoy();
	}
}
