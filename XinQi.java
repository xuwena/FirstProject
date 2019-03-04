package tiaojian.xunhuan;
import java.util.Scanner;


public class XinQi {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int numb;
		do{
			System.out.println("请输入数字1-7（输入0结束）：");
			numb = input.nextInt();
			switch(numb){
			case 1:
				System.out.println("今天是MON");
				break;
			case 2:
				System.out.println("今天是TUE");
				break;
			case 3:
				System.out.println("今天是WED");
				break;
			case 4:
				System.out.println("今天是THU");
				break;
			case 5:
				System.out.println("今天是FRI");
				break;
			case 6:
				System.out.println("今天是SAT");
				break;
			case 7:
				System.out.println("今天是SUN");
				break;
			}
			if(numb<0 || numb>7){
				System.out.println("请重新输入！");
			}
		}while(numb!=0);
		System.out.println("程序结束！");
	}
}
