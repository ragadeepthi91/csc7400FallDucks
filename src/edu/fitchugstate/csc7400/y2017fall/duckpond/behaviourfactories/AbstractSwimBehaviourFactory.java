/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour.*;

/**
 * Declares abstract methods to create swim objects
 */
public abstract class AbstractSwimBehaviourFactory 
{
     public abstract SwimBehaviour CreateGeneralSwim();
     public abstract SwimBehaviour CreateFloatSwim();
}
