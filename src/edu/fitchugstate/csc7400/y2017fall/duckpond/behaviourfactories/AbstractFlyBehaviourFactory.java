/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/

package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.FlyBehaviour.*;
/**
 * Declares abstract methods to create fly objects
 */
public abstract class AbstractFlyBehaviourFactory 
{
     public abstract FlyBehaviour CreateFlyWithWings();
     public abstract FlyBehaviour CreateNoFly();
     public abstract FlyBehaviour CreateFlyWithRocketPowered();
}
