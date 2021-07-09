package com.error.RandomIdeas;

import java.util.Random;

public class IdeaGenerator {
    private static Random random = new Random();

    private static String[] sentenceStart = {
            "A _GENRE_ where you play as _CHARACTER_ and have to defeat _ENEMY_",
            "A _GENRE_ where you play as _CHARACTER_ and must destroy all _OBJECT_s",
            "A _GENRE_ where you are _CHARACTER_ and are attached to a _OBJECT_",
            "A _GENRE_ in which you are hunting _CREATURE_s",
            "A _GENRE_ in which you are the last _CREATURE_ and must save your species by defeating _ENEMY_"};

    private static String[][] ideaComponents = {
            {"metroidvania", "platformer", "real-time strategy game", "life sim", "farming sim",
                    "traditional RPG", "horror game", "puzzle game", "roguelike", "beat-em-up",
                    "_GENRE_"},
            {"a ghost", "yourself but impossibly old", "a giant spider", "a mad scientist", "a young child",
                    "an exterminator", "a police officer", "the universe itself", "an omnipotent being",
                    "the richest man in the universe",
                    "_CHARACTER_"},
            {"chair", "planet", "life-form", "house", "rock", "cloud",
                    "_OBJECT_"},
            {"a huge turtle", "your own subconscious", "your brother", "a demon that was summoned by you",
                    "a sentient bowling ball", "a clone of yourself", "the laws of physics",
                    "_ENEMY_"},
            {"spider", "flying horse", "living computer", "bee",
            "_CREATURE_"}
    };

    public static String generateIdea(){
        String idea = replaceTags(sentenceStart[random.nextInt(sentenceStart.length)]);
        return idea;
    }

    private static String replaceTags(String prompt){
        String result = prompt;
        for(int i = 0; i < ideaComponents.length; i++){
            result = result.replace(ideaComponents[i][ideaComponents[i].length - 1], ideaComponents[i][random.nextInt(ideaComponents[i].length - 1)]);
        }
        return result;
    }
}
