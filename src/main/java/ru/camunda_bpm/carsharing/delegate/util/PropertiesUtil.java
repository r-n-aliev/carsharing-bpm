package ru.camunda_bpm.carsharing.delegate.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.camunda_bpm.carsharing.delegate.exception.ConfigLoadingException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static ru.camunda_bpm.carsharing.delegate.util.consts.SysMsgs.CONFIG_LOAD_FAIL;
import static ru.camunda_bpm.carsharing.delegate.util.consts.SysMsgs.CONFIG_LOAD_SUCCESS;

public class PropertiesUtil {
  private static final Logger log = LoggerFactory.getLogger(PropertiesUtil.class);

  /**
   * Безопасное чтение пропертей из файла
   *
   * @param filePath путь к файлу - ОТКУДА
   * @return Properties
   */
  public static Properties loadPropertiesFromUTF8File(String filePath) {
    Properties properties = new Properties();

    try (InputStreamReader reader =
             new InputStreamReader(
                 new FileInputStream(filePath), UTF_8)) {
      properties.load(reader);
      log.debug(format(CONFIG_LOAD_SUCCESS, filePath, properties.size()));
    } catch (IOException e) {
      throw new ConfigLoadingException(format(CONFIG_LOAD_FAIL, filePath), e);
    }
    return properties;
  }
}
