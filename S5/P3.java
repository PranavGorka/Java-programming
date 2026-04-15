import java.util.Scanner;

public class numberCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter num: ");
        String num = sc.nextLine();

        try{
            int number = Integer.parseInt(num);
            System.out.println("number: "+ number);
        }catch(NumberFormatException e){
            System.out.println(" enter an integer value");
        }
        
    }
}
