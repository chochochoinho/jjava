import java.util.Scanner;

public class Control12 {
/*
else if (gender==3)
{
	System.out.println("남자");
	
}
else if (gender==4){
	System.out.println("여자");
}
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// gender % 2 == 0 여자 
// gedner % 3 == 1 남자 		
		
		//or (gender == 2 | gender==4) 
		//int gender =3;
		System.out.println("점수 입력");
		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt();
		//gender 3인 경우 "남자 " 
		//gender 4인 경우 "여자" 
		System.out.println("키를 입력하세요");
		float height=sc.nextFloat();
		//float 의 값을 사용자에게 입력 받음 
	
		
//		if (gender ==2 | gender ==4) {
//			System.out.println("여자");
//		}
//		else if (gender==1| gender ==3 ) {
//			System.out.println("남자");
//		}
					
	
		 else {
			 System.out.println("잘못입력");
		}
	}
}

