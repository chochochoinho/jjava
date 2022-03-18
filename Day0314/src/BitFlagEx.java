
public class BitFlagEx {
	public static void main(String[]args) {
		//0b는 이진수
		//bit 연산자를 이용한 다중플래그 처리 
		//1byte 연산 
		//toBinaryString 2진수의 값으로 
		// 
		byte flag1 = 0b00000001; //1 
		byte flag2 = 0b00000010;//2 
		byte flag3 = 0b00000100; //4 
		byte flag4 = 0b00001000; //8 
		
		byte result= 0b00000000; //0 
		//
		result = (byte)(result|flag1);
		System.out.println(Integer.toBinaryString(result));
		
		
		result = (byte)(result|flag2);
		System.out.println(Integer.toBinaryString(result));
		
		
		result = (byte)(result|flag3);
		System.out.println(Integer.toBinaryString(result));
		
	//	값을 off 한다 
		result = (byte)(result & ~ flag1); 
		//result = (byte)(result $ ~ flag1 );
		System.out.println(Integer.toBinaryString(result));
		
	
		//단항 이항(삼 비교 논리 ) 대
	}
}
