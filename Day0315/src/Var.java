import java.util.Scanner;

//���방 - * - ����  - * + ���� , + + => + 
//���방 ���� -1 --> ��� 

public class Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("���방 ���ϱ�");
		int inputX =sc.nextInt();
		
		if(inputX>=0) {
			System.out.println("���");
			
		}
		else if(inputX<=0) {
			System.out.println ("����");
			if(inputX<0) {
				System.out.println("���밪"+inputX*-1);
				
			}
					
					
		}
		
		
		
//		int x =2; 
//		//Ȧ ¦ �Ǵ� 
//		if(x%2==0) {
//			System.out.println("�������� 0�̸� ¦��");
//			
//		}else if (x%2 !=0) {
//			System.out.println("Ȧ��");
//			
//		}
//		
//	}

}
}

