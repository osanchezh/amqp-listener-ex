package org.osanchezhuerta.eventscheduling.engine.soa.commons.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BusinessMessage<T> implements Serializable {
	private static final long serialVersionUID = -340634314886182621L;
	private T message;
	private Map<String,Object> headers;
	private int priority;
	private String correlationId;
	private String messageId;
	private String applicationId;
	
	public Map<String, Object> getHeaders() {
		if(headers==null){
			headers = new HashMap<String,Object>();
		}
		return headers;
	}
	public void setHeaders(Map<String, Object> headers) {
		this.headers = headers;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public T getMessage() {
		return message;
	}
	public void setMessage(T message) {
		this.message = message;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "BusinessMessage [" + (message != null ? "message=" + message + ", " : "")
				+ (headers != null ? "headers=" + headers + ", " : "") + "priority=" + priority + ", "
				+ (correlationId != null ? "correlationId=" + correlationId + ", " : "")
				+ (messageId != null ? "messageId=" + messageId + ", " : "")
				+ (applicationId != null ? "applicationId=" + applicationId : "") + "]";
	}
	


  
}
