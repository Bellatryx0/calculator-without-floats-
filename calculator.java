import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("First number (please no decimals): ");
		float a = Float.parseFloat(input.next().replace(",", "."));
		System.out.print("What operation? Only the four basic ones.: ");
		String operator = input.next();
		System.out.print("Second number (no decimals again): ");
		float b = Float.parseFloat(input.next().replace(",", "."));
		
		input.close();
		
		float result = 0;
	
		
		if (operator.equals("+")) {
			result = a + b;
		}	else if (operator.equals("-")) {
			result = a - b;
		}	else if (operator.equals(":") || operator.equals("/")) {
			result = a / b;
		}	else if (operator.equals("*") || operator.equals("x") || operator.equals("^")) {
			result = a * b;
		} else { 
			System.out.println("Operator Invalid");
			return;
		}
		System.out.println("Result: " + result);
	}
}
		
		
			
			
		
		
	
	