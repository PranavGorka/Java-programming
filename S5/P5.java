import java.io.FileReader;
import java.io.IOException;

public class Filereaderexample{
    public static void main(String[] args){
        try(FileReader file = new FileReader("data.txt")){
            System.out.println("file open succesfully");
        }
        catch(IOException e){
            System.out.println("file not found..");
            
        }
    }
}
