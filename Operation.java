package com.mxdx.chlm;
import java.util.Scanner;
//����ҵ����
public class Operation extends DinCanSystem implements CaiDan {
	Scanner input = new Scanner(System.in);
	boolean weiZhi = false;
	
	public void dinCan(){
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
					while(bianHao>6 || bianHao<1){
					System.out.println("������Ĳ�Ʒ��Ų����ڣ�����������");
					bianHao = input.nextInt();
					}
					System.out.println("��ѡ������Ҫ�ķ�����");
					int fenS = input.nextInt();
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
					double Prices = cpPrice[bianHao-1]*fenS;
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
					canPin[i] = cpName[bianHao-1];
					fenShu[i] = fenS;
					time[i] = times;
					adress[i] = diZhi;
					numPrice[i] = numPrices;
					break;
				}
			}
			if(!weiZhi){
					System.out.println("��Ĳʹ�������");
			}
	}
	public void canDai(){
			System.out.println("******�鿴�ʹ�******");
			System.out.println("���\t������\t������Ʒ��Ϣ\t����\t�Ͳ�ʱ��\t\t�Ͳ͵�ַ\t\t�ܽ��\t\t״̬");
				for(int i=0;i<name.length;i++){
					if(name[i]!=null){
						String states = state[i]==0?"��Ԥ��":"��ǩ��";
						System.out.println((i+1)+"\t"+name[i]+"\t"+canPin[i]+"\t\t"+fenShu[i]+"\t"+time[i]+"\t\t"+adress[i]+"\t\t"+numPrice[i]+"Ԫ\t\t"+states);
					}
				}
	}
	public void sanChu(){
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
	}
	public void qianShou(){
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
	}
	public void dianZhan(){
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
	}
	public void tuiChu(){
				System.out.println("******�˳�ϵͳ******");
	}
				
}
