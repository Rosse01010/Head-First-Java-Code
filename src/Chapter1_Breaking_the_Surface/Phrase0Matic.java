package Chapter1_Breaking_the_Surface;

public class Phrase0Matic {
    public static void main (String[] args) {
    //mat three sets of words to choose from. Add your own!
        String[] wordListOne ={"24/7", "multiTer", "30,000 foot", "B-to-B", "win-win", "fronted", "web-based", "pervasive", "smart", "six-          sigma", "critical-path", "dynamic"};
        String[] wordListTwo ={"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-        the-box", "positined", "networ ked", "focused", "levareged", "aligned",};

        String[] wordListThree ={"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare",                "portal", "space", "vision", "paradigm", "mission"};
        //find out how to many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        //now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        //print out the phrase
        System.out.println("What we the need is a" + phrase);

    }

}
