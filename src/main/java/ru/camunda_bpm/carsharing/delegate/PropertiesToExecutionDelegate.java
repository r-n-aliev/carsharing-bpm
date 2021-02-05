package ru.camunda_bpm.carsharing.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import ru.camunda_bpm.carsharing.delegate.base.ExecutionProcessor;
import ru.camunda_bpm.carsharing.delegate.util.PropertiesUtil;

import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import static ru.camunda_bpm.carsharing.delegate.util.consts.Paths.BPM_PROPERTIES_PATH;

/**
 * Устанавливает глобальные конфиги процессов в execution context.
 */
public final class PropertiesToExecutionDelegate implements JavaDelegate {

  public void execute(DelegateExecution execution) {
    Map<String, String> props = toMap(PropertiesUtil.loadPropertiesFromUTF8File(BPM_PROPERTIES_PATH));
    new ExecutionProcessor(execution)
        .setConfigsToExecution(props);
  }

  private Map<String, String> toMap(Properties properties) {
    return properties.entrySet().stream()
        .collect(Collectors.toMap(
            prop -> String.valueOf(prop.getKey()), prop -> String.valueOf(prop.getValue()).trim()));
  }
}
