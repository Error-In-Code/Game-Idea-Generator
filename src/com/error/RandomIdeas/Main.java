package com.error.RandomIdeas;

import java.util.Random;

public class Main {
    private Random random = new Random();
    public Main(){
        System.out.println(IdeaGenerator.generateIdea());
    }

    public static void main(String[] args){new Main();}
}


