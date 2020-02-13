package decision;

public class Violin extends MusicalInstr{
    public Violin(String name) {
        super(name);
    }
    public void Sound(){
        System.out.println("sound of violin");
    }
    public String Show(){
        return getName();
    }
    public void Desc(){
        System.out.println("The game is based on a violin of bows, which is based on a wooden cane. Ponytail hair is pulled between the head and the shoe. The hair has keratin scales, between which rosin is impregnated (impregnated) with nature, it allows the hair to cling strings and make a sound.");
    }
    public void History(){
        System.out.println("The predecessors of the violin were the Arab rebab, the Spanish fidel, the British crotte, the merger of which formed the viola. Hence the Italian name for the violin violin, as well as the Slavic four-stringed instrument of the quinte structure of the jig (hence the German name for the violin is geige).");
    }
}
