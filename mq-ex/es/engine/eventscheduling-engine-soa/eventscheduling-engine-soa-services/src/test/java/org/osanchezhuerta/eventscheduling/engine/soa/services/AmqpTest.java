package org.osanchezhuerta.eventscheduling.engine.soa.services;


import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.osanchezhuerta.eventscheduling.engine.soa.commons.exception.EngineAmqpException;
import org.osanchezhuerta.eventscheduling.engine.soa.commons.vo.BusinessMessage;
import org.osanchezhuerta.eventscheduling.engine.soa.model.exchange.IdentityRequest;
import org.osanchezhuerta.eventscheduling.engine.soa.services.producer.BusinessMessageSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"file:src/main/resources/spring/init-engine-soa-services-springctx.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AmqpTest {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(AmqpTest.class);
    
	@Autowired
	@Qualifier("engineJacksonObjectMapper")
	private ObjectMapper engineJacksonObjectMapper;

	@Autowired
	@Qualifier("engineIdentityRequestSender")
	private BusinessMessageSender<String> engineIdentityRequestSender;
	@Autowired
	@Qualifier("engineIdentityRequestContainer")
    private MessageListenerContainer engineIdentityRequestContainer;
    


	@Test
	public void testAmqpConfiguration(){
		LOGGER.debug("TEST1");
		IdentityRequest identityRequest = new IdentityRequest();
		StringWriter sw = new StringWriter();
		try {
			engineJacksonObjectMapper.writeValue(sw, identityRequest);
			LOGGER.debug("sw="+sw.toString());
			BusinessMessage<String> businessMessage = new BusinessMessage<String>();
			businessMessage.setCorrelationId("12345");
			businessMessage.setApplicationId("test");
			businessMessage.setPriority(3);
			businessMessage.setMessage(sw.toString());
			businessMessage.setMessageId("1234");
			
			LOGGER.debug("mennsaje.enviado.1");
			engineIdentityRequestSender.sendMessage(businessMessage);
			LOGGER.debug("mennsaje.enviado.2");

			engineIdentityRequestContainer.start();
			LOGGER.debug("mennsaje.enviado.3");

			Thread.sleep(100000L);
			LOGGER.debug("mennsaje.enviado.4");

			engineIdentityRequestContainer.stop();
			LOGGER.debug("mennsaje.enviado.5");

		} catch (IOException exception) {
			LOGGER.error(exception.getMessage(),exception);
		} catch (EngineAmqpException exception) {
			LOGGER.error(exception.getMessage(),exception);

		} catch (InterruptedException exception) {
			LOGGER.error(exception.getMessage(),exception);

		}
		
		
	}
	

	public MessageListenerContainer getEngineIdentityRequestContainer() {
		return engineIdentityRequestContainer;
	}


	public void setEngineIdentityRequestContainer(MessageListenerContainer engineIdentityRequestContainer) {
		this.engineIdentityRequestContainer = engineIdentityRequestContainer;
	}
	public BusinessMessageSender<String> getEngineIdentityRequestSender() {
		return engineIdentityRequestSender;
	}

	public void setEngineIdentityRequestSender(BusinessMessageSender<String> engineIdentityRequestSender) {
		this.engineIdentityRequestSender = engineIdentityRequestSender;
	}
	
	public ObjectMapper getEngineJacksonObjectMapper() {
		return engineJacksonObjectMapper;
	}
	public void setEngineJacksonObjectMapper(ObjectMapper engineJacksonObjectMapper) {
		this.engineJacksonObjectMapper = engineJacksonObjectMapper;
	}
}
