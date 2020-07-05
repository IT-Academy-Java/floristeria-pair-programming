package floristeria.domain;

public class Decoracio extends Producte{

    private enum TypeMaterial { FUSTA, PLASTIC };

    private String typeMaterial;

    public Decoracio(){}

    public Decoracio(int preu, String typeMaterial) {
        super(preu);
        this.isADecoracio = true;
        this.typeMaterial = typeMaterial;
    }

    @Override
    public String toString() {
        return "Decoracio{" + "preu=" + preu + " typeMaterial='" + typeMaterial + '\'' + '}' + "\n";
    }

}
