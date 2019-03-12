package com.chihuo.lianmeng;
import java.util.Scanner;
public class ChiHuoLianMeng {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//数据主体一组订单信息：订餐人，所定餐品信息，送餐时间，送餐地址，总金额，订单状态
		String[] name = new String[4];  //订餐人
		String[] canPin = new String[4]; //所定餐品信息
		int[] time = new int[4];  //10:00-20:00
		String[] adress = new String[4]; 
		double[] numPrice = new double[4];
		int[] state = new int[4]; //0：已预订  1：已签收
		String[] pinJia = new String[4]; //订单评价
		//数据主体，一组餐品信息
		String[] cpName = {"鱼香肉丝","红烧茄子","水煮肉片"};
		int[] cpPrice = {16,12,18};
		int[] dianZhan = new int[3];
		//初始化两条订单信息
		name[0] = "吴彦祖";
		canPin[0] = "2份鱼香肉丝";
		time[0] = 12;
		adress[0] = "创业路8号";
		numPrice[0] = 32;
		state[0] = 0;
		
		name[1] = "黎明";
		canPin[1] = "3份水煮肉片";
		time[1] = 13;
		adress[1] = "留仙路6号";
		numPrice[1] = 54;
		state[1] = 1;
		//xuHao:菜单序号      fenShu：点餐份数      bianHao:所点餐品编号
		int xuHao = -1,  fenShu = 0,  bianHao = 0;
		String names = "";
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
			do{
				if(input.hasNextInt()){
					break;
				}else{
					input.next();
					System.out.println("请输入1~6之间的整数：");
				}
			}while(true);           //判断输入是否为整型
			xuHao = input.nextInt();
			while(xuHao<1 || xuHao>6){
				System.out.println("请输入1~6之间的整数：");
				xuHao = input.nextInt();
			}
			 boolean weiZhi = false;//  餐袋是否有空位置
			switch(xuHao){
			case 1:
				System.out.println("******我要订餐******");
				for(int i=0;i<name.length;i++){
					if(name[i]==null){
						weiZhi = true;
					//可供选择餐品信息
					System.out.println("序号\t菜名\t单价\t点赞数");
						for(int j=0;j<cpName.length;j++){
							System.out.println((j+1)+"\t"+cpName[j]+"\t"+cpPrice[j]+"元\t"+dianZhan[j]+"赞");
						}
						System.out.println("请选择你要点的菜品序号：");
							do{
								if(input.hasNextInt()){
									break;
								}else{
									input.next();
									System.out.println("请输入1~3之间的整数：");
								}
							}while(true); 
							bianHao = input.nextInt();
							while(bianHao>3 || bianHao<1){
							System.out.println("你输入的菜品序号不存在，请重新输入");
							bianHao = input.nextInt();
							}
						System.out.println("请选择你需要的份数：");
						do{
							if(input.hasNextInt()){
								break;
							}else{
								input.next();
								System.out.println("请输入小于10的正整数：");
							}
						}while(true); 
						fenShu = input.nextInt();
						while(fenShu>=10 || fenShu<=0){
							System.out.println("每件单品最多购选10份,请重新输入：");
							fenShu = input.nextInt();
						}
						System.out.println("请输入订餐人姓名：");
						do{
							if(input.hasNextInt()){
								input.next();
								System.out.println("姓名输入不能为数字，请重新输入：");
							}else{
								break;
							}
						}while(true);
						names = input.next();
						System.out.println("请输入送餐时间（送餐时间为10点至20点间整点送餐）：");
						do{
							if(input.hasNextInt()){
								break;
							}else{
								input.next();
								System.out.println("请输入10~20之间的整数：");
							}
						}while(true); 
						int times = input.nextInt();
						while(times<10 || times>20){
							System.out.println("你输入的时间不在配送时间内，请重新输入：");
							times = input.nextInt();
						}
						System.out.println("请输入送餐地址：");
						String diZhi = input.next();
						//计算金额
						double Prices = cpPrice[bianHao-1]*fenShu;
						double scFei = Prices>50?0:6;
						double numPrices = Prices+scFei;
						//订餐成功显示
						System.out.println("订餐成功！");
						System.out.println("你订的是"+fenShu+"份"+cpName[bianHao-1]);
						System.out.println("订餐人："+names);
						System.out.println("送餐时间："+times);
						System.out.println("送餐地址："+diZhi);
						System.out.println("餐费："+Prices+"元，送餐费："+scFei+"元");
						System.out.println("总金额"+numPrices+"元！");
						//保存数据
						name[i] = names;
						canPin[i] = fenShu+"份"+cpName[bianHao-1];
						time[i] = times;
						adress[i] = diZhi;
						numPrice[i] = numPrices;
						break;
					}
				}
				if(!weiZhi){
						System.out.println("你的餐袋已满！");
				}
				break;
			case 2:
				System.out.println("******查看餐袋******");
				System.out.println("序号\t订餐人\t所订餐品信息\t送餐时间\t送餐地址\t\t总金额\t状态");
					for(int i=0;i<name.length;i++){
						if(name[i]!=null){
							String states = state[i]==0?"已预订":"已签收";
							System.out.println((i+1)+"\t"+name[i]+"\t"+canPin[i]+"\t"+time[i]+"\t"+adress[i]+"\t\t"+numPrice[i]+"元\t"+states);
						}
					}
				break;
			case 3:
				System.out.println("******删除订单******");
				System.out.println("请选择你要删除的订单序号：");
				do{
					if(input.hasNextInt()){
						break;
					}else{
						input.next();
						System.out.println("请输入1~4之间的整数：");
					}
				}while(true); 
				int sanChu = input.nextInt();
				if(sanChu>=1 && sanChu<=4 && name[sanChu-1]!=null){
					if(state[sanChu-1]==0){
						System.out.println("你选择的订单未签收，暂时不能删除该订单！");
					}else if(state[sanChu-1]==1){
						//删除前3条中的一条订单
						for(int i=sanChu-1;i<name.length-1;i++){
							name[i] = name[i+1];
							canPin[i] = canPin[i+1];
							time[i] = time[i+1];
							adress[i] = adress[i+1];
							numPrice[i] = numPrice[i+1];
							state[i] = state[i+1];
						}
						//把第四条订单清空，保证第四条订单的删除
							name[name.length-1] = null;
							canPin[canPin.length-1] = null;
							time[time.length-1] = 0;
							adress[adress.length-1] = null;
							numPrice[numPrice.length-1] = 0;
							state[state.length-1] = 0;
						System.out.println("订单删除成功！");
					}
				}else{
					System.out.println("此订单不存在，系统未找到该订单");
				}
				break;
			case 4:
				System.out.println("******签收订单******");
				System.out.println("请选择你要签收的订单序号：");
				do{
					if(input.hasNextInt()){
						break;
					}else{
						input.next();
						System.out.println("请输入1~4之间的整数：");
					}
				}while(true); 
				int qianShou = input.nextInt();
				if(qianShou>=1 && qianShou<=4 && name[qianShou-1]!=null){
					if(state[qianShou-1]==0){
						state[qianShou-1] = 1;
						System.out.println("签收完成！");
					}else{
						System.out.println("你选择的订单已签收，不能再次签收！");
					}
				}else{
					System.out.println("此订单不存在,系统未找到该订单！");
				}
				break;
			case 5:
				System.out.println("******我要点赞******");
				if(bianHao!=0){
					System.out.println("序号\t餐品名\t单价\t点赞数");
					for(int i=0;i<cpName.length;i++){
						System.out.println((i+1)+"\t"+cpName[i]+"\t"+cpPrice[i]+"元\t"+dianZhan[i]+"赞");
					}
					System.out.println("请输入你的订单序号：");
					do{
						if(input.hasNextInt()){
							break;
						}else{
							input.next();
							System.out.println("请输入1~4之间的整数：");
						}
					}while(true); 
					int dindan = input.nextInt();
					if(name[dindan-1]!=null){
						if(!(name[dindan-1].equals("吴彦祖")) && !(name[dindan-1].equals("黎明"))){
							if(state[dindan-1]==1){
								if(pinJia[dindan-1]==null){
									System.out.println("你订的是"+fenShu+"份"+cpName[bianHao-1]);
									System.out.println("是否确认进行点赞(y/n):");
									String or = input.next();
									if(or.equals("y")){
										dianZhan[bianHao-1]++;
										System.out.println("点赞成功！");
										System.out.println("请你对此订单进行评价：(1. 好评\t2. 中评\t3. 差评)");
										pinJia[dindan-1] = input.next();
										System.out.println("评价成功！");
									}else{
										break;
									}
								}else{
									System.out.println("此订单已评价，不能再次点赞！");
								}
							}else{
								System.out.println("此订单未签收，不能进行点赞！");
							}
						}else{
							System.out.println("默认订单不能进行点赞！");
						}
					}else{
						System.out.println("此订单不存在，系统未找到该订单！");
					}
				}else{
					System.out.println("你还未进行点餐不能进行点赞！");
				}
				break;
			case 6:
				System.out.println("******退出系统******");
				break;
			default :
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
