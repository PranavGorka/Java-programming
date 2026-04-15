class invalidPasswordException extends Exception{
    public invalidPasswordException(String message){
        super(message)
    }
}

public class passwordCheck{
    public static void main(String[] args){
        
        String pass = "avb6";
        
        try{
            if (pass.length() < 8 || !pass.matches(".*\\d.*")){
                throw new invalidPasswordException("invalid password");
            }
            System.out.println("valid password");
        }catch(invalidPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
