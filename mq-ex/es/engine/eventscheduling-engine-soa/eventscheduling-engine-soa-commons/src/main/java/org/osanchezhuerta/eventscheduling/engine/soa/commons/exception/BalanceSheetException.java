package org.osanchezhuerta.eventscheduling.engine.soa.commons.exception;

public class BalanceSheetException extends Exception{

	private static final long serialVersionUID = -4289427872501819904L;

	public BalanceSheetException() {
        super();

    }

    public BalanceSheetException(String message) {
        super(message);

    }


    public BalanceSheetException(String message, Throwable cause) {
        super(message, cause);

    }


    public BalanceSheetException(Throwable cause) {
        super(cause);

    }
}
