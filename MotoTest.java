package cn.com.vehicle.lease;

import java.util.Scanner;

public class MotoTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleOperation operation = new VehicleOperation();
		operation.init();
		System.out.println("*********欢迎光临汽车租赁公司*********");
		String brand = "";//品牌
		String model = "";//型号
		int seat = 0;//座位数
		//收集用户条件
		System.out.println("1. 轿车\t2. 客车");
		System.out.println("请输入你要租赁的汽车类型：");
		int motos = input.nextInt();
		if(motos ==1){
			System.out.println("1. 别克 \t2. 宝马");
			System.out.println("请输入你要租赁的汽车品牌");
			int brands = input.nextInt();
			if(brands==1){
				brand = "别克";
				System.out.println("请输入你要租赁的汽车型号：1. 林荫大道\t2. GL8");
				int models = input.nextInt();
				 model = (models==1)?"林荫大道":"GL8";
			}else if(brands==2){
				brand = "宝马";
				System.out.println("请输入你要租赁的汽车型号：1. X6 \t2. 550i");
				int models = input.nextInt();
				 model = (models==1)?"X6":"550i";
			}
		}else if(motos==2){
			System.out.println("1. 金杯 \t2. 金龙");
			System.out.println("请输入你要租赁的汽车品牌");
			int brands = input.nextInt();
			brand = (brands==1)?"金杯":"金龙";
				System.out.println("请输入你要租赁的汽车需要的座位数量：1. 16座 \t2. 34座");
				int seats = input.nextInt();
				seat = (seats==1)?16:34;
			
		}
	//租车
		Vehicle moto = operation.vehicleLease(brand, model, seat);
		System.out.println("请输入租赁天数：");
		int days = input.nextInt();
		float money = moto.numPrice(days);
		System.out.println("租车成功，请按如下车牌取车："+moto.getVehicleID());
		System.out.println("您需支付"+money+"元");
	}
}
