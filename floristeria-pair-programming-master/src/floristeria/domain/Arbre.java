package floristeria.domain;

public class Arbre extends Producte{

    private int heigth;

    public Arbre(int preu, int heigth) {
        super(preu);
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Arbre{" + "heigth=" + heigth +  '}';
    }
>>>>>>> dev:floristeria-pair-programming-master/src/floristeria/domain/Arbre.java
}
