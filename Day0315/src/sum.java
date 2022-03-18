
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60, b=70 , c=80; 
		int d =50;
		int e= 30;
		
		
		int sum=0;
//		sum= sum+a;
//		sum = sum+b;
//		sum = sum+c;
//		sum = sum+d;
//		sum = sum+c;
//		sum = sum+d;
//		sum = sum+e;
//	누적 계산	
   sum=a+b+c+d+e;
   
   float avg = sum / 5; //int int -> int 
   //float avg = sum / 5; //int int -> int 
   //  sum/5.0f; int int ->int// int float -> float 
   System.out.printf("나 잘난의 총합계는 %d 평균은 %.1f 니다\n" , sum,avg);
   
		
	}

}
