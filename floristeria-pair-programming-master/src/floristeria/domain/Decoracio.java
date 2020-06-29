package floristeria.domain;

public class Decoracio extends Producte{
    private enum TypeMaterial { FUSTA, PLASTIC };

    private String typeMaterial;

    public Decoracio(int preu, String typeMaterial) {
        super(preu);
        this.typeMaterial = typeMaterial;
    }

    @Override
    public String toString() {
        return "Decoracio{" + "typeMaterial='" + typeMaterial + '\'' + '}';
    }
}
