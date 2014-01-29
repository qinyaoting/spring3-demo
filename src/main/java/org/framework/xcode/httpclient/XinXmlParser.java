//
// Copyright XinLab Inc (blueapple.mobi) 2006-2008
// Proprietary and confidential
// All rights reserved
//
// $Id$
//
package org.framework.xcode.httpclient;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XinXmlParser {

    private static final Logger  vulogger = Logger.getLogger(XinXmlParser.class);
    
    public final XinXmlElementNode parseFile(String filename) throws IOException, FactoryConfigurationError, ParserConfigurationException, SAXException
    {
        Document document;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //factory.setValidating(true);
        //factory.setNamespaceAware(true);
        
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(new File(filename));
        Node node = document.getDocumentElement();
          
        return toXmlElementNode(node);
    }    
    public final XinXmlElementNode parseUri(String uri) throws IOException, FactoryConfigurationError, ParserConfigurationException, SAXException
    {
        Document document;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //factory.setValidating(true);
        //factory.setNamespaceAware(true);

        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(uri);
        Node node = document.getDocumentElement();
          
        return toXmlElementNode(node);
    }
    public final XinXmlElementNode parseString(String s) throws IOException, FactoryConfigurationError, ParserConfigurationException, SAXException
    {
        Document document;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //factory.setValidating(true);
        //factory.setNamespaceAware(true);
        
        DocumentBuilder builder = factory.newDocumentBuilder();
        try {
            document = builder.parse(new InputSource(new StringReader(s)));
        } catch (SAXException e)
        {
            vulogger.warn("***Error parsing following XML***");
            vulogger.warn(s);
            vulogger.warn("***Exception details***");
            throw e;
        }
        Node node = document.getDocumentElement();
          
        return toXmlElementNode(node);
    }
    public final XinXmlElementNode parseInputStream(InputStream in) throws IOException, FactoryConfigurationError, ParserConfigurationException, SAXException
    {
        Document document;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //factory.setValidating(true);
        //factory.setNamespaceAware(true);
        
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(in);
        Node node = document.getDocumentElement();
          
        return toXmlElementNode(node);
    }
    private final XinXmlElementNode toXmlElementNode(Node parent) {
        Node child = parent.getFirstChild();
        XinXmlElementNode xmlnode = new XinXmlElementNode(parent.getNodeName().trim());
        
        //
        // get attr
        //
         NamedNodeMap attrs = parent.getAttributes();
        for(int i=0; i<attrs.getLength(); i++){ 
            Attr attr = (Attr)attrs.item(i);
            xmlnode.addAttribute(attr.getNodeName(), attr.getNodeValue());
            //vulogger.debug("Attribute:"+attr.getNodeName()+" Value:"+attr.getNodeValue());
        }
        
        //
        // get chile text/node elements
        //
        while (child != null){
            if(Node.ELEMENT_NODE == child.getNodeType()){
                //vulogger.debug(node.getNodeName().trim());
                xmlnode.addElement(toXmlElementNode(child));
            } else if (Node.TEXT_NODE == child.getNodeType() || Node.CDATA_SECTION_NODE == child.getNodeType()){
                String s = child.getNodeValue().trim();
                //if (s.length()>0)
                {
                    //vulogger.debug("text:"+s);
                    xmlnode.appendText(s);
                }
            }
            child = child.getNextSibling();
        }
        return xmlnode;
    }
}
