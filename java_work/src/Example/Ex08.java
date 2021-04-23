package Example;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		//���� ����
		// �÷��̾ ���ϴ� ��ŭ ī�带 �޾Ƽ� ī�� ���� ���� ���� 21�� ����� ����� �¸��ϴ� ����
		// 21�� �Ѿ�� ����.
		// A ��  ī�尪�� 1 Ȥ�� 10�� �ɼ� �ִ�.
		// JQK ī�尪�� 10�̴�.
		
		//1. ī�� 1�� �غ�  deck �� 52���� ī�带 �ĺ��Ҽ� �ִ� ���� ���� �迭
		int [] deck=new int[52];
		for(int i=0;i<52;i++) {
			deck[i]=i;
		}
		//2. ī�� �ĺ� ��� ����   25  ��Ʈ�� 4��.
		
		String []cardShape= {"�����̵�","���̾�","��Ʈ","ũ�ι�"};
		
		//ī�� ������ȣ 28�� ������ ī���ΰ�?
		//System.out.println(cardShape[51/13]);
		//���� deck�� ��� �ִ� ��� ī���� ����� ����غ���.
//		for(int i=0;i<deck.length;i++) {
//			System.out.print(cardShape[deck[i]/13]+" ");
//		}
		
		String []cardNumber= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//ī�� ������ȣ 28�� ������� ī���ΰ�?
//		System.out.println();
//		System.out.println(cardShape[28/13]);
//		System.out.println(cardNumber[28%13]);
//		
//		for(int i=0;i<deck.length;i++) {
//			System.out.println(cardShape[deck[i]/13]);
//			System.out.println(cardNumber[deck[i]%13]);	
//		}
		//ī�� �غ�� ����ڿ��� �����ֱ�����
		//�����ϰ� ī�带 ���� �۾�����
		//15:40
		
		
		//Math.random()�޼ҵ�� 0���� 1�̸��� �Ǽ��� ���ϵȴ�.
		//System.out.println(Math.random());     //0�̸� �Ǽ�
		//System.out.println(Math.random()*52);  //0~51 �Ǽ�
		//System.out.println(Math.random()*52+1);//1~52 �Ǽ�
		//System.out.println((int)(Math.random()*52));  //0~51 ����
		
		
