import java.util.Scanner;

public class division{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter num: ");
            int num = sc.nextInt();
            System.out.println("enter deno: ");
            int deno = sc.nextInt();

            int result = num / deno;
            System.out.println("result" + result);
        }
        catch(ArithmeticException e){
            System.out.println(" annot divide by zero");
        }
        
        catch(Exception e){
            System.out.println(" invalid input");
        }

    }
}
