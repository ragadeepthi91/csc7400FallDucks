/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 9
Student		: Deepthi, Manaswitha & Radhika
Date        : 2017-12-20
*/
package edu.fitchugstate.csc7400.y2017fall.duckpond;

import java.util.ArrayList;
import java.util.List;

/** 
 *  Class that controls the display of the duck pond
 */
public class DuckPond {

  /** 
   * Adds a duck to the pond
   * 
   * @param newDuck duck to add 
   */
  public void addDuck(DuckType newDuck) {
    this.ducks.add(newDuck);
  }

  /** 
   *  Shows all the ducks swimming in the pond
   */
  public void swimming() {
	this.drawPond();
    for (DuckType duck: this.ducks) {
      duck.PerformQuack();
      duck.PerformSwim();
    }
  }

  /**
   * Draws what happens after ducks have been spooked.
   */
  public void spook() {
    this.drawSky();
    for (DuckType duck: this.ducks) {
        duck.PerformQuack();
        duck.PerformQuack();
        duck.PerformFly();
      }
  }

  /** 
   *  Displays that a pond is drawn.
   */
  protected void drawPond() {
    System.out.println("Drawing nice pond with cattails");
  }

  /** 
   *  Displays that blue sky is drawn.
   */
  protected void drawSky() {
    System.out.println("Drawing blue sky");
  }

  /** 
   *  All the ducks that will be displayed
   */
  protected List<DuckType> ducks = new ArrayList<DuckType>();
}
