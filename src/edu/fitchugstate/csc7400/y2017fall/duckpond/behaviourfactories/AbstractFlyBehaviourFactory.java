package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;

import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.*;

public abstract class AbstractFlyBehaviourFactory 
{
     public abstract FlyBehaviour CreateFlyWithWings();
     public abstract FlyBehaviour CreateNoFly();
     public abstract FlyBehaviour CreateFlyWithRocketPowered();
}
