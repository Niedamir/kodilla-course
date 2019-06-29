package com.kodilla.spring.calculator;

import com.kodilla.spring.Calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
	@Test
	public void testCalculations() {
		//Given
		double a = 6.0;
		double b = 2.0;
		ApplicationContext context =
			new AnnotationConfigApplicationContext("com.kodilla.spring");
		Calculator calc = context.getBean(Calculator.class);
		//When
		double addResult = calc.add(a, b);
		double subResult = calc.sub(a, b);
		double mulResult = calc.mul(a, b);
		double divResult = calc.div(a, b);
		//Then
		Assert.assertEquals(8.0, addResult, 0.1);
		Assert.assertEquals(4.0, subResult, 0.1);
		Assert.assertEquals(12.0, mulResult, 0.1);
		Assert.assertEquals(3.0, divResult, 0.1);
	}
}
