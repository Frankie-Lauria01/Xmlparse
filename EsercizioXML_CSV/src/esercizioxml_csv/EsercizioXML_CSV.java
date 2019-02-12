/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizioxml_csv;

import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author lauria_francesco
 */
public class EsercizioXML_CSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<NodeList> tabella = null;
        Parser dom = new Parser();
        MyFile file = new MyFile();
        try {
            tabella = dom.parseDocument("sportello.xml");
            String CSV = dom.ArraytoCSVMIO(tabella);
           
            file.Sovrascrivi("sportelli.csv", CSV);
            
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore");
        }
   }
    
}
