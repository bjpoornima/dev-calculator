import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

public class EvaluatorTests {

	@Test
	public void testevaluateAddition() {
		String userInput = String.format("2%s1%s+",
	            System.lineSeparator(),
	            System.lineSeparator());
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    String expected = "The final result:"+2.0+ " " + "+" + " " + 1.0+ " = " + 3.0;
	    Evaluator ev = new Evaluator();
		String actual=ev.evaluate();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testevaluateMultiplication() {
		String userInput = String.format("2%s1%s*",
	            System.lineSeparator(),
	            System.lineSeparator());
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    String expected = "The final result:"+2.0+ " " + "*" + " " + 1.0+ " = " + 2.0;
	    Evaluator ev = new Evaluator();
		String actual=ev.evaluate();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testevaluateSubtraction() {
		String userInput = String.format("2%s1%s-",
	            System.lineSeparator(),
	            System.lineSeparator());
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    String expected = "The final result:"+2.0+ " " + "-" + " " + 1.0+ " = " + 1.0;
	    Evaluator ev = new Evaluator();
		String actual=ev.evaluate();
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testevaluateDivision() {
		String userInput = String.format("2%s1%s/",
	            System.lineSeparator(),
	            System.lineSeparator());
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    String expected = "The final result:"+2.0+ " " + "/" + " " + 1.0+ " = " + 2.0;
	    Evaluator ev = new Evaluator();
		String actual=ev.evaluate();
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void testevaluateInvalidOperator() {
		String userInput = String.format("20%s1%s&",
	            System.lineSeparator(),
	            System.lineSeparator());
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);
	    String expected = "You have entered wrong input";
	    Evaluator ev = new Evaluator();
		String actual=ev.evaluate();
		Assert.assertEquals(expected,actual);
	}

}
