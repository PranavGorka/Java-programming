public clas backAccount{
    
    static void withdraw(int amount, int balance){
        if (amount > balance){
            throw new ArithmeticException("insufficient balance");
        } else{
            balance = balance-amount;
            System.out.println("amount withdraw success");
        }
    }
    public static void main(String[] args){
        withdraw(1000, 100);
    }
}
