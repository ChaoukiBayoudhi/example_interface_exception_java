package Exceptions;

public class StudentMarkException extends Exception {
  private long errorCode;
    public StudentMarkException(String message) {

      super(message);
    }
    public StudentMarkException(String message,long errorCode) {
      super(message);
      this.errorCode = errorCode;
    }
}
