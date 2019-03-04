package cn.com.vehicle.lease;
//�����ࣨ���ࣩ
public abstract class Vehicle {
	private String brand;   //Ʒ��
	private int dayPrice;   //�����
	private String vehicleID;   //����
	
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
	//�����������
	public abstract float numPrice(int days);
	
}
