package ru.camunda_bpm.carsharing.delegate.base;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.camunda_bpm.carsharing.delegate.util.consts.SysMsgs;

import java.util.Map;

import static java.lang.String.format;

public class ExecutionProcessor {
  private static final Logger log = LoggerFactory.getLogger(ExecutionProcessor.class);

  private DelegateExecution execution;

  public ExecutionProcessor(DelegateExecution execution) {
    this.execution = execution;
  }

  public void setConfigsToExecution(Map<String, String> properties) {
    properties.forEach((key, val) -> {
      try {
        execution.setVariable(key, val);
        log.info(format(SysMsgs.CONFIG_ADDED_TO_EXECUTION, key, val));
      } catch (Exception e) {
        log.error(e.getMessage());
      }
    });
  }
}
