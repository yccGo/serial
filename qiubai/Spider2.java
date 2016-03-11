package cn.edu.cust.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Spider2 {
	public static String keyword = null;
	public static int current = 1;

	public static void savePageImgs(int pageNum, String keyword) {
		String url = "http://www.qiubaichengren.com/gif/list_" + pageNum + ".html";
		// String url =
		// "http://image.baidu.com/search/index?tn=baiduimage&ps=1&ct=201326592&lm=-1&cl=2&nc=1&ie=utf-8&word="
		// + URLEncoder.encode(keyword);
		// String url =
		// "http://image.baidu.com/search/index?tn=baiduimage&ps=1&ct=201326592&lm=-1&cl=2&nc=1&ie=utf-8&word="
		// + keyword;
		// doc = Jsoup.connect(url).ignoreContentType(true).get();
		Document doc;
		try {
			doc = Jsoup.connect(url).timeout(3000)
					.userAgent(
							"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.64 Safari/537.31")
					.get();
			System.out.println(doc);
			Elements imgEles = doc.select("img");
			for (Element ele : imgEles) {
				String imgSrc = ele.attr("src");
				System.out.println(imgSrc);
				String suffix = imgSrc.substring(imgSrc.lastIndexOf("."));
				// System.out.println(suffix);
				if (suffix.equals(".gif") && imgSrc.contains("http")) {
					URL imgUrl = new URL(imgSrc);
					URLConnection conn = imgUrl.openConnection();
					InputStream in = conn.getInputStream();
					File imgDir = new File("E:/test/" + keyword + "/");
					if (!imgDir.exists()) {
						imgDir.mkdir();
					}
					File imgFile = new File(imgDir.getAbsolutePath() + "/" + UUID.randomUUID() + suffix);
					OutputStream out = new FileOutputStream(imgFile);
					byte[] buffer = new byte[1024];
					int len = -1;
					while ((len = in.read(buffer)) != -1) {
						out.write(buffer, 0, len);
					}
					out.close();
					in.close();
				}
			}
			System.out.println("第" + pageNum + "页");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void saveAllImgs(int currentPageNum) {
		for (int i = currentPageNum; i <= 20; i++) {
			try {
				Spider2.savePageImgs(currentPageNum, keyword);
			} catch (Exception e) {
			}
			current = currentPageNum;
		}
	}

	public static void main(String[] args) {
		/*
		 * String code = "%E9%AB%98%E6%B8%85%E6%91%84%E5%BD%B1"; String code2 =
		 * null; try { code2 = URLDecoder.decode(code,"utf-8"); } catch
		 * (UnsupportedEncodingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } System.out.println(code2);
		 */
		// String url = "http://www.qiushibaike.com/pic";
		String keyword = null;// Ŀ¼��
		int pageNum = 1;// ҳ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入目录名：");
		try {
			keyword = br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("IO异常");
			e1.printStackTrace();
		}
		// Spider2.keyword = keyword;
		// Spider2.saveAllImgs(currentPageNum);
		for (; pageNum <= 50; pageNum++) {
			String url = "http://www.qiubaichengren.com/gif/list_" + pageNum + ".html";
			// String url =
			// "http://image.baidu.com/search/index?tn=baiduimage&ps=1&ct=201326592&lm=-1&cl=2&nc=1&ie=utf-8&word="
			// + URLEncoder.encode(keyword);
			// String url =
			// "http://image.baidu.com/search/index?tn=baiduimage&ps=1&ct=201326592&lm=-1&cl=2&nc=1&ie=utf-8&word="
			// + keyword;
			// doc = Jsoup.connect(url).ignoreContentType(true).get();
			Document doc;
			try {
				doc = Jsoup.connect(url).timeout(3000)
						.userAgent(
								"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.64 Safari/537.31")
						.get();
				System.out.println(doc);
				Elements imgEles = doc.select("img");
				for (Element ele : imgEles) {
					String imgSrc = ele.attr("src");
					System.out.println(imgSrc);
					String suffix = imgSrc.substring(imgSrc.lastIndexOf("."));
					// System.out.println(suffix);
					if (suffix.equals(".gif") && imgSrc.contains("http")) {// 获取gif图片
						URL imgUrl = new URL(imgSrc);
						URLConnection conn = imgUrl.openConnection();
						InputStream in = conn.getInputStream();
						File imgDir = new File("E:/test/" + keyword + "/");
						if (!imgDir.exists()) {
							imgDir.mkdir();
						}
						File imgFile = new File(imgDir.getAbsolutePath() + "/" + UUID.randomUUID() + suffix);
						OutputStream out = new FileOutputStream(imgFile);
						byte[] buffer = new byte[1024];
						int len = -1;
						while ((len = in.read(buffer)) != -1) {
							out.write(buffer, 0, len);
						}
						out.close();
						in.close();

					}
				}
				System.out.println("***************************");
				System.out.println("第 " + pageNum + " 页下载成功");
				System.out.println("***************************");
			} catch (Exception e) {
				System.out.println("exception");
				pageNum = pageNum - 1;
				continue;
			}
		}
	}
}