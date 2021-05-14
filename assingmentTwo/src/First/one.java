package First;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x = Singleton.getInstance();
		Singleton y= Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		x.s=(x.s).toLowerCase();
		System.out.println("String from x is "+ x.s);
		System.out.println("String from y is "+ y.s);
		System.out.println("String from z is "+ z.s);


	}

}
