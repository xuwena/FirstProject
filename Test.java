package com.mxdx.chlm;
import java.util.Scanner;
	//����
public class Test extends DinCanSystem {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Operation dc = new Operation();
		dc.name[0] = "������";
		dc.canPin[0] = dc.cpName[0];
		dc.fenShu[0] = 2;
		dc.time[0] = 12;
		dc.adress[0] = "��ҵ·8��";
		dc.Price[0] = dc.cpPrice[0];
		dc.state[0] = 0;
		dc.numPrice[0] = dc.fenShu[0]*dc.cpPrice[0];
		
		dc.name[1] = "����";
		dc.canPin[1] = dc.cpName[2];
		dc.fenShu[1] = 2;
		dc.time[1] = 13;
		dc.adress[1] = "����·6��";
		dc.Price[1] = dc.cpPrice[2];
		dc.state[1] = 1;
		dc.numPrice[1] = dc.fenShu[1]*dc.cpPrice[2];
		int xuHao = -1;
		do{
			System.out.println("\t��ӭʹ�óԻ����˶���ϵͳ");
			System.out.println("****************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ɾ������");
			System.out.println("4.ǩ�ն���");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("****************************");
			System.out.println("��ѡ��");
			
			xuHao = input.nextInt();
			switch(xuHao){
			case 1:
				dc.dinCan();
				break;
			case 2:
				dc.canDai();
				break;
			case 3:
				dc.sanChu();
				break;
			case 4:
				dc.qianShou();
				break;
			case 5:
				dc.dianZhan();
				break;
			case 6:
				dc.tuiChu();
				break;
			default:
				System.out.println("��������");
				break;
			}
			if(xuHao==6){
			break;
			}else{
				System.out.println("����0���أ�");
				xuHao = input.nextInt();
			}
		}while(xuHao==0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
		
	}
}
