package ch02.templateEx;

public class TemplateMethodMain {

	public static void main(String[] args) {
		Report report = new Report();
		report.createDocument();
		System.out.println("===============");
		NewsArticle news = new NewsArticle();
		news.createDocument();
	}
}