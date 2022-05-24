import java.util.Scanner;

public class Evaluator {
	public String evaluate() {
		double num1, num2;
		String result= new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/)");
  
        char op = sc.next().charAt(0);  
        double o = 0;
  
        switch (op) {
        case '+':
            o = num1 + num2;
            break;
        case '-':
            o = num1 - num2;
            break;
        case '*':
            o = num1 * num2;
            break;
        case '/':
            o = num1 / num2;
            break;
        default:
            result="You have entered wrong input";
            return result;
        }
        result ="The final result:"+num1 + " " + op + " " + num2+ " = " + o;
		return result;
	}
}
