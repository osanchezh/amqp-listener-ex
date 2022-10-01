package org.osanchezhuerta.eventscheduling.engine.soa.services.errorhandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ErrorHandler;

public class AmqpContainerErrorHandler implements ErrorHandler {
	private static final Logger LOGGER =  LoggerFactory.getLogger(AmqpContainerErrorHandler.class);

	@Override
	public void handleError(Throwable throwable) {
		LOGGER.error(throwable.getMessage(),throwable);
	}

}
