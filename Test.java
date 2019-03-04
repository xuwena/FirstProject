package com.mxdx.chlm;
import java.util.Scanner;
	//测试
public class Test extends DinCanSystem {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Operation dc = new Operation();
		dc.name[0] = "吴彦祖";
		dc.canPin[0] = dc.cpName[0];
		dc.fenShu[0] = 2;
		dc.time[0] = 12;
		dc.adress[0] = "创业路8号";
		dc.Price[0] = dc.cpPrice[0];
		dc.state[0] = 0;
		dc.numPrice[0] = dc.fenShu[0]*dc.cpPrice[0];
		
		dc.name[1] = "黎明";
		dc.canPin[1] = dc.cpName[2];
		dc.fenShu[1] = 2;
		dc.time[1] = 13;
		dc.adress[1] = "留仙路6号";
		dc.Price[1] = dc.cpPrice[2];
		dc.state[1] = 1;
		dc.numPrice[1] = dc.fenShu[1]*dc.cpPrice[2];
		int xuHao = -1;
		do{
			System.out.println("\t欢迎使用吃货联盟订餐系统");
			System.out.println("****************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.删除订单");
			System.out.println("4.签收订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("****************************");
			System.out.println("请选择：");
			
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
				System.out.println("输入有误！");
				break;
			}
			if(xuHao==6){
			break;
			}else{
				System.out.println("输入0返回：");
				xuHao = input.nextInt();
			}
		}while(xuHao==0);
		System.out.println("谢谢使用，欢迎下次光临！");
		
	}
}
