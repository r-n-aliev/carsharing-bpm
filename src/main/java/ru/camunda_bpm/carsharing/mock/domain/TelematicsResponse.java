package ru.camunda_bpm.carsharing.mock.domain;

import lombok.Data;

@Data
public class TelematicsResponse {
  private final long carId;
  private final String command;
  private final CommandResult result;
}
