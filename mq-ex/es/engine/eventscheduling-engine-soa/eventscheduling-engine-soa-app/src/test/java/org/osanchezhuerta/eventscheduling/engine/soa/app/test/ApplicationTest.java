package org.osanchezhuerta.eventscheduling.engine.soa.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.osanchezhuerta.eventscheduling.engine.soa.app.main.EventSchedulingApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringApplicationConfiguration(classes = EventSchedulingApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTest {
	private static final Logger LOGGER =  LoggerFactory.getLogger(ApplicationTest.class);
	
	@Test
	public void testRunning(){
		LOGGER.debug("test.1");
	}
}
