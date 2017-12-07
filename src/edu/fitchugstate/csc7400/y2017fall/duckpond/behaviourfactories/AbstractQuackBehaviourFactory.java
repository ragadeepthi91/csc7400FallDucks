/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.behaviourfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.QuackBehaviour.*;
/**
 * Declares abstract methods to create quack objects
 */
public abstract class AbstractQuackBehaviourFactory 
{
     public abstract QuackBehaviour CreateMuteQuack();
     public abstract QuackBehaviour CreateQuack();
     public abstract QuackBehaviour CreateSqueak();
}
