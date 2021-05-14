package Fifth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import assingmentFifth.News;

public class fifth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		News news1 = new News(123,"Naman","Raj","International");
		News news2 = new News(321,"Aman","Ram","Budget");
		News news3 = new News(215,"Kamal","Vipin","Sports");
		News news4 = new News(128,"Himanshu","Vinod","Budget");
		News news5 = new News(123,"Deepika","Vinita","Finance");
		
		List <News> news = new ArrayList<News>();
		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		news.add(news5);
		
		
		long count=news.stream().filter(n->n.getComment().matches("Budget")).count();
		
		System.out.println("Number of times Budget appeared in the Comments " +count);
	}

}
