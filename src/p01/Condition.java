package p01;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age = 10;
        boolean isEleven = age == 11;
      
        if(isEleven) {
    	  System.out.println("11살");
    	  
        }else if(age == 10) {
        	System.out.println("10살");
        }else {
    	  System.out.println("11살이 아니군");
      }
        
	}

}
