package cn.com.vehicle.lease;
//½Î³µÀà
public class Car extends Vehicle {
	String model; //ÐÍºÅ
	
	public Car(String brand, int dayPrice, String vehicleID,String model) {
		super(brand,dayPrice,vehicleID);
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public float numPrice(int days) {
		float price = this.getDayPrice()*days;
		if(days>7 && days<30){
			price = price*0.9f;
		}else if(days>30 && days<150){
			price = price*0.8f;
		}else if(days>150){
			price = price*0.7f;
		}
		return price;
	}

}
