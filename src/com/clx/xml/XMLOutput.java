package com.clx.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * Created by ur15975@outlook.com on 2017/6/12.
 */
public class XMLOutput {
    public static void main(String[] args) throws IOException {
        setRootElement("陈立翔");
    }

    public static void setRootElement(String root) throws IOException {
        Document document = DocumentHelper.createDocument();
        Element rootElement = document.addElement("Name");
        rootElement.setText(root);

        StringWriter stringWriter = new StringWriter();

        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setEncoding("UTF-8");
        outputFormat.setNewlines(true);
        outputFormat.setIndent("    ");

        XMLWriter xmlWriter = new XMLWriter(new FileWriter(new File("D:\\123.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();

    }
}



