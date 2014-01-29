package org.framework.business.model.service.privilege;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;import java.lang.Override;import java.lang.String;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 11/12/13
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConfigXmlHandler extends DefaultHandler {

    private String status;
    public String getResponseStatus() {
        return status;
    }

    public String getStatus(InputStream xmlStream) throws ParserConfigurationException, SAXException, IOException {

        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        ConfigXmlHandler handler = new ConfigXmlHandler();
        parser.parse(xmlStream, handler);
        return handler.getResponseStatus();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if ("response".equals(qName)) {
            status = attributes.getValue("status");
        }
    }
}
