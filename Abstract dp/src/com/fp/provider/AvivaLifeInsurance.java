package com.fp.provider;

public class AvivaLifeInsurance extends AbstractInsurance {

	public AvivaLifeInsurance(String hospitalNo, String hospitalName, String partnerCode) {
		super(hospitalNo, hospitalName, partnerCode);
	}

	@Override
	public void submitAuthorizaction(String operaction, String hCardNo) {
		System.out.println("Aviva Life Insurance "+hCardNo+" For the "+operaction+" Operaction for the hosptal code "+partnerCode+" Name "+hospitalName);
	}
}
