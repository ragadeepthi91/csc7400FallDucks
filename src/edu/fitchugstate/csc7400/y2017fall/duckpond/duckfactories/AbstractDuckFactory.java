/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-06
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond.duckfactories;
import edu.fitchugstate.csc7400.y2017fall.duckpond.Duck;
/**
 * Declares abstract methods to create different types of ducks
 */
public abstract class AbstractDuckFactory 
{
     public abstract Duck CreateMallardDuck();
     public abstract Duck CreateRubberDuck();
     public abstract Duck CreateDecoyDuck();
     public abstract Duck CreateRedHeadDuck();
}
