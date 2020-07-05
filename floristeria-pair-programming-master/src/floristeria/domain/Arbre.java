package floristeria.domain;

public class Arbre extends Producte{

    private int height;

    public Arbre(){}

    public Arbre(int preu, int height) {
        super(preu);
        this.isAArbre = true;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Arbre{" + "preu=" + preu + " heigth=" + height +  '}' + "\n";
    }

}
