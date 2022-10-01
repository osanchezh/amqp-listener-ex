package org.osanchezhuerta.eventscheduling.engine.soa.commons.util;

import org.osanchezhuerta.eventscheduling.engine.soa.commons.constant.EventSchedulingConstant;

public final class EngineSchedulingPidUtil {
  public static String createPidName(String applicationName){
	  StringBuilder sbApplicationName = new StringBuilder();
	  sbApplicationName.append("./");
	  sbApplicationName.append(applicationName);
	  sbApplicationName.append(".");
	  sbApplicationName.append(EventSchedulingConstant.PID_EXTENSION);
	  return sbApplicationName.toString();
  }
}
