package ru.camunda_bpm.carsharing.mock.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.camunda_bpm.carsharing.mock.domain.Command;
import ru.camunda_bpm.carsharing.mock.domain.CommandResult;
import ru.camunda_bpm.carsharing.mock.domain.TelematicsResponse;

@RestController
@RequestMapping("/telematics-service")
@Slf4j
public class TelematicsServiceController {

  @PostMapping("/success")
  public TelematicsResponse mockSuccess(@RequestBody Command command) {
    CommandResult mockedAnswer = CommandResult.SUCCESS;
    log.info("Mocked service /telematics-service for carId =" + command.getCarId() + ", answer: " + mockedAnswer);
    return new TelematicsResponse(command.getCarId(), command.getCommand(), mockedAnswer);
  }

  @PostMapping("/no-signal")
  public TelematicsResponse mockNoSignal(@RequestBody Command command) {
    CommandResult mockedAnswer = CommandResult.NO_SIGNAL;
    log.info("Mocked service /telematics-service for carId =" + command.getCarId() + ", answer: " + mockedAnswer);
    return new TelematicsResponse(command.getCarId(), command.getCommand(), mockedAnswer);
  }
}
