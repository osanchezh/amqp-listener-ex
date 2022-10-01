package org.osanchezhuerta.eventscheduling.engine.soa.model.exchange;

import java.io.Serializable;
import java.util.Date;

public class IdentityRequest implements Serializable {
	
   private static final long serialVersionUID = 3687992688297115952L;
  
   private int attempts;
   private Date creationTime;
   private String encXmlInput;
   private String encXmlOutput;
   
    public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public String getEncXmlInput() {
		return encXmlInput;
	}
	public void setEncXmlInput(String encXmlInput) {
		this.encXmlInput = encXmlInput;
	}
	public String getEncXmlOutput() {
		return encXmlOutput;
	}
	public void setEncXmlOutput(String encXmlOutput) {
		this.encXmlOutput = encXmlOutput;
	}
}
