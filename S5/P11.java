public class nestedExample{
    public static void main(String[] args){
        
        System.out.println("outer try");
        try{
            try{
                System.out.println("inner try");
                
                int num = 10/0;
            }catch(ArithmeticException e){
                System.out.println("can not divide by zero");
            }
            
            int[] list = {1,2,3,4};
            int num = list[8];
        }catch(IndexOutOfBoundsException e){
            System.out.println("index out of range");
        }
        System.out.println("continue........");
    }
}
