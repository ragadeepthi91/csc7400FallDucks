package edu.fitchugstate.csc7400.y2017fall.duckpond.SwimBehaviour;

import external.GIF;

public class GeneralSwim implements SwimBehaviour{
	   
      public void swim(GIF swimming) 
      {
    	  System.out.println("I'm Swimming");
    	  swimming.animate();
    	 //this.flying.animate();
       }
}
