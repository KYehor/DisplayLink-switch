package ua.in.spilnasprava;
import java.util.Scanner;
import java.lang.String;

public class Dogs extends Animals {

    @Override

    public void name(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How u will call your dog?");
        while (!scan.hasNext("[a-zA-Z]+")) {
            System.out.println("Please use only letters.");
            scan.nextLine();
        }
            String animal = scan.nextLine();
            System.out.println("The name of your dog is:" + animal);

    }

    public void habits(){
        System.out.println("Dogs like walk and run,they too like to play.");
    }

    public void voice(){
        System.out.println("Gau");
    }
}
