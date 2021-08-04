package com.error.RandomIdeas;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class CommandHandler {

    private String commands = "\nCOMMANDS:\nexit           EXITS THE PROGRAM\nend            EXITS THE PROGRAM\nroll           ROLLS A NEW IDEA\n";

    public CommandHandler() throws IOException {
        boolean exit = false;

        Scanner reader = new Scanner(System.in);
        String command;

        while(!exit){
            command = reader.nextLine();
            if(command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("end")){
                exit = true;
            }else if(command.equalsIgnoreCase("roll")){
                System.out.println("\nGAME IDEA:\n" + IdeaGenerator.generateIdea() + "\n");
            }else if(command.equalsIgnoreCase("help")){
                System.out.println(commands);
            }
        }
        System.out.println("\nSHUTTING DOWN...");
        reader.close();
        System.exit(1);
    }
}
