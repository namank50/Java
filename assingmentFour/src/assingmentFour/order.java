package assingmentFour;

public class order {
	Integer price;
	String status;
	public order(Integer price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public Integer getPrice() {
		return price;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order price is "+price+" status is "+status;
	}
	
	
}
