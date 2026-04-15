import java.util.Scanner;

class invalidMarksException extends Exception{
    public invalidMarksException(String message){
        super(message)
    }
}

public class studentResult{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        try{
            for (int i =0;i<5 ;i++ ){
                System.out.println("enter marks of "+ i + "subject");
                int marks = sc.nextInt();
                
                if (marks < 0 || marks > 100 ){
                    throw new invalidMarksException("enter valid marks")
                }
                sum += marks;
                
            }
            double avg = sum / 5.0;
            System.out.println("average marks: +" avg);
        }catch(invalidMarksException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("error occured"));
        }
    }
}
