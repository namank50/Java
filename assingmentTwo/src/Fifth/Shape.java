package Fifth;

public abstract class Shape{
	String shapeName;
	
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	abstract public void draw();
	

}
