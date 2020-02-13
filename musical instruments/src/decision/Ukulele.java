package decision;

public class Ukulele extends MusicalInstr {
    public Ukulele(String name) {
        super(name);
    }
    public void Sound(){
        System.out.println("sound of Ukulele");
    }
    public String Show(){
        return getName();
    }
    public void Desc(){
        System.out.println("The shape of the body is guitar-shaped, there is still a form called \"pineapple\". Some or all of the strings may be double, sounding in unison or an octave.");
    }
    public void History(){
        System.out.println("The similarity of this musical instrument appeared in the middle of the XV century in Europe. Despite the fact that the production of stringed musical instruments was at a high level, relatively complex guitars and mandolins were quite expensive, especially for stray musicians.");
    }
}
