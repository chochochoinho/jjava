import java.util.Scanner;

public class bbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		int num=0;
		int i=0;
		System.out.println("���� 1���� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		//int inputData=sc.nextint(); // int
		String str = sc.next(); // " " ���ڿ� , ' ' ���� 
		char ch = str.charAt(0); //'' ���� �ϳ�
		System.out.println((char)ch-32); 
		//97 -32 = 65< --A // 98-32=66<---B
		//INT - INT 
	//	System.out.println((char)ch-32); 
		

			
		
		
		
		
//		
//		for(i=0; i<7; i++) {
//		num++;
//		System.out.println("���� ���� "+num);
//	}
//			
		
	for (i = 0 ; i<2; i++) { //i =0 , 0<2 -> �� +i0 
		System.out.println("��"+i);
		for(j=0; j<3;j++) {
			System.out.println("�ƴϿ�"+j);
		}
	}
			
	}

}
