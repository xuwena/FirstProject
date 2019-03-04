package cn.com.vehicle.lease;
//车辆业务操作类
public class VehicleOperation {
	public Vehicle[] vehicle = new Vehicle[8];
	
//初始化车辆信息
	public void init(){
		vehicle[0]=new Car("宝马",800,"京NY28588","X6");
		vehicle[1]=new Car("宝马",600,"京	CNY3284","550i");
		vehicle[2]=new Car("别克",300,"京NT37465","林荫大道");
		vehicle[3]=new Car("别克",600,"京NT96968","GL8");
		vehicle[4]=new Bus("金杯",800,"京6566754",16);
		vehicle[5]=new Bus("金杯",1500,"京9696996",34);
		vehicle[6]=new Bus("金龙",800,"京8696997",16);
		vehicle[7]=new Bus("金龙",1500,"京8696998",34);
	}
	
//租车
	public Vehicle vehicleLease(String brand,String model,int seatNumb){
		Vehicle moto = null;
		for(Vehicle vehicles:vehicle){
			if(vehicles instanceof Car){
				Car car = (Car)vehicles;
				if(car.getBrand().equals(brand) && car.getModel().equals(model)){
					moto = car;
					break;
				}
			}else{
				Bus bus = (Bus)vehicles;
				if(bus.getBrand().equals(brand) && bus.getSeatNumb()==seatNumb){
					moto = bus;
					break;
				}
			}
		}
		return moto;
	}
}
