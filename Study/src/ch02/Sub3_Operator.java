package ch02;

/*
 * 날짜 : 2022/01/03
 * 이름 : 박준혁
 * 내용 : 자바 연산자 실습하기 교재 p52
 */
public class Sub3_Operator {


	public static void main(String[] args) {
		
		//산술연산자
        int num1 = 1;
        int num2 = 2;               
        int num3 = 3;               
        int num4 = 4;
        
        int rs1 = num1 + num2;
        int rs2 = num1 - num2;	   
        int rs3 = num2 * num3;	   
        int rs4 = num4 / num3;    //나머지
        
        //증감, 감소연산자
        int num = 0;
        
        num++;
        ++num;
        
        num--;
        --num;
        
        //복합대입연산자
        int n1 =1, n2 = 2, n3 = 3, n4 = 4, n5 = 5;
        
        n1 += 1; // n1 = n1 + 1
        n2 -= 2; // n2 = n2 - 2
        n3 *= 3; // n3 = n3 * 3
        n4 /= 4; // n4 = n4 / 4
        n5 %= 5; // n5 = n5
        
        //비교연산자
        int var1 = 1;
        int var2 = 2;
        
        boolean r1 = var1 >  var2 ; // var1이 var2보다 크다.
        boolean r2 = var1 <  var2 ; // var1이 var2보다 작다.
        boolean r3 = var1 >= var2 ; // var1이 var2보다 크거나 같다.
        boolean r4 = var1 <= var2 ; // var1이 var2보다 작거나 같다.
        boolean r5 = var1 == var2 ; // var1이 var2보다 서로 같다.
        boolean r6 = var1 != var2 ; // var1이 var2보다 서로 다르다.
       
        //논리연산자
        
        int var3 = 3;
        int var4 = 4;
        
        boolean res1 = var3 > 2 && var4 > 3;  //3이 2보다 크고 4가 3보다 크다 T T 1
        boolean res2 = var3 > 2 && var4 > 4;  //3이 2보다 크고 4가 4보다 크다 T F 0
        boolean res3 = var3 > 2 || var4 > 4;  //3이 2보다 크거나 4가 4보다 크다 T F 1
        boolean res4 = var3 > 4 || var4 > 5;  //3이 4보다 크거나 4가 5보다 크다 F F 0
        boolean res5 = !(var3 > 4);            //3이 4보다 크지 않다 T 1
        
        
		
	}

}
               
               