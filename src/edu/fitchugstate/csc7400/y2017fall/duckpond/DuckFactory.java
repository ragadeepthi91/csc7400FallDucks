package edu.fitchugstate.csc7400.y2017fall.duckpond;

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
