package com.fp.factory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.fp.provider.AvivaLifeInsurance;
import com.fp.provider.FutureGeneraliInsurance;
import com.fp.provider.Insurance;

public class InsuranceFactory {
	public static Insurance getInsurance(String provider) {
		String hospitalNo = null;
		String hospitalName = null;
		String partnerCode = null;
		Insurance insurance = null;

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder
					.parse(InsuranceFactory.class.getClassLoader().getResourceAsStream("provider.xml"));
			NodeList nodeList = document.getElementsByTagName("*");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element element = (Element) nodeList.item(i);
				String nodeName = element.getNodeName();
				if (nodeName.equals("insurance-partner")) {
				} else if (nodeName.equals("hospital-no")) {
					hospitalNo = element.getChildNodes().item(0).getNodeValue();
				} else if (nodeName.equals("hospital-name")) {
					hospitalName = element.getChildNodes().item(0).getNodeValue();
				} else if (nodeName.equals("partner-code")) {
					partnerCode = element.getChildNodes().item(0).getNodeValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}

		if (provider != null) {
			if (provider.equalsIgnoreCase("Aviva")) {
				insurance = new AvivaLifeInsurance(hospitalNo, hospitalName, partnerCode);
			} else if (provider.equalsIgnoreCase("Future")) {
				insurance = new FutureGeneraliInsurance(hospitalNo, hospitalName, partnerCode);
			}
		}
		return insurance;

	}
}
