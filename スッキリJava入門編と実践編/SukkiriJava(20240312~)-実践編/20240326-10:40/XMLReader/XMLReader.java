package XMLReader;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;;

public class XMLReader {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		InputStream is = new FileInputStream("./20240326-10:40/XMLReader/rpgsave.xml");
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
	    Element hero = doc.getDocumentElement();            // (2)
	    Element weapon = findChildByTag(hero, "weapon");    // (3)
	    System.out.println(weapon);
	    Element power = findChildByTag(weapon, "power");    // (4)
	    System.out.println(power);
	    String value = power.getTextContent();
	    System.out.println(value);// (5)
	}
	
	static Element findChildByTag(Element self, String name) throws Exception{
		NodeList children = self.getChildNodes();
		for(int i = 0; i < children.getLength(); i++) {
			if(children.item(i) instanceof Element) {
				Element e = (Element)children.item(i);
				if(e.getTagName().equals(name)) {
					return e;
				}
			}
		}
		return null;
	}

}
