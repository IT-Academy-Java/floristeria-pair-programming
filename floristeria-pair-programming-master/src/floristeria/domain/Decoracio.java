package floristeria.domain;

public class Decoracio extends Producte{

    private enum TypeMaterial { FUSTA, PLASTIC };

    private String typeMaterial;
    private int count = -1;
    private int id = -1;

    public Decoracio(){}

    public Decoracio(int preu, String typeMaterial) {
        super(preu);
        this.isADecoracio = true;
        this.typeMaterial = typeMaterial;
    }


    @Override
    public String toString() {
        return super.toString() + ", typeMaterial='" + typeMaterial + '\'' + "\n";
    }
}
