package tiaojian.xunhuan;

import java.util.Scanner;

public class Numb {
	public static void main(String[] args) {
		int max = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数（输入0结束）：");
		 int numb = input.nextInt();
		int min = numb;
			do{
				System.out.println("请输入一个整数（输入0结束）：");
				 numb = input.nextInt();
				if(numb>max){
					max = numb;
				}else if(numb<min && numb!=0){
					min = numb;
				}
			}while(numb!=0);
		System.out.println("最大值是："+max+"最小值是："+min);
	}
}
