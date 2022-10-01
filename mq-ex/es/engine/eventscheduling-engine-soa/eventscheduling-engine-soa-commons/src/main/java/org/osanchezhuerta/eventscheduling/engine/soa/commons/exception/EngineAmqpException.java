package org.osanchezhuerta.eventscheduling.engine.soa.commons.exception;

public class EngineAmqpException extends Exception {

	private static final long serialVersionUID = 4893975016536220251L;


	public EngineAmqpException() {
        super();

    }


    public EngineAmqpException(String message) {
        super(message);

    }


    public EngineAmqpException(String message, Throwable cause) {
        super(message, cause);

    }


    public EngineAmqpException(Throwable cause) {
        super(cause);

    }
}