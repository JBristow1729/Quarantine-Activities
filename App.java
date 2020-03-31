import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<String> allIdeas = new ArrayList<>();

    private void setCategories() {
        this.categories.add("Gaming");
        this.categories.add("Food");
        this.categories.add("Fitness");
        this.categories.add("Education");
        this.categories.add("Mystery");
        this.categories.add("Culture");
        this.categories.add("Leisure");
        this.categories.add("Other");
    }

    private ArrayList<String> getCategories() {
        setCategories();
        return this.categories;
    }

    private void displayOptions() {
        System.out.println("* Welcome to the Quarantine Activity decider!\n*\n* Choose a number from the following options:\n*");
        System.out.println("* 1. All Categories");
        int count = 2;
        ArrayList<String> cats = getCategories();
        for (String category : cats) {
            System.out.println("* " + count + ". " + category);
            count ++;
        }
        System.out.print("*\n ");
    }

    private void displayError() {
        String error = "* Please enter a valid number!";
        System.out.println(error);
    }

    private int getResponse(Scanner s) {
        boolean valid = false;
        int response = 0;
        while (!valid) {
            if (s.hasNextInt()) {
                response = s.nextInt();
                if (response < 1 || response > (categories.size()+1)){
                    displayError();
                    s.nextLine();
                } else {
                    valid = true;
                }
            } else {
                displayError();
                s.nextLine();
            }
        }
        return response;
    }

    private int presentOptions(Scanner s) {
        displayOptions();
        return getResponse(s);
    }

    private String getCategory(int response) {
        // Account for first option and index of ArrayLists
        response -= 2;
        return this.categories.get(response);
    }

    private void grabIdeas(Ideas i, String category) {
        ArrayList<String> ideas;
        ideas = i.grab(category);
        this.allIdeas.addAll(ideas);
    }

    private void displayResult(int response) {
        JakeIdeas ji = new JakeIdeas();
        SamIdeas si = new SamIdeas();
        String category;
        if (response != 1) {
            category = getCategory(response);
        } else {
            category = "all";
        }
        grabIdeas(ji, category);
        grabIdeas(si, category);
        System.out.print("\n* Here is your activity:\n* ");
        Random rand = new Random();
        String activity = this.allIdeas.get(rand.nextInt(this.allIdeas.size()));
        System.out.println(activity);
    }

    public void run(Scanner s) {
        int response = presentOptions(s);
        displayResult(response);
    }

}