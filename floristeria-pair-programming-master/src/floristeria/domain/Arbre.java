package floristeria.domain;

public class Arbre extends Producte{

    private int height;
    private int count = -1;
    private int id = -1;

    public Arbre(){}

    public Arbre(int preu, int height) {
        super(preu);
        this.isAArbre = true;
        this.height = height;
        this.count++;
        this.id = this.count;
    }

    @Override
    public String toString() {
        return super.toString() + ", height=" + height + "\n";
    }
}
