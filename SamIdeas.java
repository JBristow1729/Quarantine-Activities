import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SamIdeas implements Ideas {

    private Map<String, String> ideas = new HashMap<>();

    public void setIdeas(String k, String v) {
        this.ideas.put(k,v);
    }

    private ArrayList<String> getIdeasFromCategory(String category) {
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, String> idea : this.ideas.entrySet()) {
            if (idea.getValue().equalsIgnoreCase(category)) {
                result.add(idea.getKey());
            }
        }
        return result;
    }

    private ArrayList<String> getAllIdeas() {
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, String> idea : this.ideas.entrySet()) {
            result.add(idea.getKey());
        }
        return result;
    }

    public ArrayList<String> grab(String category) {
        // ***************************************
        // Insert ideas below in the following format:
        // setIdeas(<Idea>, <Category>);
        // for example:
        // setIdeas("Football", "Fitness");
        // ***************************************

        setIdeas("Sit-up challenge - fist one to 80!", "Fitness");
        setIdeas("Bake Off", "Food");
        setIdeas("Read a chapter from a book you're reading", "Culture");
        setIdeas("Play Asgaard's Wrath", "Gaming");
        setIdeas("Speed chess - no longer than 5 secs per move", "Gaming");
        setIdeas("Portraits - draw/paint/colour each other", "Culture");
        setIdeas("Pamper session", "Leisure");
        setIdeas("Blindfold tasting", "Food");
        setIdeas("Write a song", "Culture");
        setIdeas("Teach each other a new fact", "Education");
        setIdeas("Teach each other a new skill", "Education");
        setIdeas("Learn some Spanish", "Education");
        setIdeas("Learn numbers in Japanese", "Education");
        setIdeas("Write a horror short story", "Culture");
        setIdeas("Write a dystopian short story", "Culture");
        setIdeas("Have a debate - pick a subject and do for and against", "Culture");
        setIdeas("Make a workout for each other and try it out", "Fitness");
        setIdeas("Make an obstacle course and race each other", "Mystery");
        setIdeas("Both learn a new skill together", "Education");
        setIdeas("Who can do the plank for the longest?", "Fitness");
        setIdeas("Sam makes a treasure hunt for Jake", "Mystery");
        setIdeas("Jake makes a treasure hunt for Sam", "Mystery");
        setIdeas("Read a chapter from our own books", "Culture");
        setIdeas("Play Beatsaber", "Gaming");
        setIdeas("Each of us learn a new skill we've always wanted to learn and then recap on our progress", "Education");
        setIdeas("Watch a new TV series", "Culture");
        setIdeas("Makeover!", "Leisure");
        setIdeas("Who can wall-sit the longest?", "Fitness");
        setIdeas("Who can make the best mug cake?", "Food");
        setIdeas("Who can make the best cocktail with the ingredients in the flat?", "Food");
        setIdeas("Jake does 60 press-ups. Sam does 40 press ups", "Fitness");
        setIdeas("Squat challenge - 60 squats!", "Fitness");
        // ***************************************
        // Do not enter any ideas below this point
        // ***************************************
        ArrayList<String> result;
        if (category.equalsIgnoreCase("all")) {
            result = getAllIdeas();
        } else {
            result = getIdeasFromCategory(category);
        }
        return result;
    }
}