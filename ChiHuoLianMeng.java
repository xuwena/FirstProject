package com.chihuo.lianmeng;
import java.util.Scanner;
public class ChiHuoLianMeng {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//��������һ�鶩����Ϣ�������ˣ�������Ʒ��Ϣ���Ͳ�ʱ�䣬�Ͳ͵�ַ���ܽ�����״̬
		String[] name = new String[4];
		String[] canPin = new String[4];
		int[] time = new int[4];  //10:00-18:00
		String[] adress = new String[4]; 
		double[] numPrice = new double[4];
		int[] state = new int[4]; //0����Ԥ��  1����ǩ��
		//�������壬һ���Ʒ��Ϣ
		String[] cpName = {"������˿","��������","ũ��һ����"};
		int[] cpPrice = {16,12,18};
		int[] dianZhan = new int[3];
		//��ʼ������������Ϣ
		name[0] = "������";
		canPin[0] = "2��������˿";
		time[0] = 12;
		adress[0] = "��ҵ·8��";
		numPrice[0] = 32;
		state[0] = 0;
		
		name[1] = "����";
		canPin[1] = "3��ũ��һ����";
		time[1] = 13;
		adress[1] = "����·6��";
		numPrice[1] = 54;
		state[1] = 1;
		
		int xuHao = -1;
		do{
			System.out.println("\t��ӭʹ�óԻ����˶���ϵͳ");
			System.out.println("****************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ɾ������");
			System.out.println("4.ǩ�ն���");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("****************************");
			System.out.println("��ѡ��");
			 xuHao = input.nextInt();
			 boolean weiZhi = false;//  �ʹ��Ƿ��п�λ��
			switch(xuHao){
			case 1:
				System.out.println("******��Ҫ����******");
				for(int i=0;i<name.length;i++){
					if(name[i]==null){
						weiZhi = true;
					//�ɹ�ѡ���Ʒ��Ϣ
					System.out.println("���\t����\t����\t������");
						for(int j=0;j<cpName.length;j++){
							System.out.println((j+1)+"\t"+cpName[j]+"\t"+cpPrice[j]+"Ԫ\t"+dianZhan[j]+"��");
						}
						System.out.println("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
						int bianHao = input.nextInt();
						while(bianHao>3 || bianHao<1){
						System.out.println("������Ĳ�Ʒ��Ų����ڣ�����������");
						bianHao = input.nextInt();
						}
						System.out.println("��ѡ������Ҫ�ķ�����");
						int fenShu = input.nextInt();
						System.out.println("�����붩����������");
						String names = input.next();
						System.out.println("�������Ͳ�ʱ�䣨�Ͳ�ʱ��Ϊ10����18��������Ͳͣ���");
						int times = input.nextInt();
						while(times<10 || times>18){
							System.out.println("����Ͳ�ʱ�����벻��ȷ�����������룺");
							times = input.nextInt();
						}
						System.out.println("�������Ͳ͵�ַ��");
						String diZhi = input.next();
						double Prices = cpPrice[bianHao-1]*fenShu;
						double scFei = Prices>50?0:6;
						double numPrices = Prices+scFei;
						System.out.println("���ͳɹ���");
						System.out.println("�㶩����"+fenShu+"��"+cpName[bianHao-1]);
						System.out.println("�����ˣ�"+names);
						System.out.println("�Ͳ�ʱ�䣺"+times);
						System.out.println("�Ͳ͵�ַ��"+diZhi);
						System.out.println("�ͷѣ�"+Prices+"Ԫ���Ͳͷѣ�"+scFei+"Ԫ");
						System.out.println("�ܽ��"+numPrices+"Ԫ��");
						
						//��������
						name[i] = names;
						canPin[i] = fenShu+"��"+cpName[bianHao-1];
						time[i] = times;
						adress[i] = diZhi;
						numPrice[i] = numPrices;
						break;
					}
				}
				if(!weiZhi){
						System.out.println("��Ĳʹ�������");
				}
				break;
			case 2:
				System.out.println("******�鿴�ʹ�******");
				System.out.println("���\t������\t������Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t״̬");
					for(int i=0;i<name.length;i++){
						if(name[i]!=null){
							String states = state[i]==0?"��Ԥ��":"��ǩ��";
							System.out.println((i+1)+"\t"+name[i]+"\t"+canPin[i]+"\t"+time[i]+"\t"+adress[i]+"\t\t"+numPrice[i]+"Ԫ\t"+states);
						}
					}
				break;
			case 3:
				System.out.println("******ɾ������******");
				System.out.println("��ѡ����Ҫɾ���Ķ�����ţ�");
				int sanChu = input.nextInt();
				if(sanChu>=1 && sanChu<=4 && name[sanChu-1]!=null){
					if(state[sanChu-1]==0){
						System.out.println("��ѡ��Ķ���δǩ�գ���ʱ����ɾ���ö�����");
					}else if(state[sanChu-1]==1){
						//ɾ��ǰ3���е�һ������
						for(int i=sanChu-1;i<name.length-1;i++){
							name[i] = name[i+1];
							canPin[i] = canPin[i+1];
							time[i] = time[i+1];
							adress[i] = adress[i+1];
							numPrice[i] = numPrice[i+1];
							state[i] = state[i+1];
						}
						//�ѵ�����������գ���֤������������ɾ��
							name[name.length-1] = null;
							canPin[canPin.length-1] = null;
							time[time.length-1] = 0;
							adress[adress.length-1] = null;
							numPrice[numPrice.length-1] = 0;
							state[state.length-1] = 0;
							
						System.out.println("����ɾ���ɹ���");
					}
				}else{
					System.out.println("�˶��������ڣ�ϵͳδ�ҵ��ö���");
				}
				break;
			case 4:
				System.out.println("******ǩ�ն���******");
				System.out.println("��ѡ����Ҫǩ�յĶ�����ţ�");
				int qianShou = input.nextInt();
				if(qianShou>=1 && qianShou<=4 && name[qianShou-1]!=null){
					if(state[qianShou-1]==0){
						state[qianShou-1] = 1;
						System.out.println("ǩ����ɣ�");
					}else{
						System.out.println("��ѡ��Ķ�����ǩ�գ������ٴ�ǩ�գ�");
					}
				}else{
					System.out.println("�˶���������,ϵͳδ�ҵ��ö�����");
				}
				break;
			case 5:
				System.out.println("******��Ҫ����******");
				System.out.println("���\t��Ʒ��\t����\t������");
				for(int i=0;i<cpName.length;i++){
					System.out.println((i+1)+"\t"+cpName[i]+"\t"+cpPrice[i]+"Ԫ\t"+dianZhan[i]+"��");
				}
				System.out.println("������Ҫ���޵Ĳ�Ʒ��ţ�");
				int dianZ = input.nextInt();
				if(dianZ>=1 && dianZ<=4 && name[dianZ-1]!=null){
					dianZhan[dianZ-1]++;
					System.out.println("���޳ɹ���");
					System.out.println(cpName[dianZ-1]+"Ŀǰ�ĵ�����Ϊ��"+dianZhan[dianZ-1]);
				}else{
					System.out.println("�˲�Ʒ�����ڣ�ϵͳδ�ҵ��ò�Ʒ��");
				}
				break;
			case 6:
				System.out.println("******�˳�ϵͳ******");
				break;
			default :
				System.out.println("��������");
				break;
			}
			if(xuHao==6){
				break;
			}else{
			System.out.println("����0���أ�");
			xuHao = input.nextInt();
			}
		}while(xuHao==0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
	}
}
