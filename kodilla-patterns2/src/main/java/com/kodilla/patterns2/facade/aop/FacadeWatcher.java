package com.kodilla.patterns2.facade.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {
	private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

	@Before("execution(* com.kodilla.patterns2.api.OrderFacade.processOrder(..))" +
	"&& args(long orderId)")
	public void logEvent(long orderId) {
		LOGGER.info("Processing order with ID: " + orderId);
	}
}
