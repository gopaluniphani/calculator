package calculator;

import java.math.BigDecimal;
import parser.DataIO;

public class App {
	public static void main(String []args) {
		String expr = DataIO.readInput();
		String in[] = expr.split(" ");
		BigDecimal a = new BigDecimal(in[0]);
		String operand = in[1];
		BigDecimal b = new BigDecimal(in[2]);
		switch(operand) {
			case "+": DataIO.displayOutput(Operations.add(a, b)); break;
			case "-": DataIO.displayOutput(Operations.subtract(a, b)); break;
			case "*": DataIO.displayOutput(Operations.multiply(a, b)); break;
			case "/": DataIO.displayOutput(Operations.divide(a, b)); break;
		}
	}
}
