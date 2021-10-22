
public class CalculatorTest {
	public static void main(String args[]) {
		Calculator Operation1 = new Calculator();
		Operation1.setOperandOne(10.5);
		Operation1.setPerformOperation("+");
		Operation1.setOperandTwo(5.2);
		Operation1.performOperation();
		Operation1.getResults();
		
	}
	

}
