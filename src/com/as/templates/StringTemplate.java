package com.as.templates;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class StringTemplate {

  static Logger log = Logger.getLogger(StringTemplate.class);

  private static final String SMS_TEMPLATE =
      "Уважаемый ${user.name}! Ваш заказ будет доставлен по адресу ${user.address}.";

  public static void main(String[] args) {
    Map<String, String> valuesMap = new HashMap<>();
    valuesMap.put("user.name", "Николай Петрович");
    valuesMap.put("user.address", "Москва, Ленинский проспект, дом 1");
    StrSubstitutor sub = new StrSubstitutor(valuesMap);
    String resolvedString = sub.replace(SMS_TEMPLATE);
    log.info(resolvedString);
  }
}
