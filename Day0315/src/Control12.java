import java.util.Scanner;

public class Control12 {
/*
else if (gender==3)
{
	System.out.println("����");
	
}
else if (gender==4){
	System.out.println("����");
}
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// gender % 2 == 0 ���� 
// gedner % 3 == 1 ���� 		
		
		//or (gender == 2 | gender==4) 
		//int gender =3;
		System.out.println("���� �Է�");
		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt();
		//gender 3�� ��� "���� " 
		//gender 4�� ��� "����" 
		System.out.println("Ű�� �Է��ϼ���");
		float height=sc.nextFloat();
		//float �� ���� ����ڿ��� �Է� ���� 
	
		
//		if (gender ==2 | gender ==4) {
//			System.out.println("����");
//		}
//		else if (gender==1| gender ==3 ) {
//			System.out.println("����");
//		}
					
	
		 else {
			 System.out.println("�߸��Է�");
		}
	}
}

