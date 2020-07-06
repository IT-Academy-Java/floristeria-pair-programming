package floristeria.domain;

public class Flors extends Producte{

    private String color;


    public Flors(int preu, String color) {
        super(preu);
        this.isAFlors = true;
        this.color = color;

    }

    @Override
    public String toString() {
        return super.toString() + ", color='" + color + '\'' + "\n";
    }
}
