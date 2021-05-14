package Third;

import java.util.function.Supplier;

public class third2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> randomValue = ()->Math.random();
		System.out.println(randomValue.get());

	}

}
