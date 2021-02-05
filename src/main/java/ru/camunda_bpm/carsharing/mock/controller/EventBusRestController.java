package ru.camunda_bpm.carsharing.mock.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.camunda_bpm.carsharing.mock.domain.Event;

@RestController
@RequestMapping("/event-bus")
@Slf4j
public class EventBusRestController {

  @PostMapping("/push")
  public ResponseEntity mockSuccess(@RequestBody Event event) {
    log.info("Mocked service /event-bus for carId =" + event.getCarId() + " event =" + event.getEvent() + ", answer: 200 OK");
    return ResponseEntity.ok().build();
  }
}
