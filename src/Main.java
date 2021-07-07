import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private Random random = new Random();
    public Main(){
        System.out.println(IdeaGenerator.generateIdea());
    }

    public static void main(String[] args){new Main();}
}


