package decision;

public class Cello extends MusicalInstr {
    public Cello(String name) {
        super(name);
    }
    public void Sound(){
        System.out.println("sound of Cello");
    }
    public String Show(){
        return getName();
    }
    public void Desc(){
        System.out.println("The stringed bow musical instrument of the bass and tenor register, known from the first half of the 16th century, is of the same structure as the violin or viola, but much larger. The cello has wide expressive capabilities and a carefully developed technique of performance, it is used as a solo, ensemble and orchestral instrument.");
    }
    public void History(){
        System.out.println("The appearance of the cello dates back to the beginning of the 16th century. Initially, it was used as a bass instrument to accompany singing or playing a higher register instrument. There were numerous varieties of cello, differing from each other in size, number of strings, system");
    }
}
