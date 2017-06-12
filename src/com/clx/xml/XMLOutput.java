package com.clx.xml;

import jdk.internal.util.xml.XMLStreamException;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ur15975@outlook.com on 2017/6/12.
 */
public class XMLOutput {
    public static void main(String[] args) throws IOException {
    }

    public static void setRootElement(String root) throws IOException {
        Document document = DocumentHelper.createDocument();
        Element rootElement = document.addElement("Name");
        rootElement.setText(root);
        XMLWriter xmlWriter = new XMLWriter(new FileWriter(new File("D:\\123.xml")));
        xmlWriter.write(document);
        xmlWriter.close();
    }
}



