package tiaojian.xunhuan;
import java.util.Scanner;


public class LvYou {
	public static void main(String[] args) {
		int price = 5000;
		double jinJi;
		double touDen;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("����������е��·ݣ�1~12����");
		int sun = input.nextInt();
		if(sun>=4 && sun<=10){
			System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�ѡ��1�����ò�ѡ��2");
			int numb = input.nextInt();
				if(numb==1){
				touDen = price*0.9;
				System.out.println("���Ʊ��Ϊ��"+touDen);
				}else if(numb==2){
					jinJi = price*0.6;
					System.out.println("���Ʊ��Ϊ��"+jinJi);
				}
		}else if(sun<4 || sun>10){
			System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�ѡ��1�����ò�ѡ��2");
			int numb = input.nextInt();
				if(numb==1){
				touDen = price*0.5;
				System.out.println("���Ʊ��Ϊ��"+touDen);
				}else if(numb==2){
					jinJi = price*0.4;
					System.out.println("���Ʊ��Ϊ��"+jinJi);
				}
		}
	}
}
