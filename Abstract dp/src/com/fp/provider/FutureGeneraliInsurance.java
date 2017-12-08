package com.fp.provider;

public class FutureGeneraliInsurance extends AbstractInsurance{

	public FutureGeneraliInsurance(String hospitalNo, String hospitalName, String partnerCode) {
		super(hospitalNo, hospitalName, partnerCode);
	}

	@Override
	public void submitAuthorizaction(String operaction, String hCardNo) {
		System.out.println("Future Generali Insurance "+hCardNo+" For the "+operaction+" Operaction for the hosptal code"+partnerCode+" "+hospitalName);
	}


}