//		int deck2[]=new int[52];
//		
//		int i=0;
//		int j=0;
//		//16:30
//		
//		for(i=0;i<deck2.length;i++) {
//			int r=(int)(Math.random()*52);
//			for(j=0;j<i;j++) {
//				if(deck2[j]==r) {
//					break;
//				}
//			}
//			if(i==j) {
//				deck2[i]=r;
//			}else {
//				i--;
//			}
//		}
//		System.out.println(Arrays.toString(deck2));
		
		for(int i=0;i<5000;i++) {
			int r=(int)(Math.random()*52);
			int temp=deck[0];
			deck[0]=deck[r];
			deck[r]=temp;
		}
		//System.out.println(Arrays.toString(deck));
		//ī�� ���� ����
		//�θ��� �÷��̾�� ī�� 1�徿 �Ѱ��ֱ�
		
		int [] p1Deck=new int[10];	//p1�� ���� ī��
		int [] p2Deck=new int[10];  //p2�� ���� ī��
		int deckIndex=0;			//����� ī�屸�� �ε���	
		int p1DeckIndex=0;			//p1�� ī�� ����
		int p2DeckIndex=0;			//p2�� ī�� ����
		int p1Sum=0;
		int p2Sum=0;
		boolean p1GameEndFlag=true;
		boolean p2GameEndFlag=true;
		
		for(int i=0;i<10;i++) {
			
			if(p1GameEndFlag) {
				System.out.println("p1�� ī�带 �����ðڽ��ϱ�? 1.���� 2.�ȹ���");
				String input=new java.util.Scanner(System.in).nextLine();
				if(input.equals("1")) {
					
				}else {
					p1GameEndFlag=false;
				}
			}
			if(p1GameEndFlag) {
				p1Deck[p1DeckIndex++]=deck[deckIndex++];
			}
			if(p2GameEndFlag) {
				System.out.println("p2�� ī�带 �����ðڽ��ϱ�? 1.���� 2.�ȹ���");
				String input=new java.util.Scanner(System.in).nextLine();
				if(input.equals("1")) {
					
				}else {
					p2GameEndFlag=false;
				}
			}
		
			if(p2GameEndFlag) {
				p2Deck[p2DeckIndex++]=deck[deckIndex++];
			}
			
			if(p1GameEndFlag==false&&p2GameEndFlag==false) {
				break;
			}
			
			System.out.println("p1�� ī��� ������ �����ϴ�.");
			for(int j=0;j<p1DeckIndex;j++) {
				System.out.print(cardShape[p1Deck[j]/13]+" " );
				System.out.print(cardNumber[p1Deck[j]%13]+",");
			}
			
			p1Sum=0;
			for(int j=0;j<p1DeckIndex;j++) {
				switch(p1Deck[j]%13) {
				case 0: //  10 
					p1Sum=p1Sum+10;//21 �̳Ѿ�� 
					break;
				case 1: // 2  
				case 2: // 3
				case 3: // 4
				case 4: // 5 
				case 5: // 6
				case 6: // 7 
				case 7: // 8
				case 8: //  9
				case 9: //  10
					p1Sum=p1Sum+p1Deck[j]%13+1;
					break;
				default:
					p1Sum=p1Sum+10;
					break;
				}
				//sum �� 21�� �Ѿ�� A�� 10���� ó�������Ƿ� A������ŭ sum����-9�� 21���ϰ� �ɶ����� �ݺ�
				for(int k=0;k<p1DeckIndex;k++) {
					if(p1Deck[k]%13==0) {
						if(p1Sum>21) {
							p1Sum=p1Sum-9;
						}else {
							break;
						}
					}					
				}
				
				//����� 21�� �Ѿ�� ���ӿ� ������ 
				//18:00
				
				
			}
			System.out.print("p1Sum="+p1Sum);
			System.out.println();
			System.out.println("p2�� ī��� ������ �����ϴ�.");
			for(int j=0;j<p2DeckIndex;j++) {
				System.out.print(cardShape[p2Deck[j]/13]+" " );
				System.out.print(cardNumber[p2Deck[j]%13]+",");
				//�������
				
			}
			p2Sum=0;
			for(int j=0;j<p2DeckIndex;j++) {
				switch(p2Deck[j]%13) {
				case 0: //  10 
					p2Sum=p2Sum+10;//21 �̳Ѿ�� 
					break;
				case 1: // 2  
				case 2: // 3
				case 3: // 4
				case 4: // 5 
				case 5: // 6
				case 6: // 7 
				case 7: // 8
				case 8: //  9
				case 9: //  10
					p2Sum=p2Sum+p2Deck[j]%13+1;
					break;
				default:
					p2Sum=p2Sum+10;
					break;
				}
				//sum �� 21�� �Ѿ�� A�� 10���� ó�������Ƿ� A������ŭ sum����-9�� 21���ϰ� �ɶ����� �ݺ�
				for(int k=0;k<p2DeckIndex;k++) {
					if(p2Deck[k]%13==0) {
						if(p2Sum>21) {
							p2Sum=p2Sum-9;
						}else {
							break;
						}
					}					
				}
				
				//����� 21�� �Ѿ�� ���ӿ� ������ 
				//18:00
				
				
			}
			System.out.print("p2Sum="+p2Sum);
			System.out.println();
			
			new java.util.Scanner(System.in).nextLine();
		}
		
		//ī�� 1�徿 3�� �޾Ƽ� ����ϴ� �κ��� ����
		System.out.println("��������");
		
		
	}
}


