import java.util.Scanner;

public class bbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		int num=0;
		int i=0;
		System.out.println("문자 1개를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		//int inputData=sc.nextint(); // int
		String str = sc.next(); // " " 문자열 , ' ' 문자 
		char ch = str.charAt(0); //'' 문자 하나
		System.out.println((char)ch-32); 
		//97 -32 = 65< --A // 98-32=66<---B
		//INT - INT 
	//	System.out.println((char)ch-32); 
		

			
		
		
		
		
//		
//		for(i=0; i<7; i++) {
//		num++;
//		System.out.println("알의 개수 "+num);
//	}
//			
		
	for (i = 0 ; i<2; i++) { //i =0 , 0<2 -> 예 +i0 
		System.out.println("예"+i);
		for(j=0; j<3;j++) {
			System.out.println("아니오"+j);
		}
	}
			
	}

}
