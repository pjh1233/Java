package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/01/03
 * 이름 : 박준혁
 * 내용 : 자바 조건문 실습하기 교재 p79
 */

public class Sub1_IfTest {
private static boolean num3;
 {
		// if문           제어문-조건문 반복문
		int num1 = 1;
		int num2 = 2;
		
		num3 = num1 > num2
		// 조건이 참일때 실행
			
		if(num1 > 1)
			
	    if(num1 > 0) {
	    	if(num2 >1); 
	    		
	    	}

		if(num1 > 0 && num2 > 1) {
			
		}
		// if ~ else
		static  num3 = 3;
		int num4 = 4;
		
		if(num3 > 4) {System.out.println("num3은 num4보다 크다");
			//조건이 참일때
		}
		else {System.out.println("num3은 num4보다 작다");
			//조건이 거짓일때
		}
		// if ~ else if ~ else
		if(num1 > num2) {
			System.out.println("num1은 num2보다 크다");
	   }else if(num2 > num3) {System.out.println("num2은 num3보다 크다");
	   }else if(num3 > num4) {System.out.println("num3은 num4보다 크다");
	   }else {System.out.println("num4가 가장 크다");
	   }
		
	   
	   
		// 확인문제
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력점수 : "+score);
		
		if(score >=90 && score <= 100) {
			System.out.println("A입니다");
		}else if(score >= 80 && score < 90) {
		    System.out.println("B입니다");	
		}else if(score >= 70 && score < 80) {
			System.out.println("C입니다");
		}else if(score >= 60 && score < 70) {
			System.out.println("D입니다");
		}
}
}


		
		
		
