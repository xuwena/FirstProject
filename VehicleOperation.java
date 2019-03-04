package cn.com.vehicle.lease;
//����ҵ�������
public class VehicleOperation {
	public Vehicle[] vehicle = new Vehicle[8];
	
//��ʼ��������Ϣ
	public void init(){
		vehicle[0]=new Car("����",800,"��NY28588","X6");
		vehicle[1]=new Car("����",600,"��	CNY3284","550i");
		vehicle[2]=new Car("���",300,"��NT37465","������");
		vehicle[3]=new Car("���",600,"��NT96968","GL8");
		vehicle[4]=new Bus("��",800,"��6566754",16);
		vehicle[5]=new Bus("��",1500,"��9696996",34);
		vehicle[6]=new Bus("����",800,"��8696997",16);
		vehicle[7]=new Bus("����",1500,"��8696998",34);
	}
	
//�⳵
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
