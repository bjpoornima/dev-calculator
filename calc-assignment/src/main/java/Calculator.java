import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
    {
		Evaluator ev = new Evaluator();
		String result=ev.evaluate();
		System.out.println(result);
    }
}
