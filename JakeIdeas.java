import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JakeIdeas implements Ideas {

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

        setIdeas("Piano","Education");
        setIdeas("Blind Baking", "Food");
        setIdeas("Play Mario Party", "Gaming");
        setIdeas("VR Pictionary", "Gaming");
        setIdeas("Paper airplane competition", "Mystery");
        setIdeas("Debate a topic", "Education");
        setIdeas("Paint/Draw", "Leisure");
        setIdeas("Play Animal Crossing together", "Gaming");
        setIdeas("Planking competition", "Fitness");
        setIdeas("Take turns playing Splatoon", "Gaming");
        setIdeas("Mario Kart", "Gaming");
        setIdeas("Plan a week's holiday", "Culture");
        setIdeas("Explore new recipes and add them to the mealprep", "Food");
        setIdeas("Pressups / Tricep dips", "Fitness");
        setIdeas("Squats / Lunges", "Fitness");
        setIdeas("Slime Rancher", "Gaming");
        setIdeas("Find a new series on Netflix / Amazon Prime", "Leisure");
        setIdeas("Write a short story", "Leisure");
        setIdeas("Chess", "Leisure");
        setIdeas("Diddy Kong Racing", "Gaming");
        setIdeas("Pokemon Party Games", "Gaming");
        setIdeas("Learn a new song together", "Education");

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