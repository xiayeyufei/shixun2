package day3;

public class Test{
    int[] arr=new int[4];
    public void methodOne(){
        methodTwo();
        System.out.println("One");
    }
    public void methodTwo(){
        methodThree();
        System.out.println("Two");
    } 
    public void methodThree(){
        System.out.println(arr[3]);
        System.out.println("Three");
    }
      public static void main(String[] args){//Ö÷º¯Êý
          new Test().methodOne();
          System.out.println("main");
      }
     
}