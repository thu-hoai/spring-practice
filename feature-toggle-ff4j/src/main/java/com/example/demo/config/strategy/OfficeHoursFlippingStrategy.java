package com.example.demo.config.strategy;

import java.util.Calendar;
import java.util.Map;

import org.ff4j.core.FeatureStore;
import org.ff4j.core.FlippingExecutionContext;
import org.ff4j.strategy.AbstractFlipStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OfficeHoursFlippingStrategy extends AbstractFlipStrategy {

  private static final Logger LOGGER = LoggerFactory.getLogger(OfficeHoursFlippingStrategy.class);

  private int start = 0;
  private int end = 0;

  @Override
  public void init(String featureName, Map<String, String> initValue) {
    super.init(featureName, initValue);
    assertRequiredParameter("startDate");
    assertRequiredParameter("endDate");
    start = Integer.valueOf(initValue.get("startDate"));
    end = Integer.valueOf(initValue.get("endDate"));
  }

  @Override
  public boolean evaluate(String fName, FeatureStore fStore, FlippingExecutionContext ctx) {
    LOGGER.debug("Evaluating OfficeHoursFlippingStrategy for feature {}", fName);
    int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    return currentHour >= start && currentHour < end;
  }
}
