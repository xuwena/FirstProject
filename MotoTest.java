package cn.com.vehicle.lease;

import java.util.Scanner;

public class MotoTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VehicleOperation operation = new VehicleOperation();
		operation.init();
		System.out.println("*********��ӭ�����������޹�˾*********");
		String brand = "";//Ʒ��
		String model = "";//�ͺ�
		int seat = 0;//��λ��
		//�ռ��û�����
		System.out.println("1. �γ�\t2. �ͳ�");
		System.out.println("��������Ҫ���޵��������ͣ�");
		int motos = input.nextInt();
		if(motos ==1){
			System.out.println("1. ��� \t2. ����");
			System.out.println("��������Ҫ���޵�����Ʒ��");
			int brands = input.nextInt();
			if(brands==1){
				brand = "���";
				System.out.println("��������Ҫ���޵������ͺţ�1. ������\t2. GL8");
				int models = input.nextInt();
				 model = (models==1)?"������":"GL8";
			}else if(brands==2){
				brand = "����";
				System.out.println("��������Ҫ���޵������ͺţ�1. X6 \t2. 550i");
				int models = input.nextInt();
				 model = (models==1)?"X6":"550i";
			}
		}else if(motos==2){
			System.out.println("1. �� \t2. ����");
			System.out.println("��������Ҫ���޵�����Ʒ��");
			int brands = input.nextInt();
			brand = (brands==1)?"��":"����";
				System.out.println("��������Ҫ���޵�������Ҫ����λ������1. 16�� \t2. 34��");
				int seats = input.nextInt();
				seat = (seats==1)?16:34;
			
		}
	//�⳵
		Vehicle moto = operation.vehicleLease(brand, model, seat);
		System.out.println("����������������");
		int days = input.nextInt();
		float money = moto.numPrice(days);
		System.out.println("�⳵�ɹ����밴���³���ȡ����"+moto.getVehicleID());
		System.out.println("����֧��"+money+"Ԫ");
	}
}
