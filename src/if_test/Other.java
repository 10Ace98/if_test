package if_test;

import java.util.Scanner;

public class Other {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("x좌표 입력 >>>");
//		int x=scan.nextInt();
//		System.out.println("y좌표 입력 >>>");
//		int y=scan.nextInt();
//		
//		if(x>=0) {
//			if(y>=0) {
//				System.out.println("x : "+x+"y : "+y+" 제 1 사분면");
//			}else {
//				System.out.println("x : "+x+"y : "+y+" 제 4 사분면");
//			}
//		}else {
//			if(y>=0) {
//				System.out.println("x : "+x+"y : "+y+" 제 2 사분면");
//			}else {
//				System.out.println("x : "+x+"y : "+y+" 제 3 사분면");
//			}
//		}
		
		
		
		
		
//		문제 7,8. 동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다. 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.
//		영식 요금제
//		민식 요금제
//		영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다. 
		//만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.60-89-30 90-119-40
//		민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다. 
		//만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
//		동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.
		
		System.out.println("이용할 시간(초) 입력 >>>");
		int seconde=scan.nextInt();
		
		int young=seconde/30;
		int min=seconde/60;
				
		int youngMoney;
		int minMoney;
		
		if(seconde<30||min<1) {
			++young;
			youngMoney=young*10;
			System.out.println(seconde+"기본요금"+youngMoney);
			++min;
			minMoney=min*15;
			System.out.println(seconde+"기본요금"+minMoney);
			if(youngMoney>minMoney) {
				System.out.println("영식 요금 : "+youngMoney+" 민식 요금 : "+minMoney+
						"민식 요금제가 더 효율적!");
			}else {
				System.out.println("영식 요금 : "+youngMoney+" 민식 요금 : "+minMoney+
						"영식 요금제가 더 효율적!");
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
				System.out.println("영식 요금 : "+youngMoney+" 민식 요금 : "+minMoney+
						"같은 요금!");
			}else {
				if(youngMoney>minMoney) {
					System.out.println("영식 요금 : "+youngMoney+" 민식 요금 : "+minMoney+
							"민식 요금제가 더 효율적!");
				}else {
					System.out.println("영식 요금 : "+youngMoney+" 민식 요금 : "+minMoney+
							"영식 요금제가 더 효율적!");
				}
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
