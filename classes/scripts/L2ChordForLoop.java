public class L2ChordForLoop {
    public static void main(String[] args) {
        String [] chords = {"A", "Am", "Am7", "Aadd9"};
        String [] notes = {"A C# E", "A B C", "A B C D", "A B C D E"};
        for(int i = 0; i < chords.length; i++) {
            System.out.println(chords[i] + ": " + notes[i]);
          }
    }
}