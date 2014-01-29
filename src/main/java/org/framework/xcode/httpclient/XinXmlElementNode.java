//
// Copyright XinLab Inc (blueapple.mobi) 2006-2008
// Proprietary and confidential
// All rights reserved
//
// $Id$
//
package org.framework.xcode.httpclient;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class XinXmlElementNode {

    private ArrayList elements;
    private HashMap attributes;
    private String name;
    private String text;
    private String cdata;
    static private final String indent = "     "; 
    
    public XinXmlElementNode(String name) {
        this.name = name;
        text = "";
        elements = new ArrayList();
        attributes = new HashMap();
    }
    public XinXmlElementNode(String name, String text) {
        this.name = name;
        this.text = text;
        elements = new ArrayList();
        attributes = new HashMap();
    }
    public XinXmlElementNode(String name, XinXmlElementNode node) {
        this.name = name;
        text = "";
        elements = new ArrayList();
        attributes = new HashMap();
        elements.add(node);
    }
    public XinXmlElementNode(String name, XinXmlElementNode[] nodes) {
        this.name = name;
        text = "";
        elements = new ArrayList();
        attributes = new HashMap();
        elements.addAll(Arrays.asList(nodes));
    }
    public XinXmlElementNode(String name, String[][] attributes) {
        this.name = name;
        text = "";
        elements = new ArrayList();
        this.attributes = new HashMap();
        for (int i=0; i<attributes.length; i++)
            this.attributes.put(attributes[i][0], attributes[i][1]);
    }
    public XinXmlElementNode(String name, String[][] attributes, XinXmlElementNode node) {
        this.name = name;
        text = "";
        elements = new ArrayList();
        this.attributes = new HashMap();
        elements.add(node);
        for (int i=0; i<attributes.length; i++)
            this.attributes.put(attributes[i][0], attributes[i][1]);
    }
    public XinXmlElementNode(String name, String[][] attributes, XinXmlElementNode[] nodes) {
        this.name = name;
        text = "";
        elements = new ArrayList();
        this.attributes = new HashMap();
        elements.addAll(Arrays.asList(nodes));
        for (int i=0; i<attributes.length; i++)
            this.attributes.put(attributes[i][0], attributes[i][1]);
    }
    public final XinXmlElementNode addElement(XinXmlElementNode element)
    {
        //elements.put(element.getName(), element);
        elements.add(element);
        
        return element;
    }
    public final XinXmlElementNode[] getElements()
    {
        //return (XinXmlElementNode[]) elements.values().toArray(new XinXmlElementNode[0]);
        return (XinXmlElementNode[]) elements.toArray(new XinXmlElementNode[0]);
    }
    
    public final void addAttribute(String name, String value)
    {
        attributes.put(name, value);
    }
    public final String getName() {
        return name;
    }
    public final String getAttribute(String name)
    {
        return (String) attributes.get(name);
    }
    //
    // get all the nodes with the same name
    //
    public final XinXmlElementNode[] getElements(String name)
    {
        ArrayList nodes = new ArrayList();
        XinXmlElementNode[] elements = getElements();
        for (int i=0; i<elements.length; i++)
            if (elements[i]!=null && elements[i].getName().equals(name))
                nodes.add(elements[i]);
        return (XinXmlElementNode[]) nodes.toArray(new XinXmlElementNode[0]);
    }
    //
    // get the first node that matches the name
    //
    public final XinXmlElementNode getElement(String name)
    {
//        ArrayList nodes = new ArrayList();
        XinXmlElementNode[] elements = getElements();
        for (int i=0; i<elements.length; i++)
            if (elements[i]!=null && elements[i].getName().equals(name))
                return elements[i];
        return null;
    }
    public final String getElementText(String name)
    {
        XinXmlElementNode node = getElement(name);
        return node==null?null:node.text;
    }
    
    public final String getText() {
        return text;
    }
    public final void setText(String text) {
        this.text = text;
    }
    public final void setCDATA(String cdata) {
        this.cdata = cdata;
    }
    public final void appendText(String text) {
        this.text += text;
    }
    
    public final String printXml()
    {
        String s = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        s += printElement("");
        return s;
    }
    public final String printElement(String indent)
    {
        
/* use these one if text will be mixed with elements
         String s = "";
        s += indent + "<" + name;
        
        Map.Entry[] enties = (Map.Entry[])attribute.entrySet().toArray(new Map.Entry[0]);
        for (int i=0; i<enties.length; i++)
            s += " " + enties[i].getKey() + "=\"" + enties[i].getValue() + "\"";
        
        s += ">";

        s += "\n";
        if (text.length()>0)
            s += indent + XinXmlElementNode.indent + text + "\n";
        
        XinXmlElementNode[] elements = getElements();
        for (int i=0; i<elements.length; i++)
            s += elements[i].printElement(indent + XinXmlElementNode.indent);
        
        s += indent + "</" + name + ">\n";
        
        return s;
  
 */        
        
        XinXmlElementNode[] elements = getElements();

        StringBuffer s = new StringBuffer(2000);
        s.append(indent).append("<").append(name);
        
        Map.Entry[] enties = (Map.Entry[])attributes.entrySet().toArray(new Map.Entry[0]);
        for (int i=0; i<enties.length; i++)
            s.append(" ").append(enties[i].getKey()).append("=\"").append(enties[i].getValue()).append("\"");
        
        if ((text==null || text.length()==0) && (cdata==null || cdata.length()==0) && elements.length==0){
            s.append("/>\n");
        }else{
            s.append(">");
            
            if (text!=null && text.length()>0)
                s.append(validateXML(text));
            
            if (cdata!=null && cdata.length()>0)
                s.append("<![CDATA[").append(cdata).append("]]>");
            
            if (elements.length>0){
                s.append("\n");
            
                for (int i=0; i<elements.length; i++)
                    if (elements[i]!=null)
                        s.append(elements[i].printElement(indent+XinXmlElementNode.indent));
            
                s.append(indent);
            }            
            s.append("</").append(name).append(">\n");
        }        
        return s.toString();
    }
    public final String toString(){
        return printXml();//getString("");
    }
    public final String getString(String indent){

        StringBuffer s = new StringBuffer(2000);
        s.append(indent).append(name).append("\r\n");
        Map.Entry[] enties = (Map.Entry[])attributes.entrySet().toArray(new Map.Entry[0]);
        if (enties.length>0)
        {
            s.append(indent);
            for (int i=0; i<enties.length; i++)
                s.append(enties[i].getKey()).append("=").append(enties[i].getValue()).append(" ");
            s.append("\r\n");
        }
        if (text!=null && text.length()>0)
            s.append(indent).append(validateXML(text)).append("\r\n");

        if (cdata!=null && cdata.length()>0)
            s.append(indent).append("<![CDATA[").append(cdata).append("]]>").append("\r\n");

        s.append("-------------------------------------").append("\r\n");
        XinXmlElementNode[] elements = getElements();
        for (int i=0; i<elements.length; i++)
            if (elements[i]!=null)
                s.append(elements[i].getString(indent + "     "));
        
        return s.toString();
    }
    static final String AMP = "&amp;";
    static final String LT = "&lt;";
    static final String GT = "&gt;";
    static final String APOS = "&apos;";
    static final String QUOT = "&quot;";
    static final String DOLLAR = "$$";
    public static String validateXML(CharSequence cs){
        
         int len = cs.length();
         int offset=0;
         for (; offset<len; offset++)
         {
            char c = cs.charAt(offset);
             if (c=='&'||c=='<'||c=='>'||c=='\''||c=='"')
                 break;
         }
         if (offset==len)
             return cs.toString();
         
        StringBuffer sb = new StringBuffer(cs.subSequence(0, offset));
        for (; offset<len; offset++)
        {
            char c = cs.charAt(offset);
            if (c=='&'){
                sb.append(AMP);
            }else if(c=='<'){
                sb.append(LT);
            }else if(c=='>'){
                sb.append(GT);
            }else if(c=='\''){
                sb.append(APOS);
            }else if(c=='"'){
                sb.append(QUOT);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }    
}
