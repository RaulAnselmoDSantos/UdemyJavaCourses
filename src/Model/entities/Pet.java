package Model.entities;

public class Pet {

    private final String name;
    private boolean clean = false;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
