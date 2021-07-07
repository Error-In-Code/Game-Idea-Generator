import java.util.Random;

public class IdeaGenerator {
    private static Random random = new Random();

    private static String[] sentenceStart = {
            "A _GENRE_ where you play as _CHARACTER_ and have to defeat _ENEMY_",
            "A _GENRE_ where you play as _CHARACTER_ and must destroy all _OBJECT_s",
            "A _GENRE_ where you are _CHARACTER_ and are attached to a _OBJECT_",
            "A _GENRE_ in which you are hunting _CREATURE_s"};

    private static String[] genre = {"metroidvania", "platformer", "real-time strategy game", "life sim", "farming sim",
            "hunting sim", "traditional RPG", "horror game", "puzzle game", "roguelike", "beat-em-up"};

    private static String[] characters =  {"a ghost", "yourself but impossibly old", "a giant spider", "a mad scientist",
            "a young child", "an exterminator", "a police officer", "the universe itself", "an omnipotent being", "the richest man in the universe"};

    private static String[] objects = {"chair", "planet", "life-form", "house", "rock", "cloud"};

    private static String[] enemies = {"a huge turtle", "your own subconscious", "your brother", "a demon that was summoned by you", "a sentient bowling ball", "a clone of yourself", "the laws of physics"};

    private static String[] creatures =  {"spider", "flying horse", "living computer", "bee", "famous person"};

    public static String generateIdea(){
        String idea = replaceTags(sentenceStart[random.nextInt(sentenceStart.length)]);
        return idea;
    }

    private static String replaceTags(String prompt){
        String result = prompt;
        result = result.replace("_GENRE_", genre[random.nextInt(genre.length)]);
        result = result.replace("_CHARACTER_", characters[random.nextInt(characters.length)]);
        result = result.replace("_OBJECT_", objects[random.nextInt(objects.length)]);
        result = result.replace("_ENEMY_", enemies[random.nextInt(enemies.length)]);
        result = result.replace("_CREATURE_", creatures[random.nextInt(creatures.length)]);
        return result;
    }
}
