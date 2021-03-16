package Day16;

import java.io.File;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;


public  class readxml {
	public static Map<String, Object[]> read()throws Exception {
		ArrayList<String> sno= new ArrayList<String>();
		ArrayList<String> itemname = new ArrayList<String>();
	    ArrayList<String>quantity = new ArrayList<String>();
	    ArrayList<String> unit = new ArrayList<String>();
	    ArrayList<String> price = new ArrayList<String>();

	    try {

	        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	        Document doc = docBuilder.parse(new File("C:\\Users\\HP\\eclipse-workspace\\ey\\grocerybill.xml"));
	        doc.getDocumentElement().normalize();
	        NodeList listOfItems = doc.getElementsByTagName("item");
	        int totalItems = listOfItems.getLength();
	        for (int s = 0; s <totalItems ; s++) 
	        {
	            Node ItemNode = listOfItems.item(s);
	            if (ItemNode.getNodeType() == Node.ELEMENT_NODE) 
	            {
	                Element ItemElement = (Element) ItemNode;
	                NodeList SnoList = ItemElement.getElementsByTagName("sno");
	                Element SnoElement = (Element) SnoList.item(0);
	                NodeList textSnoList = SnoElement.getChildNodes();
	               sno.add(((Node) textSnoList.item(0)).getNodeValue().trim());
	               
	             
	               NodeList ItemNameList = ItemElement.getElementsByTagName("itemname");
	               Element ItemNameElement = (Element) ItemNameList.item(0);
	               NodeList textItemNameList = ItemNameElement.getChildNodes();
	              itemname.add(((Node) textItemNameList.item(0)).getNodeValue().trim());
	                
	              NodeList QuantityList = ItemElement.getElementsByTagName("quantity");
	              Element QuantityElement = (Element) QuantityList.item(0);
	              NodeList textQuantityList = QuantityElement.getChildNodes();
	             quantity.add(((Node) textQuantityList.item(0)).getNodeValue().trim());
	             
	             NodeList unitList = ItemElement.getElementsByTagName("unit");
	             Element unitElement = (Element) unitList.item(0);
	             NodeList textunitList = unitElement.getChildNodes();
	            unit.add(((Node) textunitList.item(0)).getNodeValue().trim());
	            
	            NodeList PriceList = ItemElement.getElementsByTagName("price");
	            Element PriceElement = (Element) PriceList.item(0);
	            NodeList textPriceList = PriceElement.getChildNodes();
	           price.add(((Node) textPriceList.item(0)).getNodeValue().trim());
	            }
	        }
	    }
	    catch(Exception e)
	    {
e.printStackTrace();
	    }
	    Map<String, Object[]> data = new HashMap<String, Object[]>();
	    for(int i=0;i<sno.size();i++)
	    {
	        data.put(i+"",new Object[]{sno.get(i),itemname.get(i),quantity.get(i),unit.get(i),price.get(i),});
	    }   return data;}
	
}
