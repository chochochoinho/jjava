import java.util.Scanner;

public class ex1 {
	public static void main(String[]args) {
		/*
		int gender=2;
			
		if (gender ==2) {
					System.out.println("여자");
	    if(gender ==3 ) {
	    	
	       System.out.println("남자");
	       		}
	 스코어가 68이다.
	 score가 60이상이면 합격
	 그렇지 않으면 불합격 
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 임렵 ");
		int jumsu = sc.nextInt();
		
	//	  int score1 =2; 
	   // int score=77;
	    if(jumsu >=90 ||jumsu >=80 ||jumsu >=70) { //90 ~100
	    	System.out.println("합격") ; 
	    } if (jumsu>=90) {
	    		 System.out.println("수");
	    }else  if(jumsu>=80) { 
	    			 System.out.println("우");
	    } else if(jumsu>=70) {		 	 
	    		 	System.out.println("미");
	    	 }
	    	 else 
	    	 { System.out.println("70 이하 불합격");
	    	    	 }
	       
	    	
	    	
	    }
	    	 }
	  
	    
	    
	    	
	    	
	    	
//	    	
//	    } if (score >=80) { // 0 89// 80  89//
//	    	System.out.println("우");
//	    	
//	    }else if (score >=70) // 0 79 미 
//	    {
//	    	System.out.println("합격");
//	    }else if (score <=60)
//	    {
//	    	System.out.println("불합격 ");
//	    	
//	    }
//		
//		System.out.println("종료");
//	
		
	

