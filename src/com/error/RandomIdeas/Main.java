package com.error.RandomIdeas;

import java.io.IOException;
import java.util.Random;

public class Main {

    private String startMessage = "Random Game Idea Generator v1.1\nCreated by Error-in-Code\nhttps://github.com/Error-in-Code\n\nType 'help' for commands\n";

    public Main() throws IOException {
        System.out.println(startMessage);
        new CommandHandler();
    }

    public static void main(String[] args) throws IOException{new Main();}
}


