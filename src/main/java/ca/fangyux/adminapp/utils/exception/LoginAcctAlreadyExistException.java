package ca.fangyux.adminapp.utils.exception;

//保存或更新Admin时检测到账号重复时抛出这个异常
public class LoginAcctAlreadyExistException extends RuntimeException{
    public LoginAcctAlreadyExistException() {
        super();
    }

    public LoginAcctAlreadyExistException(String message) {
        super(message);
    }

    public LoginAcctAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginAcctAlreadyExistException(Throwable cause) {
        super(cause);
    }

    protected LoginAcctAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}