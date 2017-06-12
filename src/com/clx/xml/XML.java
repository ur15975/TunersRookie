package com.clx.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ur15975@outlook.com on 2017/6/12.
 */
public class XML {
    static String xmlTotal = "";
    static Map<String, String> xmlMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        testGetRoot();
        System.out.println(testGetRoot());
    }

    public static String  testGetRoot() throws Exception{
        SAXReader sax=new SAXReader();
        File xmlFile=new File("D:\\Mywork\\TunersRookie\\000000000955679970.xml");
        Document document=sax.read(xmlFile);
        Element root=document.getRootElement();
        return getNodes(root);
    }

    public static String getNodes(Element node){
        xmlTotal += "--------------------\n";
        xmlTotal += "当前节点名称：" + node.getName() + "\n";
        xmlTotal += "当前节点的内容：" + node.getTextTrim() + "\n";

//        System.out.println("--------------------");
//        System.out.println("当前节点名称："+node.getName());
//        System.out.println("当前节点的内容："+node.getTextTrim());
        xmlMap.put("当前节点名称：", node.getName());
        xmlMap.put("当前节点的内容：", node.getTextTrim());


        List<Attribute> listAttr=node.attributes();
        for(Attribute attr:listAttr){
            String name=attr.getName();
            String value=attr.getValue();
//            System.out.println("属性名称："+name+"属性值："+value);
            xmlTotal += "属性名称：" + name + "属性值：" + value + "\n";
//            xmlMap.put()
        }


        List<Element> listElement=node.elements();
        for(Element e:listElement){
            getNodes(e);
        }

        return xmlTotal;
    }
}
