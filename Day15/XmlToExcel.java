package Day15;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
public class XmlToExcel {
public static void main(String[] args) {
	
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
    catch (SAXParseException err) 
    {
        System.out.println("** Parsing error" + ", line "+ err.getLineNumber() + ", uri " + err.getSystemId());
        System.out.println(" " + err.getMessage());
    } 
    catch (SAXException e) 
    {
        Exception x = e.getException();
        ((x == null) ? e : x).printStackTrace();
    } 
    catch (Throwable t) 
    {
        t.printStackTrace();
    }
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Sample sheet");

    Map<String, Object[]> data = new HashMap<String, Object[]>();
    for(int i=0;i<sno.size();i++)
    {
        data.put(i+"",new Object[]{sno.get(i),itemname.get(i),quantity.get(i),unit.get(i),price.get(i),});
    }
    Set<String> keyset = data.keySet();
    int rownum = 0;
    for (String key : keyset) {
        Row row = sheet.createRow(rownum++);
        Object[] objArr = data.get(key);
        int cellnum = 0;
        for (Object obj : objArr) {
            Cell cell = row.createCell(cellnum++);
            if (obj instanceof Date)
                cell.setCellValue((Date) obj);
            else if (obj instanceof Boolean)
                cell.setCellValue((Boolean) obj);
            else if (obj instanceof String)
                cell.setCellValue((String) obj);
            else if (obj instanceof Double)
                cell.setCellValue((Double) obj);
        }
    }
    try {
        FileOutputStream out = new FileOutputStream(new File("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\ey\\\\src\\\\consumerbill.xls"));
        workbook.write(out);
        out.close();
        System.out.println("Excel written successfully..");

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}}