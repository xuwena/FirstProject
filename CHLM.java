import java.util.Scanner;

//吃货联盟订餐系统
public class CHLM {
	public static void main(String[] args){
		System.out.print();
		//数据主题，一组订单信息
		String[] names = new String[4];//保存定餐人姓名
		String[] dishMegs = new String[4];//保存所订餐品信息（菜品名和份数）
		int[] times = new int[4];//保存送餐时间
		String[] addresses = new String[4];//保存送餐地址
		int[] states = new int[4];//保存订单状态 0：已预定  1：已完成
		double[] sumPrices = new double[4];//保存订单总金额
		//供选择的菜品信息
		String[] dishNames = {"红烧带鱼","鱼香肉丝","时令蔬菜"};      //菜品名称
		double[] prices = new double[]{38,20,10};          //菜品单价
		int[] praiseNums = new int[3];                 //点赞数
		
		//初始化第一条订单信息
		names[0] = "老王";
		dishMegs[0] = "红烧带鱼  2份";
		times[0] = 12;
		addresses[0] = "水云山庄108号";
		states[0] = 1;
		sumPrices[0] = 76;
		
		//初始化第二条订单信息
		names[1] = "老张";
		dishMegs[1] = "鱼香肉丝  2份";
		times[1] = 18;
		addresses[1] = "碧海云天108号";
		states[1] = 0;
		sumPrices[1] = 45;
		
		Scanner input = new Scanner(System.in);
		int num = -1;//用户输入0返回主菜单，否则退出系统
		boolean isExit = false;//标志用户是否退出系统：true为退出系统
		
		System.out.println("\n欢迎使用“吃货联盟订餐系统”");
	
			//循环操作，显示主菜单，根据用户选择的数字执行相应功能
		do{       //显示菜单
			System.out.println("***************************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("***************************************");
			System.out.print("请选择：");
			int choose = input.nextInt();//记住用户的功能编号
			
			//根据用户输入的功能编号，执行相应功能
			switch(choose){
			case 1:			//我要订餐
				System.out.println("******我要订餐******");
				boolean isAdd = false;//记录是否可以订餐
				for(int j=1;j<names.length;j++){
					if(names[j]==null){//找到第一个空位置可以添加订单信息
						isAdd = true;
						
						//显示供选择的菜品信息
						System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
						for(int i=0;i<dishNames.length;i++){
						String price = prices[i]+"元";
						String priaiseNum =(praiseNums[i]>0)?	praiseNums[i]+"赞":"0";
						System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+priaiseNum);
						}
						//用户点菜
						System.out.print("请选择你要点的菜品编号：");
						int chooseDish = input.nextInt();
						System.out.print("请选择你需要的份数：");
						int number = input.nextInt();
						System.out.print("请输入订餐人姓名：");
						String name = input.next();
						String dishMeg = dishNames[chooseDish-1]+" "+number+"份";  //点餐信息
						double sumPrice = prices[chooseDish-1]*number;   //总金额
						//餐费满50免去送餐费5元
						double deliCharge = (sumPrice>50)?0:5;
						
						System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
						int time = input.nextInt();
						while(time>20||time<10){
							System.out.print("你的输入有误，请输入10~20间的整数！");
							time = input.nextInt();
						}
						System.out.print("请输入送餐地址：");
						String address = input.next();
						
						//无需添加状态，默认是0，即已预定状态
						System.out.println("订餐成功！");
						System.out.println("你订的是："+dishMeg);
						System.out.println("送餐时间："+time+"点");
						System.out.println("送餐地址："+address);
						double s = sumPrice+deliCharge;
						System.out.println("餐费："+sumPrice+"元,\t送餐费"+deliCharge+"元，\t总计:"+s+"元。");
						
						//添加数据
						names[j] = name;
						dishMegs[j] = dishMeg;
						times[j] = time;
						addresses[j] = address;
						sumPrices[j] = sumPrice+deliCharge;
						break;
					}
				}
					if(!isAdd){
						System.out.println("对不起，你的餐袋已满！");
					}
				break;
			case 2:			//查看餐袋
				System.out.println("******查看餐袋******");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
				for(int i=0;i<names.length;i++){
					if(names[i]!=null){
						String state = (states[i]==0)?"已预订":"已完成";
						String date = times[i]+"时";
						String sumprice = sumPrices[i]+"元";
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t"+addresses[i]+"\t"+sumprice+"\t"+state);
					}
				}
				break;
			case 3:			//签收订单
				System.out.println("******签收订单******");
				boolean isSignFind = false;  //找到要签收的订单
				System.out.print("请选择要签收的订单序号：");
				int signOrderId = input.nextInt();
				for(int i=0;i<names.length;i++){
				//      &&signOrderId==i+1保证每次都只输出一句
					if(names[i]!=null && states[i]==0 &&signOrderId==i+1){
					states[i] = 1;  //将状态值置为已完成
					System.out.println("订单签收成功！");
					isSignFind = true;   //标记已找到此订单
					}else if(names[i]!=null && states[i]==1 &&signOrderId==i+1){
						System.out.println("你选择的订单已签收，不能再次签收！");
						isSignFind = true;   //标记已找到此订单
					}
				}
				//未找到的订单序号：不可签收
				if(!isSignFind){
					System.out.println("你选择的订单不存在！");
				}
				break;
			case 4:			//删除订单
				System.out.println("******删除订单******");
				boolean isDelFind = false;    //标记是否找到要删除的订单
				System.out.println("请输入要删除的订单序号：");
				int intdelId = input.nextInt();
				for(int i=0;i<names.length;i++){
					
					
					if(names[i]!=null && states[i]==1){
						isDelFind = true;    //标记已找到此订单
						//执行删除操作：删除位置后的元素依次前移
						for(int j=intdelId-1;j<names.length-1;j++){
							names[j] = names[j+1];
							dishMegs[j] = dishMegs[j+1];
							times[j] = times[j+1];
							addresses[j] = addresses[j+1];
							states[j] = states[j+1];
							sumPrices[j] = sumPrices[j+1];
						}
						//
						int endIndex = names.length-1;
						names[endIndex] = null;
						dishMegs[endIndex]=null;
						times[endIndex]=0;
						addresses[endIndex]=null;
						states[endIndex]=0;
						sumPrices[endIndex]=0;
						System.out.println("删除订单成功！");
						break;
					}else if(names[i]!=null && states[i]==0){
						System.out.println("你选择的订单未签收，不能删除！");
						isDelFind = true;  // 标记已找到此订单
						break;
					}
				}
				//未找到改序号的订单：不能删除
				if(!isDelFind){
					System.out.println("你要删除的订单不存在！");
				}
				break;
			case 5:			//我要点赞
				System.out.println("******我要点赞******");
				//显示菜品信息
				System.out.println("序号"+"\t"+"菜名"+"\t"+"单价");
				for(int i=0;i<dishNames.length;i++){
					String price = prices[i]+"元";
					String priaiseNum = praiseNums[i]>0?praiseNums[i]+"赞":"";
					System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+priaiseNum);
				}
				System.out.print("请选择你要点赞的菜品序号：");
				int priaiseNum = input.nextInt();
				praiseNums[priaiseNum-1]++;  //赞数加1
				System.out.println("点赞成功！");
				break;
			case 6:			//退出系统
				System.out.print("");
				isExit = true;
				num = -1;
				break;
			default:		//退出系统
				System.out.print("");
				break;
			}
			if(!isExit){
				System.out.print("输入0返回主菜单：");
				num = input.nextInt();
			}
		 }while(num==0);
		System.out.println("谢谢使用，欢迎下次光临！");
	}
}
			
			
			
			
			
			
