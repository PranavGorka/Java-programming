public class arrayCheck{
    public static void main(String[] args){

        try{
            int[] list = {1,2,3,4,5};

            System.out.println("accesing element at index 8: " + list[8]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(" acannot acces element");
        }
    

    }
}
