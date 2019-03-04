package com.mxdx.chlm;
import java.util.Scanner;
//订餐业务类
public class Operation extends DinCanSystem implements CaiDan {
	Scanner input = new Scanner(System.in);
	boolean weiZhi = false;
	
	public void dinCan(){
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
					int bianHao = input.nextInt();
					while(bianHao>6 || bianHao<1){
					System.out.println("你输入的菜品序号不存在，请重新输入");
					bianHao = input.nextInt();
					}
					System.out.println("请选择你需要的份数：");
					int fenS = input.nextInt();
					System.out.println("请输入订餐人姓名：");
					String names = input.next();
					System.out.println("请输入送餐时间（送餐时间为10点至18点间整点送餐）：");
					int times = input.nextInt();
					while(times<10 || times>18){
						System.out.println("你的送餐时间输入不正确，请重新输入：");
						times = input.nextInt();
					}
					System.out.println("请输入送餐地址：");
					String diZhi = input.next();
					double Prices = cpPrice[bianHao-1]*fenS;
					double scFei = Prices>50?0:6;
					double numPrices = Prices+scFei;
					System.out.println("订餐成功！");
					System.out.println("你订的是"+fenShu+"份"+cpName[bianHao-1]);
					System.out.println("订餐人："+names);
					System.out.println("送餐时间："+times);
					System.out.println("送餐地址："+diZhi);
					System.out.println("餐费："+Prices+"元，送餐费："+scFei+"元");
					System.out.println("总金额"+numPrices+"元！");
					
					//保存数据
					name[i] = names;
					canPin[i] = cpName[bianHao-1];
					fenShu[i] = fenS;
					time[i] = times;
					adress[i] = diZhi;
					numPrice[i] = numPrices;
					break;
				}
			}
			if(!weiZhi){
					System.out.println("你的餐袋已满！");
			}
	}
	public void canDai(){
			System.out.println("******查看餐袋******");
			System.out.println("序号\t订餐人\t所订餐品信息\t份数\t送餐时间\t\t送餐地址\t\t总金额\t\t状态");
				for(int i=0;i<name.length;i++){
					if(name[i]!=null){
						String states = state[i]==0?"已预订":"已签收";
						System.out.println((i+1)+"\t"+name[i]+"\t"+canPin[i]+"\t\t"+fenShu[i]+"\t"+time[i]+"\t\t"+adress[i]+"\t\t"+numPrice[i]+"元\t\t"+states);
					}
				}
	}
	public void sanChu(){
			System.out.println("******删除订单******");
			System.out.println("请选择你要删除的订单序号：");
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
	}
	public void qianShou(){
				System.out.println("******签收订单******");
				System.out.println("请选择你要签收的订单序号：");
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
	}
	public void dianZhan(){
				System.out.println("******我要点赞******");
				System.out.println("序号\t餐品名\t单价\t点赞数");
				for(int i=0;i<cpName.length;i++){
					System.out.println((i+1)+"\t"+cpName[i]+"\t"+cpPrice[i]+"元\t"+dianZhan[i]+"赞");
				}
				System.out.println("请输入要点赞的餐品序号：");
				int dianZ = input.nextInt();
				if(dianZ>=1 && dianZ<=4 && name[dianZ-1]!=null){
					dianZhan[dianZ-1]++;
					System.out.println("点赞成功！");
					System.out.println(cpName[dianZ-1]+"目前的点赞数为："+dianZhan[dianZ-1]);
				}else{
					System.out.println("此餐品不存在，系统未找到该餐品！");
				}
	}
	public void tuiChu(){
				System.out.println("******退出系统******");
	}
				
}
