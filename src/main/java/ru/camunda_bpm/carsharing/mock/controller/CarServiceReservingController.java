package ru.camunda_bpm.carsharing.mock.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.camunda_bpm.carsharing.mock.domain.CarAction;
import ru.camunda_bpm.carsharing.mock.domain.CarState;
import ru.camunda_bpm.carsharing.mock.domain.Status;

@RestController
@RequestMapping("/car-service/reserving")
@Slf4j
public class CarServiceReservingController {

  @PostMapping("/reserved")
  public Status getCarStateMockReserved(@RequestBody CarAction action) {
    CarState mockedAnswer = CarState.CAR_RESERVED;
    log.info("Mocked service /car-service/reserving for carId =" + action.getCarId() + ", answer: " + mockedAnswer);
    return new Status(mockedAnswer);
  }

  @PostMapping("/rent")
  public Status getCarStateMockInRent(@RequestBody CarAction action) {
    CarState mockedAnswer = CarState.CAR_IN_RENT;
    log.info("Mocked service /car-service/reserving for carId =" + action.getCarId() + ", answer: " + mockedAnswer);
    return new Status(mockedAnswer);
  }

  @PostMapping("/no-signal")
  public Status getCarStateMockNoSignal(@RequestBody CarAction action) {
    CarState mockedAnswer = CarState.NO_SIGNAL;
    log.info("Mocked service /car-service/reserving for carId =" + action.getCarId() + ", answer: " + mockedAnswer);
    return new Status(mockedAnswer);
  }
}
