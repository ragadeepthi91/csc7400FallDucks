package edu.fitchugstate.csc7400.y2017fall.duckpond;

import external.GIF;

public class FlyWithWings implements FlyBehaviour{
	   
	/* public FlyWithWings(GIF flying)
	 {
		 flying.animate();
	 }*/
      public void fly(GIF flying) 
      {
    	  System.out.println("I'm flying");
    	  flying.animate();
    	 //this.flying.animate();
       }
}
