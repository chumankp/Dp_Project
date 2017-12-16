package org.mypersist.factory;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.mypersist.conf.JDBCConfiguration;
import org.mypersist.conf.QueryExecutor;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public abstract class AbstractQueryExecutorFactory {

	public QueryExecutor newqueryExecutor(String type, String connfigFilePath)
			throws ParserConfigurationException, SAXException, IOException {
		JDBCConfiguration configuration = new JDBCConfiguration();
		Document document = null;
		DocumentBuilder builder = null;
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builder = builderFactory.newDocumentBuilder();
		document = builder.parse(this.getClass().getClassLoader().getResourceAsStream(connfigFilePath));
		Node node = document.getFirstChild(); // query executer
		NodeList nodeList = node.getChildNodes(); // Child of config
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i).getNodeName().equals("configuration")) {
				Node childNode = nodeList.item(i); // config
				NodeList childNodeList = childNode.getChildNodes(); // Child config node
				for (int j = 0; j < childNodeList.getLength(); j++) {
					if (childNodeList.item(j).getNodeName().equals("driverClassName")) {
						configuration.setDriverClassName(childNodeList.item(j).getTextContent());
					}
					if (childNodeList.item(j).getNodeName().equals("")) {
						configuration.setDriverUrl(childNodeList.item(j).getTextContent());
					}
					if (childNodeList.item(j).getNodeName().equals("")) {
						configuration.setUserName(childNodeList.item(j).getTextContent());
					}
					if (childNodeList.item(j).getNodeName().equals("")) {
						configuration.setPassword(childNodeList.item(j).getTextContent());
					}
				} // for Child Node(j)
			} // if for config
		} // for child Node(i)

		return createQueryExector(configuration, type);
	} // QueryExecutor
	
	public abstract QueryExecutor createQueryExector(JDBCConfiguration configuration, String type);

}
