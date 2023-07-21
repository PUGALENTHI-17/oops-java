import java.util.*;
import org.apache.Solr.client.Solrj.SolrClient; 
import org.apache.Solr.client.Solrj.SolrServerException; 
import org.apache.Solr.client.Solrj.impl.HttpSolrClient; 
import org.apache.Solr.common.SolrInputDocument; 

class Solr { 
   public static void main(String args[]) throws Exception { 
      //Preparing the Solr client 
      String urlString = "http://localhost:8983/Solr/my_core"; 
      SolrClient Solr = new HttpSolrClient.Builder(urlString).build();   
      
      //Preparing the Solr document 
      SolrInputDocument doc = new SolrInputDocument(); 
   
      //Adding fields to the document 
      doc.addField("id", "003"); 
      doc.addField("name", "Rajaman"); 
      doc.addField("age","34"); 
      doc.addField("addr","vishakapatnam"); 
         
      //Adding the document to Solr 
      Solr.add(doc);         
         
      //Saving the changes 
      Solr.commit(); 
      System.out.println("Documents added"); 
   } 
}