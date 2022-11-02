package studio7;

public class Fraction {

	
	//instance variables
	private double numerator;
	private double denominator;
	private double sum;
	private double product;
	private double recipricol;
	
	
	//cronstruct the object
	public Fraction(double numerator, double denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	

	
	//set the product with ANOTHER fraction object
	public void setProduct(Fraction other) {
		this.product = (this.numerator/this.denominator) * (other.numerator/other.denominator);
	}
	
	//get the product with ANOTHER fraction object
	public double getProduct() {
		return this.product;
	}
	
	//set the sum
	public void setSum(Fraction other) {
		this.sum = (this.numerator/this.denominator) + (other.numerator/other.denominator);
	}
	
	//get the sum
	public double getSum() {
		return this.sum;
	}
	
	public void setReciprocal() {
		this.recipricol = this.denominator/this.numerator;
	}
	
	public double getReciprocol() {
		return this.recipricol;
	}
	
	public String toString() {
		return "The product of the two fractions is : " + this.product;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1 = new Fraction(1.0,2.0);
		Fraction f2 = new Fraction(1.0, 3.0);
		
		f1.setProduct(f2); //multiply f1 with f2
		System.out.println(f1.toString());
		
		
		f1.setSum(f2);
		
		System.out.println(f1.getSum());
		
		f1.setReciprocal();
		System.out.println(f1.recipricol);		
		
		

	}

}
