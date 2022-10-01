package org.osanchezhuerta.eventscheduling.engine.integration.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class EngineExceptionHandlerAdvice {
	private static final Logger LOGGER =  LoggerFactory.getLogger(EngineExceptionHandlerAdvice.class);

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
    @ExceptionHandler(Exception.class)
    public void handleGeneralError(Exception ex) {
    	LOGGER.error("An error occurred procesing request", ex);
    }
    
}
