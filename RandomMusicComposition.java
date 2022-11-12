import java.util.ArrayList;
import java.util.Random;

public class RandomMusicComposition {

    public static void main(String[] args) {
        int numberOfChords = 4;
        System.out.println("Random chords" + createChordProgression(numberOfChords));

    }

    public static ArrayList<String> createChordProgression(int numberOfChords) {

        ArrayList<String> chordProgression = new ArrayList<>(); //4 int per list

        for (int i = 0; i < numberOfChords; i++) {
            chordProgression.add(generateChord() + "\n");
        }
        return chordProgression;
    }

    public static String generateChord() {
        Random rand = new Random();
        int majorMinorSize = 2;
        int firstNoteMin = 1;
        int firstNoteMax = 7;
        int firstNote = (int) (Math.random()*(firstNoteMax+1)+firstNoteMin); //first note has range 1-7
        int secondNote = (int) (Math.random()*(firstNoteMax+1)+firstNote); //second note is bigger than the first
        int thirdNote = (int) (Math.random()*(firstNoteMax+1)+secondNote); //third note is bigger than the second

        return Integer.valueOf(firstNote).toString() + " "
                + Integer.valueOf(secondNote).toString() + " "
                + Integer.valueOf(thirdNote).toString() + " "
                + Integer.valueOf(rand.nextInt(majorMinorSize)).toString();
    }

}
