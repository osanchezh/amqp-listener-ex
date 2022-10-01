package org.osanchezhuerta.eventscheduling.engine.soa.commons.exception;

public class DatabaseException extends Exception{


	private static final long serialVersionUID = -6316909206539661717L;


	public DatabaseException() {
        super();

    }

    public DatabaseException(String message) {
        super(message);

    }


    public DatabaseException(String message, Throwable cause) {
        super(message, cause);

    }


    public DatabaseException(Throwable cause) {
        super(cause);

    }
}
