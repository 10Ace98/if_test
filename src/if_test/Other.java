package if_test;

import java.util.Scanner;

public class Other {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("x��ǥ �Է� >>>");
//		int x=scan.nextInt();
//		System.out.println("y��ǥ �Է� >>>");
//		int y=scan.nextInt();
//		
//		if(x>=0) {
//			if(y>=0) {
//				System.out.println("x : "+x+"y : "+y+" �� 1 ��и�");
//			}else {
//				System.out.println("x : "+x+"y : "+y+" �� 4 ��и�");
//			}
//		}else {
//			if(y>=0) {
//				System.out.println("x : "+x+"y : "+y+" �� 2 ��и�");
//			}else {
//				System.out.println("x : "+x+"y : "+y+" �� 3 ��и�");
//			}
//		}
		
		
		
		
		
//		���� 7,8. ��ȣ�� ���Ǵ�� T ��Ż��� �� �ڵ��� �ȸӳ��� ���. ���Ǵ�� T ��Ż�� ��ȣ���� ���� �� ���� ����� �� �ϳ��� �����϶�� �ߴ�.
//		���� �����
//		�ν� �����
//		���� ������� 30�ʸ��� 10���� û���ȴ�. �� ���� ���� 29�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 10���� û���ȴ�. 
		//���� 30�ʺ��� 59�� ���̷� ��ȭ�� ������ 20���� û���ȴ�.60-89-30 90-119-40
//		�ν� ������� 60�ʸ��� 15���� û���ȴ�. �� ���� ���� 59�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 15���� û���ȴ�. 
		//���� 60�ʺ��� 119�� ���̷� ��ȭ�� ������ 30���� û���ȴ�.
//		��ȣ�� ���� �޿� ���Ǵ�� T ��Ż縦 �̿��� �� ��ȭ �ð� ����� �־����� ��� ������� ��� �ϴ� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.println("�̿��� �ð�(��) �Է� >>>");
		int seconde=scan.nextInt();
		
		int young=seconde/30;
		int min=seconde/60;
				
		int youngMoney;
		int minMoney;
		
		if(seconde<30||min<1) {
			++young;
			youngMoney=young*10;
			System.out.println(seconde+"�⺻���"+youngMoney);
			++min;
			minMoney=min*15;
			System.out.println(seconde+"�⺻���"+minMoney);
			if(youngMoney>minMoney) {
				System.out.println("���� ��� : "+youngMoney+" �ν� ��� : "+minMoney+
						"�ν� ������� �� ȿ����!");
			}else {
				System.out.println("���� ��� : "+youngMoney+" �ν� ��� : "+minMoney+
						"���� ������� �� ȿ����!");
			}
			min=0;	
		}
		System.out.println("======================");
		if(young>=1&&min>=1) {
			young++;
			min++;
			youngMoney=young*10;
			minMoney=min*15;
			if(youngMoney==minMoney) {
				System.out.println("���� ��� : "+youngMoney+" �ν� ��� : "+minMoney+
						"���� ���!");
			}else {
				if(youngMoney>minMoney) {
					System.out.println("���� ��� : "+youngMoney+" �ν� ��� : "+minMoney+
							"�ν� ������� �� ȿ����!");
				}else {
					System.out.println("���� ��� : "+youngMoney+" �ν� ��� : "+minMoney+
							"���� ������� �� ȿ����!");
				}
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
