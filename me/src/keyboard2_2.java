
import java.util.Scanner; //���α׷� ù�� Ŭ���� ���𺸴� �տ� �Է� 
 

public class keyboard2_2 {
	public static void main(String[]args) {
		
		
		//�μ��� �������� �Է��ϸ� ��Ģ������ �������� ����� ǥ��
		
		
		Scanner stdIn =new Scanner(System.in); // �Էµ� ���� ��´� 
		System.out.println("x��y�� ��Ģ���� ���� ");
		System.out.print("x�� �� : "); //x �� ��û
		 
		int x =stdIn.nextInt(); //x�� ������ �Է� 
		System.out.print("y�� ��" );
		int y=stdIn.nextInt(); //Y �� ������ �Է�
		
	System.out.println("x + y = " + (x+y));
	System.out.println("x-y = " + (x-y));
	System.out.println("x * y = " + (x * y));
	System.out.println("x / y = " + (x/y));
	
	
	//main �޼ҵ��� ù �κп� �Է� System.in�� Ű����� ����� ǥ�� ��� ��Ʈ�� 
	//Stand input stream)
	//ȭ�鿡 ���ڸ� ǥ���ҋ� �̿��ϴ� System.out�� ǥ�� ��� ��Ʈ�� 
	//Ű����� int�� �������� �Է��ϴ� �κ�, ���α׷����� stdln.nextInt()�� Ű���忡�� 
	//�Է¹ݴ� �� 
	
	
		
		
	}
}
