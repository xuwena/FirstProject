package tiaojian.xunhuan;

import java.util.Scanner;

public class Numb {
	public static void main(String[] args) {
		int max = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������������0��������");
		 int numb = input.nextInt();
		int min = numb;
			do{
				System.out.println("������һ������������0��������");
				 numb = input.nextInt();
				if(numb>max){
					max = numb;
				}else if(numb<min && numb!=0){
					min = numb;
				}
			}while(numb!=0);
		System.out.println("���ֵ�ǣ�"+max+"��Сֵ�ǣ�"+min);
	}
}
