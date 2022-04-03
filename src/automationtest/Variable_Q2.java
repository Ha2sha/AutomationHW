package automationtest;

public class Variable_Q2 {
    //instance varibales
    int id;
    String name;
    //Parameterised Constructor
    public Variable_Q2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //method to display id & name
    public void display() {
        System.out.println(id + " - " + name);
    }
    //main method
    public static void main(String[] args) {
        Variable_Q2 obj1 = new Variable_Q2(101, "Harsha");
        obj1.display();
        Variable_Q2 obj2 = new Variable_Q2(102, "Prime");
        obj2.display();
    }
}
