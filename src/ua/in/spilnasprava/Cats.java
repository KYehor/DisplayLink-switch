package ua.in.spilnasprava;
import java.lang.String;

public class Cats extends Animals implements Mew {

    String question = ("How u will call your cat? ");
    String answer = ("The name of your cat is: ");

    public void name() {
        super.question = this.question;
        super.answer = this.answer;
        super.name();
    }

    public void habits(){
        System.out.println("Cats like to scratch a wallpaper and brush their body");
    }

    public void voice(){
        System.out.println("Meow");
    }

    public void meow(){}
}
