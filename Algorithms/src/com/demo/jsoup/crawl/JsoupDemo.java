package com.demo.jsoup.crawl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupDemo {
	
	public static void main(String[] args) {
		

		String html = "<html><head><title>First parse</title></head>"
				  + "<body><p>Parsed HTML into a doc.</p></body></html>";
		Document doc = Jsoup.parse(html);
		System.out.println("---------------------------");
		System.out.println(doc);
	
		Document parseBodydoc = Jsoup.parseBodyFragment(html);
		Element body=parseBodydoc.body();
		System.out.println("---------------------------");
		System.out.println(body);
		
		String url = "https://anotherreeshu.wordpress.com/";
		try {
			Document parseURL = Jsoup.connect(url).get();
			String title=parseURL.title();
			System.out.println("------------------------");
			System.out.println(title);
			
			System.out.println("-------------------------");
			Elements ele=parseURL.select("article header h1");
			
			//System.out.println(ele);
			
			for (Element element : ele) {
				System.out.println(element.text());
				System.out.println(element.data());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
