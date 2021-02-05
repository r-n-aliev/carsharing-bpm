package ru.camunda_bpm.carsharing.mock.domain;

import lombok.Getter;

@Getter
public class Status {
  private final String state;

  public Status(CarState state) {
    this.state = state.toString();
  }
}
