package if_test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
//		������ �־����� ��, �����̸� ����, �ƴϸ� �ƴ϶�¸��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
//		���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
//		1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�.
//		������, 2000���� 400�� ����̱� ������ �����̴�.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�⵵�� �Է��ϼ���");
		int year=scan.nextInt();
		
		
		if(year<=0) {
			System.out.println("1�̻� �Է����ּ���.");
		}if(year%4==0&&year%100!=0 ||year%400==0) {
			System.out.println(year + " = �����Դϴ�!");
		}else {
			System.out.println("������ �ƴմϴ�!");
		}
		
		
		
//		����ڷκ��� �̸�, Ű ü�� ���� �Է� �޾� �񸸵��� ���ϰ�
//		����� ��� �� �� �񸸵� �� 100�� �������� 100�̸��̸� ��ü��,
//		100�̻� 110�̸��� ����, 110�̻� 120�̸� ��ü��,
//		120�̻� 130 �̸� ��, 130 �̻��� �������� ��� �Ͻÿ�.
//		�񸸵� ���� : �񸸵�(%)=���� ü��/ǥ�� ü��*100
//		ǥ��ü��=(Ű-100)*0.9
		
		
		System.out.println("�̸��� �Է����ּ��� >>>");
		String name=scan.next();
		System.out.println("Ű�� �Է����ּ��� >>>");
		double height=scan.nextDouble();
		System.out.println("�����Ը� �Է����ּ��� >>>");
		double weigth=scan.nextDouble();
		
		double weigthAvg=(height-100)*0.9;
		
		double avg = weigth/weigthAvg*100;
		
		System.out.println("ǥ��ü�� :"+weigthAvg);
		System.out.println("�񸸵� :"+avg);
		
		if(avg<100) {
			System.out.println(name + "���� ��ü�� �Դϴ�");
		}
		if(100<=avg&&avg<110) {
			System.out.println(name + "���� ���� �Դϴ�");
		}
		if(110<=avg&&avg<120) {
			System.out.println(name + "���� ��ü�� �Դϴ�");
		}
		if(120<=avg&&avg<130) {
			System.out.println(name + "���� �� �Դϴ�");
		}
		if(avg>=130) {
			System.out.println(name + "���� ���� �Դϴ�");
		}
		

	}
}





