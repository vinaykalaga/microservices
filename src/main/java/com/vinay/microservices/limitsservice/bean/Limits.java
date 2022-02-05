package com.vinay.microservices.limitsservice.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Limits {

	private int minimum;
	private int maximum;

	public Limits() {
		super();
	}

	public Limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

}
