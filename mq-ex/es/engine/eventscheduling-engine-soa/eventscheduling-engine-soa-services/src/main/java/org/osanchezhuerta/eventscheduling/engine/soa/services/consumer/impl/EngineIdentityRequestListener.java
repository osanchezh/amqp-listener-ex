package org.osanchezhuerta.eventscheduling.engine.soa.services.consumer.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class EngineIdentityRequestListener implements MessageListener {
	private static final Logger LOGGER =  LoggerFactory.getLogger(EngineIdentityRequestListener.class);

	@Override
	public void onMessage(Message message) {

		LOGGER.debug("mensaje registrado");
		byte[] msg = message.getBody();
		String msgr = new String(msg);
		
		LOGGER.debug("mensaje.recibido.EngineIdentityRequestListener="+msgr);
	}

}
