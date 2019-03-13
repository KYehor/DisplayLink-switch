package ua.in.spilnasprava;
import java.util.Scanner;
import java.lang.String;

public class Cats extends Animals implements Mew {

    @Override

    public void name() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How u will call your cat?");
        while (!scan.hasNext("[A-Za-z]+")) {
            System.out.println("Please use only letters.");
            scan.next();
        }
        String animal = scan.next();
        System.out.println("The name of your cat is:" + animal);
    }

    public void habits(){
        System.out.println("Cats like to scratch a wallpaper and brush their body");
    }

    public void voice(){
        System.out.println("Meow");
    }

    public void meow(){}
}
