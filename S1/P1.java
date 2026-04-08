class Result {
    private int marks; 

    
    public Result(int marks) {
        this.marks = marks;
    }

    
    public int getMarks() {
        return marks;
    }

    
    void updateMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
        } else {
            System.out.println("Invalid marks!");
        }
    }
}


class Admin {
    public void modifyResult(Result r, int newMarks) {
        r.updateMarks(newMarks);
    }
}


public class Main {
    public static void main(String[] args) {

        Result r = new Result(70);

      
        System.out.println("Marks: " + r.getMarks());

        Admin admin = new Admin();
        admin.modifyResult(r, 95);

        System.out.println("Updated Marks: " + r.getMarks());


    }
}
