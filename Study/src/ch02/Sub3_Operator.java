package ch02;

/*
 * ��¥ : 2022/01/03
 * �̸� : ������
 * ���� : �ڹ� ������ �ǽ��ϱ� ���� p52
 */
public class Sub3_Operator {


	public static void main(String[] args) {
		
		//���������
        int num1 = 1;
        int num2 = 2;               
        int num3 = 3;               
        int num4 = 4;
        
        int rs1 = num1 + num2;
        int rs2 = num1 - num2;	   
        int rs3 = num2 * num3;	   
        int rs4 = num4 / num3;    //������
        
        //����, ���ҿ�����
        int num = 0;
        
        num++;
        ++num;
        
        num--;
        --num;
        
        //���մ��Կ�����
        int n1 =1, n2 = 2, n3 = 3, n4 = 4, n5 = 5;
        
        n1 += 1; // n1 = n1 + 1
        n2 -= 2; // n2 = n2 - 2
        n3 *= 3; // n3 = n3 * 3
        n4 /= 4; // n4 = n4 / 4
        n5 %= 5; // n5 = n5
        
        //�񱳿�����
        int var1 = 1;
        int var2 = 2;
        
        boolean r1 = var1 >  var2 ; // var1�� var2���� ũ��.
        boolean r2 = var1 <  var2 ; // var1�� var2���� �۴�.
        boolean r3 = var1 >= var2 ; // var1�� var2���� ũ�ų� ����.
        boolean r4 = var1 <= var2 ; // var1�� var2���� �۰ų� ����.
        boolean r5 = var1 == var2 ; // var1�� var2���� ���� ����.
        boolean r6 = var1 != var2 ; // var1�� var2���� ���� �ٸ���.
       
        //��������
        
        int var3 = 3;
        int var4 = 4;
        
        boolean res1 = var3 > 2 && var4 > 3;  //3�� 2���� ũ�� 4�� 3���� ũ�� T T 1
        boolean res2 = var3 > 2 && var4 > 4;  //3�� 2���� ũ�� 4�� 4���� ũ�� T F 0
        boolean res3 = var3 > 2 || var4 > 4;  //3�� 2���� ũ�ų� 4�� 4���� ũ�� T F 1
        boolean res4 = var3 > 4 || var4 > 5;  //3�� 4���� ũ�ų� 4�� 5���� ũ�� F F 0
        boolean res5 = !(var3 > 4);            //3�� 4���� ũ�� �ʴ� T 1
        
        
		
	}

}
               
               