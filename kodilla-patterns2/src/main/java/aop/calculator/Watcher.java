package aop.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class Watcher {
	public static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

	@Before("execution(* aop.calculator.Calculator.factorial(..))" +
		"^^ args(theNumber) && target(object)")
	public void LogEvent(BigDecimal theNumber, Object object) {
		LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + theNumber);
	}
}
