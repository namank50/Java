package Seventh;

public class Parked_CarOwner_Details {
	String ownerName;
	String carModel;
	String carNo;
	Long OwnerMobileNo;

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", OwnerMobileNo=" + OwnerMobileNo + ", Address=" + Address + "]";
	}

	String Address;

	public Parked_CarOwner_Details(String ownerName, String carModel, String carNo, Long ownerMobileNo,
			String address) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		OwnerMobileNo = ownerMobileNo;
		Address = address;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public Long getOwnerMobileNo() {
		return OwnerMobileNo;
	}

	public void setOwnerMobileNo(Long ownerMobileNo) {
		OwnerMobileNo = ownerMobileNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
