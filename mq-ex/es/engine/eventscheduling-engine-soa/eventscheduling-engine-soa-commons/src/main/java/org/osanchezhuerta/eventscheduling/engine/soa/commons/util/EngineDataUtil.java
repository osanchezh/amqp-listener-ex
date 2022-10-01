package org.osanchezhuerta.eventscheduling.engine.soa.commons.util;

import java.util.Date;

import org.joda.time.DateTime;

public final class EngineDataUtil {
  public static Date currentDate(){
	  DateTime st = new DateTime();
	  return st.toDate();
  }
}
