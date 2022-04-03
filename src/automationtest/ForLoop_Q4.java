package automationtest;

public class ForLoop_Q4 {
    //method to print name for no of times
    public void printMyName(String name, int howManyTime){
        for(int i=1;i<=howManyTime;i++){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj=new ForLoop_Q4();
        obj.printMyName("Harsha",10);
        System.out.println("___________________________________");
        obj.printMyName("Harsha",15);

    }
}
