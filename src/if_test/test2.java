package if_test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
//		1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�. 
//
//		���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
//		���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
//		��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
//		���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. �� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
//
//		3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
		
		Scanner scan=new Scanner(System.in);
//		
//		
//		System.out.println("ù��° �Է� >>>");
//		int num1=scan.nextInt();
//		System.out.println("�ι�° �Է� >>>");
//		int num2=scan.nextInt();
//		System.out.println("����° �Է� >>>");
//		int num3=scan.nextInt();
//		
//		if(num1==num3){
//			if(num1!=num2) {//1	2	1
//				System.out.println("��� :"+(1000+num1*100)+"��");
//			}else {//1	1	1
//				System.out.println("��� :"+(10000+num1*1000)+"��");
//			}
//		}else{
//			if(num1!=num2) {
//				if(num2!=num3) {//1	2	3
//					if(num1<num2) {
//						num1=num2;
//					}
//					if(num1<num3) {
//						num1=num3;
//					}
//					System.out.println("��� :"+(num1*100)+"��");	
//				}else {//1	2	2
//					System.out.println("��� :"+(1000+num2*100)+"��");
//				}
//			}else {//1	1	2
//				System.out.println("��� :"+(1000+num1*100)+"��");
//			}
//		}
//		
//		//3���� �ٸ��� ( 1,2,3) (3,2,1) (1,3,2)
//		if(num1!=num2&&num1!=num3&&num2!=num3) {
//			if(num1<num2) {
//				num1=num2;
//			}
//			if(num1<num3) {
//				num1=num3;
//			}
//			System.out.println("��� :"+(num1*100)+"��");
//		}
//		
//		
//		if(num1==num2) {//1��2�� ���ٸ� , (1,1)
//			if(num1==num3) {//1��2�� ������ 3�� ���ٸ� (1,1,1)
//				System.out.println("��� :"+(10000+num1*1000)+"��");
//			}else {//1��2�� ������ 3�� �ٸ��ٸ�
//				if(num1<num2) {
//					num1=num2;
//				}
//				System.out.println("��� :"+(1000+num1*100)+"��");
//			}
//		}
//		
//		
//		if(num1!=num2&&num2==num3) {
//			if(num2<num3) {
//				num2=num3;
//			}
//			System.out.println("��� :"+(1000+num2*100)+"��");
//		}else {
//			if(num1<num3) {
//				num1=num3;
//			}
//			System.out.println("��� :"+(1000+num1*100)+"��");
//		}
		
		
		
		
		//���� ,���� ,���� ������ �Է¹ް� 
		//����� 90�̻��̸�  A
		//80�̻��̸� B, 70 �̻��̸� C,  70�̸��̸� F �� ������ּ���
		//Scanner scan=new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ���>>>");
		int kor=scan.nextInt();
		System.out.println("���� ������ �Է����ּ���>>>");
		int eng=scan.nextInt();
		System.out.println("���� ������ �Է����ּ���>>>");
		int math=scan.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3;
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		if(avg>=90) {
			System.out.println("!!A!!");
		}else if(avg>=80) {
			System.out.println("!B!");
		}else if(avg>=70) {
			System.out.println("C");
		}else {
			System.out.println("F..");
		}	
		
	}
}





