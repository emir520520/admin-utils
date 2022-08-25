package ca.fangyux.adminapp.utils.exception;

public class LoginAcctAlreadyExistForUpdateException extends RuntimeException{
    public LoginAcctAlreadyExistForUpdateException() {
        super();
    }

    public LoginAcctAlreadyExistForUpdateException(String message) {
        super(message);
    }

    public LoginAcctAlreadyExistForUpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginAcctAlreadyExistForUpdateException(Throwable cause) {
        super(cause);
    }

    protected LoginAcctAlreadyExistForUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}