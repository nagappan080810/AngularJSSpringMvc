package com.springmvc.tutorial.bo.bean;

import org.springframework.stereotype.Component;

@Component
public class MessageBean {
	
	private String value;
	
	private Boolean isAlive = true;
	
	public MessageBean(){}
	
	public MessageBean(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public Boolean getStatus(){
		return isAlive;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MessageBean [value=" + value + "]";
	}
	
}
