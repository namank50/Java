package Eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eight {
	
	public void print(List<Integer> list) {
		
		for(Integer key:list)
			System.out.println(key);
	}

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(8);
		list.add(7);
		list.add(5);
		list.add(1);
		list.add(0);
		list.add(56);
		list.add(8);
		
		eight Eight =  new eight();
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Eight.print(list);
			}
		});
		
		t1.start();
	}
}
