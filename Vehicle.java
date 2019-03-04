package cn.com.vehicle.lease;
//车辆类（父类）
public abstract class Vehicle {
	private String brand;   //品牌
	private int dayPrice;   //日租金
	private String vehicleID;   //车牌
	
	public Vehicle() {
	}
	public Vehicle(String brand, int dayPrice, String vehicleID) {
		this.brand = brand;
		this.dayPrice = dayPrice;
		this.vehicleID = vehicleID;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getDayPrice() {
		return dayPrice;
	}
	public void setDayPrice(int dayPrice) {
		this.dayPrice = dayPrice;
	}
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	//计算汽车租金
	public abstract float numPrice(int days);
	
}
