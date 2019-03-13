package ua.in.spilnasprava;
import java.util.Scanner;
import java.lang.String;

public class Animals {

    public void habits(){
        System.out.println("Animals can move and breath");
    }

    public void voice(){
        System.out.println("Voice");
    }

    public void name(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How u call your animal?");
        while (!scan.hasNext("[a-zA-Z]+")) {
            System.out.println("Please use only letters.");
            scan.next();
        }
            String animal = scan.next();
            System.out.println("The name of your animal is:" + animal);
    }
}
