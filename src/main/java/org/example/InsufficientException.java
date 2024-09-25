package org.example;

public class InsufficientException extends RuntimeException {


  public InsufficientException(String message) {
        super(message);
    }

  public InsufficientException(String message, Throwable cause) {
    super(message, cause);
  }

  public InsufficientException(Throwable cause) {
    super(cause);
  }

  public InsufficientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public InsufficientException() {

  }
}
