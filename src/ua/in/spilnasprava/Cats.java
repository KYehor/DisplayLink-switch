package ua.in.spilnasprava;
import java.util.Scanner;

public class Cats extends Animals implements Mew {

    @Override

    public void name(){
        /*XXX*/
        try {
            System.out.println("How u call your cat?");
            Scanner scat = new Scanner(System.in);
            String catName = scat.nextLine();
            System.out.println("The name of your cat is:" + catName);
        }catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public void habits(){
        System.out.println("Cats like to scratch a wallpaper and brush their body");
    }

    public void voice(){
        System.out.println("Meow");
    }

    public void meow(){}
}
