
public class trycatch {
	
	    public static void main(String args[ ]){
	       int i = 0;
	       String greetings[ ] = {"Hello World",
	                                       "Hello Dingdang",
	                                       "Hello Kitty"};
	      try{       
	          while(i<4){
	             System.out.println(greetings[i]);
	             i++;
	             
	          }
	      }catch(ArrayIndexOutOfBoundsException e){
	             System.out.println("����Խ���쳣");
	             e.printStackTrace();
	        }
	      }
	 }

