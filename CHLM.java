import java.util.Scanner;

//�Ի����˶���ϵͳ
public class CHLM {
	public static void main(String[] args){
		System.out.print();
		//�������⣬һ�鶩����Ϣ
		String[] names = new String[4];//���涨��������
		String[] dishMegs = new String[4];//����������Ʒ��Ϣ����Ʒ���ͷ�����
		int[] times = new int[4];//�����Ͳ�ʱ��
		String[] addresses = new String[4];//�����Ͳ͵�ַ
		int[] states = new int[4];//���涩��״̬ 0����Ԥ��  1�������
		double[] sumPrices = new double[4];//���涩���ܽ��
		//��ѡ��Ĳ�Ʒ��Ϣ
		String[] dishNames = {"���մ���","������˿","ʱ���߲�"};      //��Ʒ����
		double[] prices = new double[]{38,20,10};          //��Ʒ����
		int[] praiseNums = new int[3];                 //������
		
		//��ʼ����һ��������Ϣ
		names[0] = "����";
		dishMegs[0] = "���մ���  2��";
		times[0] = 12;
		addresses[0] = "ˮ��ɽׯ108��";
		states[0] = 1;
		sumPrices[0] = 76;
		
		//��ʼ���ڶ���������Ϣ
		names[1] = "����";
		dishMegs[1] = "������˿  2��";
		times[1] = 18;
		addresses[1] = "�̺�����108��";
		states[1] = 0;
		sumPrices[1] = 45;
		
		Scanner input = new Scanner(System.in);
		int num = -1;//�û�����0�������˵��������˳�ϵͳ
		boolean isExit = false;//��־�û��Ƿ��˳�ϵͳ��trueΪ�˳�ϵͳ
		
		System.out.println("\n��ӭʹ�á��Ի����˶���ϵͳ��");
	
			//ѭ����������ʾ���˵��������û�ѡ�������ִ����Ӧ����
		do{       //��ʾ�˵�
			System.out.println("***************************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("***************************************");
			System.out.print("��ѡ��");
			int choose = input.nextInt();//��ס�û��Ĺ��ܱ��
			
			//�����û�����Ĺ��ܱ�ţ�ִ����Ӧ����
			switch(choose){
			case 1:			//��Ҫ����
				System.out.println("******��Ҫ����******");
				boolean isAdd = false;//��¼�Ƿ���Զ���
				for(int j=1;j<names.length;j++){
					if(names[j]==null){//�ҵ���һ����λ�ÿ�����Ӷ�����Ϣ
						isAdd = true;
						
						//��ʾ��ѡ��Ĳ�Ʒ��Ϣ
						System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
						for(int i=0;i<dishNames.length;i++){
						String price = prices[i]+"Ԫ";
						String priaiseNum =(praiseNums[i]>0)?	praiseNums[i]+"��":"0";
						System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+priaiseNum);
						}
						//�û����
						System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
						int chooseDish = input.nextInt();
						System.out.print("��ѡ������Ҫ�ķ�����");
						int number = input.nextInt();
						System.out.print("�����붩����������");
						String name = input.next();
						String dishMeg = dishNames[chooseDish-1]+" "+number+"��";  //�����Ϣ
						double sumPrice = prices[chooseDish-1]*number;   //�ܽ��
						//�ͷ���50��ȥ�Ͳͷ�5Ԫ
						double deliCharge = (sumPrice>50)?0:5;
						
						System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ���");
						int time = input.nextInt();
						while(time>20||time<10){
							System.out.print("�����������������10~20���������");
							time = input.nextInt();
						}
						System.out.print("�������Ͳ͵�ַ��");
						String address = input.next();
						
						//�������״̬��Ĭ����0������Ԥ��״̬
						System.out.println("���ͳɹ���");
						System.out.println("�㶩���ǣ�"+dishMeg);
						System.out.println("�Ͳ�ʱ�䣺"+time+"��");
						System.out.println("�Ͳ͵�ַ��"+address);
						double s = sumPrice+deliCharge;
						System.out.println("�ͷѣ�"+sumPrice+"Ԫ,\t�Ͳͷ�"+deliCharge+"Ԫ��\t�ܼ�:"+s+"Ԫ��");
						
						//�������
						names[j] = name;
						dishMegs[j] = dishMeg;
						times[j] = time;
						addresses[j] = address;
						sumPrices[j] = sumPrice+deliCharge;
						break;
					}
				}
					if(!isAdd){
						System.out.println("�Բ�����Ĳʹ�������");
					}
				break;
			case 2:			//�鿴�ʹ�
				System.out.println("******�鿴�ʹ�******");
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for(int i=0;i<names.length;i++){
					if(names[i]!=null){
						String state = (states[i]==0)?"��Ԥ��":"�����";
						String date = times[i]+"ʱ";
						String sumprice = sumPrices[i]+"Ԫ";
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t"+addresses[i]+"\t"+sumprice+"\t"+state);
					}
				}
				break;
			case 3:			//ǩ�ն���
				System.out.println("******ǩ�ն���******");
				boolean isSignFind = false;  //�ҵ�Ҫǩ�յĶ���
				System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
				int signOrderId = input.nextInt();
				for(int i=0;i<names.length;i++){
				//      &&signOrderId==i+1��֤ÿ�ζ�ֻ���һ��
					if(names[i]!=null && states[i]==0 &&signOrderId==i+1){
					states[i] = 1;  //��״ֵ̬��Ϊ�����
					System.out.println("����ǩ�ճɹ���");
					isSignFind = true;   //������ҵ��˶���
					}else if(names[i]!=null && states[i]==1 &&signOrderId==i+1){
						System.out.println("��ѡ��Ķ�����ǩ�գ������ٴ�ǩ�գ�");
						isSignFind = true;   //������ҵ��˶���
					}
				}
				//δ�ҵ��Ķ�����ţ�����ǩ��
				if(!isSignFind){
					System.out.println("��ѡ��Ķ��������ڣ�");
				}
				break;
			case 4:			//ɾ������
				System.out.println("******ɾ������******");
				boolean isDelFind = false;    //����Ƿ��ҵ�Ҫɾ���Ķ���
				System.out.println("������Ҫɾ���Ķ�����ţ�");
				int intdelId = input.nextInt();
				for(int i=0;i<names.length;i++){
					
					
					if(names[i]!=null && states[i]==1){
						isDelFind = true;    //������ҵ��˶���
						//ִ��ɾ��������ɾ��λ�ú��Ԫ������ǰ��
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
						System.out.println("ɾ�������ɹ���");
						break;
					}else if(names[i]!=null && states[i]==0){
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
						isDelFind = true;  // ������ҵ��˶���
						break;
					}
				}
				//δ�ҵ�����ŵĶ���������ɾ��
				if(!isDelFind){
					System.out.println("��Ҫɾ���Ķ��������ڣ�");
				}
				break;
			case 5:			//��Ҫ����
				System.out.println("******��Ҫ����******");
				//��ʾ��Ʒ��Ϣ
				System.out.println("���"+"\t"+"����"+"\t"+"����");
				for(int i=0;i<dishNames.length;i++){
					String price = prices[i]+"Ԫ";
					String priaiseNum = praiseNums[i]>0?praiseNums[i]+"��":"";
					System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+priaiseNum);
				}
				System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int priaiseNum = input.nextInt();
				praiseNums[priaiseNum-1]++;  //������1
				System.out.println("���޳ɹ���");
				break;
			case 6:			//�˳�ϵͳ
				System.out.print("");
				isExit = true;
				num = -1;
				break;
			default:		//�˳�ϵͳ
				System.out.print("");
				break;
			}
			if(!isExit){
				System.out.print("����0�������˵���");
				num = input.nextInt();
			}
		 }while(num==0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�");
	}
}
			
			
			
			
			
			
