public class Main {
    /*
    This program generates a mad libbed story.
    Author: Igor
    Date: 6/17/2025
    */
    public static void main(String[] args){
        String name1 = "Igor";
        String name2 = "Rafaela";
        String adjective1 = "beaultiful";
        String adjective2 = "strong";
        String adjective3 = "sad";
        String noun1 = "dog";
        String noun2 = "house";
        String noun3 = "horse";
        String noun4 = "supermarket";
        String noun5 = "hospital";
        String noun6 = "love";
        String verb1 = "playing";
        String place1 = "Salvador";
        int number = 2;



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+"" +
                " day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+"" +
                " to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+
                " texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+
                ". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
