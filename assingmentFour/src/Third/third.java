package Third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class third {

	public static void main(String[] args) {
		
		List <Person> person = new ArrayList<>();
		person.add(new Person("Rahul","Dua",29));
		person.add(new Person("Mirdul","Garg",42));
		person.add(new Person("Himanshi","Khurana",49));
		person.add(new Person("Muskan","Tomar",19));
		person.add(new Person("Simran","Pal",29));
		person.add(new Person("Anuj","Giri",39));
		
		printConditionaly(person,p->p.getLname().startsWith("G"),p->System.out.println(p));
		
		}
	
	private static void printConditionaly(List<Person> person,Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person p:person)
		{
			if(predicate.test(p)) {
				consumer.accept(p);
			}
			
		}
	}

}
