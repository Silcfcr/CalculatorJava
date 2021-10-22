
public class Calculator {
	private double OperandOne;
	private double OperandTwo;
	private String performOperation;
	
//	setters
	void setOperandOne(double num) {
		this.OperandOne = num;
		
	}
	
	void setOperandTwo(double num) {
		this.OperandTwo = num;
		
	}
	
	void setPerformOperation(String operator) {
		this.performOperation =	operator;
	}
//Getters
	public double getOperandOne() {
		return this.OperandOne;
	}
	
	public double getOperandTwo() {
		return this.OperandTwo;
	}
	
	public void getResults() {
		String results = String.valueOf(performOperation());
		System.out.println("Result: " + results);
	}
	
// methods	
	public double performOperation() {
		double results = 0.0;
		if ( this.performOperation == "+") {
			results = this.OperandOne + this.OperandTwo;
			
		}
		if ( this.performOperation == "-") {
			results = this.OperandOne - this.OperandTwo;
		} 
		if ( this.performOperation == "*") {
			results = this.OperandOne * this.OperandTwo;
			
		}
		if ( this.performOperation == "/") {
			results = this.OperandOne / this.OperandTwo;
		}
		return results;
	}
}
