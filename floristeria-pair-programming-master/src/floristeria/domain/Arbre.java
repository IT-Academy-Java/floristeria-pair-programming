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
<<<<<<< HEAD

=======
>>>>>>> 4d2e6e2ee151ba09a3b3cf4f141dabc65abea1b2
}
