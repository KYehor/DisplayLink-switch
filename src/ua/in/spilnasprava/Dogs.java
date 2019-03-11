package ua.in.spilnasprava;
import java.util.Scanner;

public class Dogs extends Animals {

    @Override

    public void name(){
        /*XXX*/
        try {
            System.out.println("How u call your dog?");
            Scanner sdog = new Scanner(System.in);
            String dogName = sdog.nextLine();
            System.out.println("The name of your dog is:" + dogName);
        }catch (Exception exception){
            System.out.println("Something went wrong.");
        }
    }

    public void habits(){
        System.out.println("Dogs like walk and run,they too like to play.");
    }

    public void voice(){
        System.out.println("Gau");
    }
}
