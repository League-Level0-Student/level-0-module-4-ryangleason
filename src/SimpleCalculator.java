
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String randomNumber1 = JOptionPane.showInputDialog("Enter your first number, please");
		String randomNumber2 = JOptionPane.showInputDialog("Enter your second number, please");
		int intRandomNumber1 = Integer.parseInt(randomNumber1);
		int intRandomNumber2 = Integer.parseInt(randomNumber2);
		System.out.println(intRandomNumber1);
		System.out.println(intRandomNumber2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do you want to add, subtract, multiply, or divide?",
				"Calculator", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Add", "Subtract", "Multiply", "Divide" }, null);
		if (operation == 0) {
			add(intRandomNumber1, intRandomNumber2);

		}
		if (operation == 1) {
			subtract(intRandomNumber1, intRandomNumber2);

		}
		if (operation == 2) {
			Multiply(intRandomNumber1, intRandomNumber2);

		}
		if (operation == 3) {
			Divide(intRandomNumber1, intRandomNumber2);

		}
	}

	// 5. Call the methods created in steps 3 and 4 to perform the appropriate
	// operation.

	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	// 3. Create method for addition operation.
	static void Divide(int intRandomNumber1, int intRandomNumber2) {
		int Yeilds = intRandomNumber1 / intRandomNumber2;
		JOptionPane.showMessageDialog(null, Yeilds);
	}

	static void Multiply(int intRandomNumber1, int intRandomNumber2) {
		int Total = intRandomNumber1 * intRandomNumber2;
		JOptionPane.showMessageDialog(null, Total);
	}

	static void subtract(int intRandomNumber1, int intRandomNumber2) {
		int difference = intRandomNumber1 - intRandomNumber2;
		JOptionPane.showMessageDialog(null, difference);
	}

	static void add(int intRandomNumber1, int intRandomNumber2) {
		int sum = intRandomNumber1 + intRandomNumber2;
		JOptionPane.showMessageDialog(null, sum);
	}
}

// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
// 70.
// HINT: use 'static void add(int num1, num2) { ... }

// 4. Create similar methods for subtraction, multiplication and division.
