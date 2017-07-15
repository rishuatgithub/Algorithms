package com.demo.jsoup.crawl;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseCoursera {

	public static void main(String[] args) {
		
		String url="https://www.coursera.org/browse/data-science";
		
		try {
			Document parseURL = Jsoup.connect(url).get();
			
			//String ele = parseURL.title();
			//System.out.println("The title of the Course:");
			//System.out.println(ele);
			
			Elements el=parseURL.getElementsByTag("script");
			/*Elements scp = parseURL.select("script");
			
			//System.out.println(scp);
			
			
			for (Element ce : scp) {
				Pattern p = Pattern.compile("(?is)window.App=\\(.\\)");
				Matcher m = p.matcher(ce.html());
				while(m.find())
				{
				   System.out.println(m.group());
				}
			}*/
			for (Element element : el) {
				for (DataNode node : element.dataNodes()) {
					//System.out.println(node.attributes());
					//System.out.println(node.setWholeData("window.App="));
					//System.out.println(node.getWholeData().contains("window.App="));
					//System.out.println(node.hasAttr("window.App="));
					
					if(node.getWholeData().contains("window.App=")) {
						System.out.println(node.getWholeData().indexOf("window.appName"));
						System.out.println(node.getWholeData().substring(0,131703));
					}
						 
				}
				System.out.println("-------------------");  
			}
			
			
		} catch (IOException e) {
			System.out.printf("Exception Thrown:");
			e.printStackTrace();
		}
		
	}
}
