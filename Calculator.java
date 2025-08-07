import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator { 
	public static void main(String[] args) { 
		Scanner input = null;
		try {
			// Get user inputt
			input = new Scanner(System.in);
			System.out.print("First number: ");
			float firstNumber = Float.parseFloat(input.nextLine().replace(",", "."));
			System.out.print("Operator: ");
			String operator = input.nextLine().trim();
			System.out.print("Second number: ");
			float secondNumber = Float.parseFloat(input.nextLine().replace(",", "."));
			// Calculation!
			float result = 0f;
			switch(operator) {
				case "+": result = firstNumber + secondNumber; break;
				case "-": result = firstNumber - secondNumber; break;
				case "/": case ":":                   
					if (secondNumber == 0) throw new ArithmeticException();
					result = firstNumber / secondNumber; break;
				case "*": case "x":
					result = firstNumber * secondNumber; break;
				default:
					System.out.println("Operator invalid, ugh.");
					return;
			}
				// Kaomoji
				System.out.println("Result: " + result);
			
		}	catch (InputMismatchException e) {
				System.err.println("Numbers only, idiot.");
			} catch (ArithmeticException e) {
				System.err.println("Woooahhh you're so smart, congrats.");
			} catch (Exception e) {
				System.err.println("Not even I am sure how you got here, but if you did, please. Run away. Something is going to explode.");
			} finally {
				if (input != null) input.close();
			}
		}

}
		
		
		
