/* File: MyVotingBox.java
 * When you finish writing the VotingBox class,
 * If beeper is present in middle, Karel should move forward and checknext chad.
 * If beeper is not present, Karel should check both side of chad and remove beepers if any present in that chad
 */

import stanford.karel.*;

public class MyVotingBox extends SuperKarel {

	public void run() {
		// method for Karel to move if front is clear. If there is no beeper remove beppers from Chad and move
		while (frontIsClear()){
			move();
			if (noBeepersPresent()) {
				removeBeeper();
			}
			move();
		}
	}

	private void removeBeeper() {
		//method for removing beeper by checking top and bottom side of chad 
		turnLeft();
		CheckTop();
		CheckBottom();
		turnRight();
	}
	private void CheckTop() {
		//method to see if there is Beeper present on top side of chad. If there is one, Karel should pick up the beeper
		move();
		while (beepersPresent()){
			pickBeeper();
		}
		turnAround();
		move();
	}


	private void CheckBottom() {
		//method to see if there is Beeper present on bottom side of chad. If there is one, Karel should pick up the beeper
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
}
