package studio7;

public class Dice {
	
	
	
	private int numSides;
	private int sideLandedOn;
	
	public Dice(int numSides) {
		this.numSides = numSides;
	}
	
	
	//sneaky aka setLandedOn
	public void rollDice() {
		//return a random number from 1-n
		this.sideLandedOn = (int)(Math.random()*(numSides) + 1);
	}
	
	
	public int getSideLandedOn () {
		return this.sideLandedOn;
	}
	
	public String toString() {
		return "The side we landed on :" + this.sideLandedOn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice d1 = new Dice(5);  //creates a 5 sides dice 
		d1.rollDice();
		System.out.println(d1.toString());

	}
	

}
