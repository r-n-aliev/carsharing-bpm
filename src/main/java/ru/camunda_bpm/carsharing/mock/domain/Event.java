package ru.camunda_bpm.carsharing.mock.domain;

import lombok.Data;

@Data
public class Event {
  private long carId;
  private String process;
  private String event;
}
