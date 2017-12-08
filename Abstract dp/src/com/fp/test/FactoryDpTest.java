package com.fp.test;

import com.fp.desk.SumHosptalHelpDesk;

public class FactoryDpTest {
	public static void main(String[] args) {
		SumHosptalHelpDesk helpDesk = new SumHosptalHelpDesk();
		helpDesk.preApprovalInsurance("heart surgury", "H3654987", "Aviva");
	}
}
