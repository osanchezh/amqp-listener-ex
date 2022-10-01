package org.osanchezhuerta.eventscheduling.engine.soa.services.producer;

import org.osanchezhuerta.eventscheduling.engine.soa.commons.exception.EngineAmqpException;
import org.osanchezhuerta.eventscheduling.engine.soa.commons.vo.BusinessMessage;

public interface BusinessMessageSender<T> {
    void sendMessage(BusinessMessage<T> businessMessage) throws EngineAmqpException;

}
