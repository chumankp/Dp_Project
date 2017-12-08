package com.fp.provider;

public abstract class AbstractInsurance implements Insurance {
	protected String hospitalNo;
	protected String hospitalName;
	protected String partnerCode;

	public AbstractInsurance(String hospitalNo, String hospitalName, String partnerCode) {
		super();
		this.hospitalNo = hospitalNo;
		this.hospitalName = hospitalName;
		this.partnerCode = partnerCode;
	}

}
