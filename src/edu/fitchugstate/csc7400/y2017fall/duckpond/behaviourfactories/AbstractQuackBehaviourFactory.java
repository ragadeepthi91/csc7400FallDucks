package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;

import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.*;

public abstract class AbstractQuackBehaviourFactory 
{
     public abstract QuackBehaviour CreateMuteQuack();
     public abstract QuackBehaviour CreateQuack();
     public abstract QuackBehaviour CreateSqueak();
}
