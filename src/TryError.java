import java.util.Scanner;
 
public class TryError {
 
    /*
     * 1����дӦ�ó��򣬴������д���������������Ϊ�����ͱ������� Ҫ������в���NumberFormatException
     * �쳣��ArithmeticException �쳣��������������������£������Ǳ�ִ�С���仰�����ڿ���̨�����
     */
    public TryError() {
    }
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("please enter the first Number");
 
        String string1 = scanner.next();
 
        System.out.println("please enter the second Number");
 
        String string2 = scanner.next();
 
        int num1, num2;
 
        try {
            num1 = Integer.parseInt(string1);
            num2 = Integer.parseInt(string2);
            System.out.println(num1 / num2);
        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("alaways doing ....");
        }
    }
}