package tiaojian.xunhuan;
import java.util.Scanner;


public class XinQi {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int numb;
		do{
			System.out.println("����������1-7������0��������");
			numb = input.nextInt();
			switch(numb){
			case 1:
				System.out.println("������MON");
				break;
			case 2:
				System.out.println("������TUE");
				break;
			case 3:
				System.out.println("������WED");
				break;
			case 4:
				System.out.println("������THU");
				break;
			case 5:
				System.out.println("������FRI");
				break;
			case 6:
				System.out.println("������SAT");
				break;
			case 7:
				System.out.println("������SUN");
				break;
			}
			if(numb<0 || numb>7){
				System.out.println("���������룡");
			}
		}while(numb!=0);
		System.out.println("���������");
	}
}
