package ua.in.spilnasprava;
import java.lang.String;

public class Dogs extends Animals {

    String question = ("How u will call your dog? ");
    String answer = ("The name of your dog is: ");

    public void name() {
        super.question = this.question;
        super.answer = this.answer;
        super.name();
    }

    public void habits(){
        System.out.println("Dogs like walk and run,they too like to play.");
    }

    public void voice(){
        System.out.println("Gau");
    }
}
