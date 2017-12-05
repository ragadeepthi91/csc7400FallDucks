package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;


import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.*;

public class QuackFactory extends AbstractQuackBehaviourFactory
{
	public QuackBehaviour CreateMuteQuack() 
	{
		return new MuteQuack();
	}
  
	public QuackBehaviour CreateQuack() 
	{
		return new Quack();
	}
   
	public QuackBehaviour CreateSqueak() 
	{
		return new Squeak();
	}
	
	
}
