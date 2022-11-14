import java.util.ArrayList;

public class RandomMusicComposition {

    public static void main(String[] args) {
        final int NUMBEROFCORDS = 4;
        System.out.println("Random chords" + createChordProgression(NUMBEROFCORDS));

    }

    public static ArrayList<String> createChordProgression(int numberOfChords) {

        ArrayList<String> chordProgression = new ArrayList<>(); //4 int per list

        for (int i = 0; i < numberOfChords; i++) {
            chordProgression.add(generateChord() + "\n");
        }
        return chordProgression;
    }

    public static String generateChord() {
        int maxNote = 7;
        int minNote = 1;
        int firstNote = (int) (Math.random()*(maxNote - minNote)+minNote); //first note has range 1-7

        int secondNote = (int) (Math.random()*(maxNote - minNote)+minNote); //second note is bigger than the first
        while(firstNote == secondNote){
            secondNote = (int) (Math.random()*(maxNote - minNote)+minNote); //second note is bigger than the first
        }
        int thirdNote = (int) (Math.random()*(maxNote - minNote)+minNote); //third note is bigger than the second

        while(firstNote == thirdNote || thirdNote == secondNote){
            thirdNote = (int) (Math.random()*(maxNote - minNote)+minNote); //second note is bigger than the first
        }

        String fNote = mapNote(firstNote);
        String sNote = mapNote(secondNote);
        String tNote = mapNote(thirdNote);

        return fNote + " " + sNote + " " + tNote + " ";
    }

    public static String mapNote(int note) {
        String strNote = "";
        if (note == 1)
            return "A";
        if (note == 2)
            return "B";
        if (note == 3)
            return "C";
        if (note == 4)
            return "D";
        if (note == 5)
            return "E";
        if (note == 6)
            return "F";
        if (note == 0)
            return "G";

        return strNote;
    }

}
