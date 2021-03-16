package Day16;
import java.io.FileOutputStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;

public class xmlToPdf {
public static void main(String[] args) throws Exception {
	Document doc=new Document();
	try
	{
		PdfWriter pwriter=PdfWriter.getInstance(doc,new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\ey\\src\\Day16\\grocerybill.pdf"));
	doc.open();
//	doc.add(new Paragraph("welcome learners"));
	PdfPTable table=new PdfPTable(5);
	table.addCell(new Paragraph("ssno"));
	table.addCell(new Paragraph("itemname"));
	table.addCell(new Paragraph("quantity"));
	table.addCell(new Paragraph("unit"));
	table.addCell(new Paragraph("prrice"));
	
	readxml rx=new readxml();
	Map<String, Object[]> data=rx.read();
	Set<String> keyset = data.keySet();

	for (String key : keyset) {
	    Object[] objArr = data.get(key);
	    for (Object obj : objArr) {
	       	if(obj instanceof String) 
	       		table.addCell(new Paragraph((String)obj));
		else if(obj instanceof Integer)
			table.addCell(new Paragraph((Integer)obj));
		else
			table.addCell(new Paragraph((Float)obj));
	    }}
	doc.add(table);

	doc.close();
	pwriter.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	}
}



