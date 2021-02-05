package ru.camunda_bpm.carsharing.delegate.util.consts;

public final class SysMsgs {
  public static final String CONFIG_LOAD_SUCCESS = "Property file %s loaded successfully. Properties count: %s";
  public static final String CONFIG_LOAD_FAIL = "Couldn't load property file %s!";
  public static final String CONFIG_ADDED_TO_EXECUTION = "Added to execution context config [%s] with value [%s]";

  private SysMsgs() {
    throw new AssertionError();
  }
}
