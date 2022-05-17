package if_test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		
		Scanner scan=new Scanner(System.in);
//		
//		
//		System.out.println("첫번째 입력 >>>");
//		int num1=scan.nextInt();
//		System.out.println("두번째 입력 >>>");
//		int num2=scan.nextInt();
//		System.out.println("세번째 입력 >>>");
//		int num3=scan.nextInt();
//		
//		if(num1==num3){
//			if(num1!=num2) {//1	2	1
//				System.out.println("상금 :"+(1000+num1*100)+"원");
//			}else {//1	1	1
//				System.out.println("상금 :"+(10000+num1*1000)+"원");
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
//					System.out.println("상금 :"+(num1*100)+"원");	
//				}else {//1	2	2
//					System.out.println("상금 :"+(1000+num2*100)+"원");
//				}
//			}else {//1	1	2
//				System.out.println("상금 :"+(1000+num1*100)+"원");
//			}
//		}
//		
//		//3개다 다를때 ( 1,2,3) (3,2,1) (1,3,2)
//		if(num1!=num2&&num1!=num3&&num2!=num3) {
//			if(num1<num2) {
//				num1=num2;
//			}
//			if(num1<num3) {
//				num1=num3;
//			}
//			System.out.println("상금 :"+(num1*100)+"원");
//		}
//		
//		
//		if(num1==num2) {//1과2가 같다면 , (1,1)
//			if(num1==num3) {//1과2가 같은데 3도 같다면 (1,1,1)
//				System.out.println("상금 :"+(10000+num1*1000)+"원");
//			}else {//1과2가 같지만 3은 다르다면
//				if(num1<num2) {
//					num1=num2;
//				}
//				System.out.println("상금 :"+(1000+num1*100)+"원");
//			}
//		}
//		
//		
//		if(num1!=num2&&num2==num3) {
//			if(num2<num3) {
//				num2=num3;
//			}
//			System.out.println("상금 :"+(1000+num2*100)+"원");
//		}else {
//			if(num1<num3) {
//				num1=num3;
//			}
//			System.out.println("상금 :"+(1000+num1*100)+"원");
//		}
		
		
		
		
		//국어 ,영어 ,수학 점수를 입력받고 
		//평균이 90이상이면  A
		//80이상이면 B, 70 이상이면 C,  70미만이면 F 를 출력해주세요
		//Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요>>>");
		int kor=scan.nextInt();
		System.out.println("영어 점수를 입력해주세요>>>");
		int eng=scan.nextInt();
		System.out.println("수학 점수를 입력해주세요>>>");
		int math=scan.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
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





