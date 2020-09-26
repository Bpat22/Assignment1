/* File: VotingBox.java

 * ----------------------------
 * When you finish writing it, the VotingBox class should .... 
 * clear beepers, as described in Assignment 1. 
 */

import stanford.karel.*;

public class VotingBox extends SuperKarel {
	// method for Karel to move if front is clear. If there is no beeper remove and move
	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				removeBeeper();
			}
			move();
		}		
	}

	private void removeBeeper() {
		//method for removing beeper if present by checking in each corner 
		turnRight();
		checkRightCorner();
		checkLeftCorner();
		turnLeft();
	}
	private void checkRightCorner() {
		//method to see if there is Beeper present in left corner
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}

	private void checkLeftCorner() {
		// method to see if there is Beeper present in right corner
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
}

