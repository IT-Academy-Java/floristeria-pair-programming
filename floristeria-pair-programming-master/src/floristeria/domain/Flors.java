package floristeria.domain;

public class Flors extends Producte{

    private String color;

    public Flors(int preu, String color) {
        super(preu);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flors{" + "color='" + color + '\'' + '}';
    }
}
