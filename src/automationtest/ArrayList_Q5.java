package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        //Declaring ArrayList
        ArrayList<String> name=new ArrayList<>();

        //Adding elements to ArryList
        name.add("Scrum");
        name.add("Java");
        name.add("Jira");
        name.add("Selenium");
        name.add("Cucumber");
        name.add("Postman");
        name.add("Rest Assured");

        //for eah loop to print ArrayList Elements
        for (String i:name){
            System.out.println(i);
        }

    }
}
