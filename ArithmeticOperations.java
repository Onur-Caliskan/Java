import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmeticOperations {

	public static String findWrongExpresion(String fileName) {
		String s = "";
		// Open the file
		File f = new File("C:\\Users\\Onur\\Documents\\question03.txt");
		// if the file does not exists then return the error
		if (!f.exists()) {
			s = "File Does Not Exists ";
		} else {
			try {
				// open the file using scanner
				Scanner sc = new Scanner(f);
				// while end of the file is reached
				while (sc.hasNext()) {
					// scan a line
					String exp = sc.nextLine();
					// split the line by white spaces
					String arr[] = exp.split(" ");
					double a, b, c, res = 0;
					char op;
					// read the operators
					a = Double.parseDouble(arr[0]);
					op = arr[1].charAt(0);
					b = Double.parseDouble(arr[2]);
					c = Double.parseDouble(arr[4]);
					// evaluate the expression
					switch (op) {
					case '+':
						res = a + b;
						break;
					case '-':
						res = a - b;
						break;
					case '*':
						res = a * b;
						break;
					case '/':
						res = a / b;
						break;
					case '%':
						res = a % b;
						break;
					}
					// add the wrong expression
					if (c != res && op == '/') {
						s += exp + "\n";
					}
					for (int i = 0; i < s.lastIndexOf(i); i++) {

						i += 1;
						System.out.println(i);

					}

				}
			} catch (FileNotFoundException ex) {
				s = "File Does Not Exists ";
			}
		}
		// return the final result
		return s;
	}

	public static void main(String[] args) {
		System.out.println(
				"The Wrong Expressions are :\n" + findWrongExpresion("C:\\Users\\Onur\\Documents\\question03.txt"));

	}

}
