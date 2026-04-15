import java.util.Scanner;

public class multipleCatchBlock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter num: ");
            String num = sc.nextLine();
            System.out.println("enter deno: ");
            String deno = sc.nextLine();

            int num1 = Integer.parseInt(num);
            int deno1 = Integer.parseInt(deno);

            int result = num1 / deno1;
            System.out.println("result" + result);
        }
        catch(NumberFormatException){
            System.out.println("enetr valid integer");
            
        }
        catch(ArithmeticException e){
            System.out.println(" annot divide by zero");
        }
        
        catch(Exception e){
            System.out.println(" invalid input");
        }

    }
}
