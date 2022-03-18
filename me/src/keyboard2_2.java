
import java.util.Scanner; //프로그램 첫준 클래스 선언보다 앞에 입력 
 

public class keyboard2_2 {
	public static void main(String[]args) {
		
		
		//두수의 정숫갑을 입력하면 사칙연산을 실행한후 결과를 표시
		
		
		Scanner stdIn =new Scanner(System.in); // 입력된 값을 얻는다 
		System.out.println("x와y의 사칙연산 시작 ");
		System.out.print("x의 값 : "); //x 값 요청
		 
		int x =stdIn.nextInt(); //x에 정숫값 입력 
		System.out.print("y의 값" );
		int y=stdIn.nextInt(); //Y 에 정숫값 입력
		
	System.out.println("x + y = " + (x+y));
	System.out.println("x-y = " + (x-y));
	System.out.println("x * y = " + (x * y));
	System.out.println("x / y = " + (x/y));
	
	
	//main 메소드의 첫 부분에 입력 System.in은 키보드와 연결된 표준 출력 스트림 
	//Stand input stream)
	//화면에 문자를 표시할떄 이용하는 System.out은 표준 출력 스트림 
	//키보드로 int형 정숫값을 입력하는 부분, 프로그램내의 stdln.nextInt()는 키보드에서 
	//입력반는 값 
	
	
		
		
	}
}
