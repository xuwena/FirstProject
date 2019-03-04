package cn.com.vehicle.lease;
//¿Í³µÀà
public class Bus extends Vehicle {
	int seatNumb;
	
	public Bus(String brand, int dayPrice, String vehicleID,int seatNumb) {
		super(brand,dayPrice,vehicleID);
		this.seatNumb = seatNumb;
	}

	public int getSeatNumb() {
		return seatNumb;
	}

	public void setSeatNumb(int seatNumb) {
		this.seatNumb = seatNumb;
	}

	public float numPrice(int days) {
		float price = this.getDayPrice()*days;
		if(days>=3 && days<7){
			price = price*0.9f;
		}else if(days>=7 && days<30){
			price = price*0.8f;
		}else if(days>=30 && days<150){
			price = price*0.7f;
		}else if(days>=150){
			price = price*0.6f;
		}
		return price;
	}
}
