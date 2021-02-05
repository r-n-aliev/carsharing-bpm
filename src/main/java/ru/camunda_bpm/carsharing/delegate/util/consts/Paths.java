package ru.camunda_bpm.carsharing.delegate.util.consts;

import java.io.File;


public final class Paths {
  public static final String BPM_PROPERTIES_PATH = "conf" + File.separator + "bpm.properties";

  private Paths() {
    throw new AssertionError();
  }
}
