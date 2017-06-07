package calculator;


public class BasicCalc
{
	// include variables a, b, c here
	 double a,b,c;
	//include getters and setters method to access variables

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	//include methods for operations
	double add()
	{
		 c=a+b;
		 return(c);
	}
	double subtract()
	{
		 c=a-b;
		 return(c);
	}
	double multiply()
	{
		 c=a*b;
		 return(c);
	}
	double divide()
	{
		 c=a/b;
		 return(c);
	}

}
