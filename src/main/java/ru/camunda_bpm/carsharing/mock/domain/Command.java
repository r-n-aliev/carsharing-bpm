package ru.camunda_bpm.carsharing.mock.domain;

import lombok.Data;

@Data
public class Command {
  private long carId;
  private String command;
}
