package ua.in.spilnasprava;
import java.util.Scanner;
import java.lang.String;

public class Animals {

    String question = ("How u will call your animal? ");
    String answer = ("The name of your animal is: ");

    public void habits(){
        System.out.println("Animals can move and breath");
    }

    public void voice(){
        System.out.println("Voice");
    }

    public void name(){
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNext("[a-zA-Z]+")) {
            System.out.println("Please use only letters.");
            scan.nextLine();
        }
            String animal = scan.nextLine();
            System.out.println(answer + animal);
    }

}
