package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;


import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.*;
public abstract class AbstractSwimBehaviourFactory 
{
     public abstract SwimBehaviour CreateGeneralSwim();
     public abstract SwimBehaviour CreateFloatSwim();
}
