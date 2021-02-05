package ru.camunda_bpm.carsharing.delegate.exception;

public class ConfigLoadingException extends RuntimeException {
  public ConfigLoadingException(String message, Throwable cause) {
    super(message, cause);
  }
}
