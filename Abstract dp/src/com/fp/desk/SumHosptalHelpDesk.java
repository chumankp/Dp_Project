package com.fp.desk;

import com.fp.factory.InsuranceFactory;
import com.fp.provider.Insurance;

public class SumHosptalHelpDesk {
	public void preApprovalInsurance(String operation, String healthCardNo, String provider) {
		Insurance insurance = InsuranceFactory.getInsurance(provider);
		insurance.submitAuthorizaction(operation, healthCardNo);
	}
}
