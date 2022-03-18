package eaxample;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	++j 전위형 , j++ 후위형 
		int i=5, j=5;

	//	System.out.println("i의 값을 i++하면 "+i++);
		
//		System.out.println("a"+i);   
	//	System.out.println("b"+(++i)); 
		
	//	System.out.println(++i); //i=i+1; 
//		System.out.println(i++); /
		
	//	System.out.println(i);
	
		//	System.out.println(+i);
	
		
		//System.out.println(j--); //j=j-1;
		System.out.println(--j);
			
		System.out.println(j);
		
		System.out.println(i+ "+" +j);
		System.out.println("i = " +i + ", j=" +j);
		System.out.println("i = " +(++i) + ", j=" +j);
		//Systme.out.println("i","j");
		System.out.println("i = " +(i++) + " j=" +j); //증가안함
	
		
		
		//System.out.println(i = "+" +j);
		
		/*
		++x x++의 차이점
		++x 는 x 의 값을 증가시키고 나서 x를 반환
	x++ 는 x의 값을 바노한하고 나서 x의 값을 증가 
		System.out.prinln("j=i++; 실행후, i=" +i+ " , j="+j); 
	
		/	System.out.prinln("J=++i; 실행후 , i= " +i+" , j="+j);
			*/
		
	}

}
