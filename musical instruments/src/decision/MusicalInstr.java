package decision;

abstract class MusicalInstr {
    private String name;

    public MusicalInstr(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void Sound();
    abstract String Show();
    abstract void Desc();
    abstract void History();
}
