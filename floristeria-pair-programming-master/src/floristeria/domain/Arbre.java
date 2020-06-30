package floristeria.domain;

public class Arbre extends Producte{

    private int height;

    public Arbre(int preu, int height) {
        super(preu);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Arbre{" + "heigth=" + height +  '}';
    }

}
