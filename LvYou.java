package tiaojian.xunhuan;
import java.util.Scanner;


public class LvYou {
	public static void main(String[] args) {
		int price = 5000;
		double jinJi;
		double touDen;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你出行的月份（1~12）：");
		int sun = input.nextInt();
		if(sun>=4 && sun<=10){
			System.out.println("请问你选择头等舱还是经济舱？头等舱选择1，经济舱选择2");
			int numb = input.nextInt();
				if(numb==1){
				touDen = price*0.9;
				System.out.println("你的票价为："+touDen);
				}else if(numb==2){
					jinJi = price*0.6;
					System.out.println("你的票价为："+jinJi);
				}
		}else if(sun<4 || sun>10){
			System.out.println("请问你选择头等舱还是经济舱？头等舱选择1，经济舱选择2");
			int numb = input.nextInt();
				if(numb==1){
				touDen = price*0.5;
				System.out.println("你的票价为："+touDen);
				}else if(numb==2){
					jinJi = price*0.4;
					System.out.println("你的票价为："+jinJi);
				}
		}
	}
}
