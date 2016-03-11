package cn.edu.cust.demo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupDemo {
	public static void main(String[] args) {
		// String html = "<html><head><title>first parse</title></head>"+
		// "<body><p>hello</p></body></html>";

		Document doc = null;
		int count = 0;
		while(true){
			count++;
		try {
			doc = Jsoup.connect("http://www.cba.gov.cn/cbastats/default.aspx").get();
			//doc = Jsoup.connect("http://www.weather.com.cn/data/sk/101010100.html").get();
			//doc = Jsoup.connect("http://www.qiushibaike.info/page").post();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//System.out.println(doc.html());
		doc.select("a[href]").remove();
		//doc.select("font").remove();
		Elements eles = doc.getElementsByAttributeValue("id", "cba_live_DataGrid1");
		
		Elements subEles = eles.select("tr[align]");
		subEles.removeAttr("align");
		System.out.println("------------" + count + "--------------------");
		for(Element ele : subEles){
			System.out.println("");
			ele.select("td").removeAttr("width");
			ele.select("td").removeAttr("height");
			ele.select("td").last().remove();
			//System.out.println(ele);
			Elements tdEles = ele.select("td");
			System.out.println(tdEles.first().text() + " " + tdEles.get(1).child(0).text() + " " + tdEles.last().text());
			System.out.println();
		}
		System.out.println("----------------------------------");
		// Jsoup.parse(html);
		/*
		Elements eles = doc.getAllElements();
		Iterator<Element> it = eles.iterator();
		while (it.hasNext()) {
			System.out.println("--------------");
			Element ele = it.next();
			System.out.println(ele.nodeName() + " " + ele.tagName() + " "
					+ ele.text());
			System.out.println(ele);
			System.out.println("--------------");
		}
		System.out.println(doc.location());
		System.out.println(doc.title());
		System.out.println(doc.body());
		Sytem.out.println(doc.head());
		*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
