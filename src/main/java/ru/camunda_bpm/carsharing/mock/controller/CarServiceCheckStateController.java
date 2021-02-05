package ru.camunda_bpm.carsharing.mock.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.camunda_bpm.carsharing.mock.domain.CarState;
import ru.camunda_bpm.carsharing.mock.domain.Status;

@RestController
@RequestMapping("/car-service/check-state")
@Slf4j
public class CarServiceCheckStateController {

  @GetMapping("/available")
  public Status getCarStateMockAvailable(@RequestParam("carID") Long carId) {
    CarState mockedAnswer = CarState.CAR_AVAILABLE;
    log.info("Mocked service /car-service/reserving for carId =" + carId + ", answer: " + mockedAnswer);
    return new Status(mockedAnswer);
  }

  @GetMapping("/rent")
  public Status getCarStateMockInRent(@RequestParam("carID") Long carId) {
    CarState mockedAnswer = CarState.CAR_IN_RENT;
    log.info("Mocked service /car-service/reserving for carId =" + carId + ", answer: " + mockedAnswer);
    return new Status(mockedAnswer);
  }

  @GetMapping("/maintenance")
  public Status getCarStateMockInService(@RequestParam("carID") Long carId) {
    CarState mockedAnswer = CarState.CAR_IN_SERVICE_MODE;
    log.info("Mocked service /car-service/reserving for carId =" + carId + ", answer: " + mockedAnswer);
    return new Status(mockedAnswer);
  }
}
