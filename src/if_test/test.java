package if_test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
//		연도가 주어졌을 때, 윤년이면 윤년, 아니면 아니라는말을 출력하는 프로그램을 작성하시오.
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
//		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
//		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		int year=scan.nextInt();
		
		
		if(year<=0) {
			System.out.println("1이상만 입력해주세요.");
		}if(year%4==0&&year%100!=0 ||year%400==0) {
			System.out.println(year + " = 윤년입니다!");
		}else {
			System.out.println("윤년이 아닙니다!");
		}
		
		
		
//		사용자로부터 이름, 키 체중 값을 입력 받아 비만도를 구하고
//		결과를 출력 할 때 비만도 값 100을 기준으로 100미만이면 저체중,
//		100이상 110미만은 정상, 110이상 120미만 과체중,
//		120이상 130 미만 비만, 130 이상은 고도비만으로 출력 하시요.
//		비만도 계산식 : 비만도(%)=현재 체중/표준 체중*100
//		표준체중=(키-100)*0.9
		
		
		System.out.println("이름을 입력해주세요 >>>");
		String name=scan.next();
		System.out.println("키를 입력해주세요 >>>");
		double height=scan.nextDouble();
		System.out.println("몸무게를 입력해주세요 >>>");
		double weigth=scan.nextDouble();
		
		double weigthAvg=(height-100)*0.9;
		
		double avg = weigth/weigthAvg*100;
		
		System.out.println("표준체중 :"+weigthAvg);
		System.out.println("비만도 :"+avg);
		
		if(avg<100) {
			System.out.println(name + "님은 저체중 입니다");
		}
		if(100<=avg&&avg<110) {
			System.out.println(name + "님은 정상 입니다");
		}
		if(110<=avg&&avg<120) {
			System.out.println(name + "님은 과체중 입니다");
		}
		if(120<=avg&&avg<130) {
			System.out.println(name + "님은 비만 입니다");
		}
		if(avg>=130) {
			System.out.println(name + "님은 고도비만 입니다");
		}
		

	}
}





