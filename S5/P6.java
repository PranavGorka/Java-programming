public class finallyExample{
    public static void main(String[] args){
       try{
            int number = 10/0
            System.out.println("number: "+ number);
        }catch(Exception e){
            System.out.println(" error occured");
        }finally{
            System.out.println("finally block executed");
        }
        
    }
}
