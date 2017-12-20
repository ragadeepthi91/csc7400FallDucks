/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond;

/** 
 *  This is a simple duck interface that defines methods for ducks
 *  
 */
public interface DuckType {

  /** 
   *  Displays a still image of the duck
   */
  public void display();

  /** 
   *  Shows a flying animation
   */
  public void PerformFly();

  /** 
   *  Outputs a quacking behavior
   */
  public void PerformQuack();

  /** 
   *  Displays a swimming animation
   */
  public void PerformSwim();
}
