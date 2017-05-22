package controler;

import model.TEI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by fstiegle on 20.05.2017.
 */
public class FFFToTEIConverter
{

    private TEI XMLTEIDocument;

    public FFFToTEIConverter() throws Exception{
        XMLTEIDocument = new TEI();
    }


    public String startConversion(File fffSourceFile) throws IOException {

        //Einlesen des Files Zeichen für Zeichen
        String currWindow;
        boolean opendedTag = false;

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fffSourceFile),
                        Charset.forName("UTF-8")));
        int c;
        while((c = reader.read()) != -1) {
            char currChar = (char) c;

            //Tag opened
            if(currChar == '<') {
                opendedTag = true;
            }
        }
        return "";
    }

    public void startConversion(File fffSourceFile, File xmlDestFile) {
    }

    public String startConversion(String fffSourceString) {
        return "";
    }
}
