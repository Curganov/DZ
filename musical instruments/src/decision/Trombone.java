package decision;

public class Trombone extends MusicalInstr {
    public Trombone(String name) {
        super(name);
    }
    public void Sound(){
        System.out.println("sound of Trombone");
    }
    public String Show(){
        return getName();
    }
    public void Desc(){
        System.out.println("European wind ear-pads. Included in the orchestral group of brass wind musical instruments bass-tenor register.");
    }
    public void History(){
        System.out.println("The appearance of trombone dates back to the 15th century. It is generally believed that the immediate predecessors of this instrument were rocker tubes, when playing on which the musician had the opportunity to move the instrument's tube, thus obtaining a chromatic scale. Such trumpets were used to double the voices of the church choir, given the similarity of the trumpet timbre with the human voice. It was only necessary to achieve the similarity of intonation, for which they did a backstage, giving chromatism and vibrato");
    }
}
