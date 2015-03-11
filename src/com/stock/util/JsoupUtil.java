package com.stock.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupUtil {

	public static Document GetDocument(String url) {
		boolean flag = true;
		Document doc=null;
		int count=0;
		while (flag) {
			try {
				doc=Jsoup.connect(url).get();
				flag=false;
			} catch (Exception ex) {
				doc=null;
				flag=true;
				System.out.println("111111111111111111111");
				System.out.println(ex.getMessage());
				try {
					flag=false;
					System.out.println(ex.getMessage()+":"+url);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
			}
		}
		return doc;
	}

}
