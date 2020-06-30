package floristeria.domain;

public abstract class Producte {
    protected int id;
    protected int preu;
    protected boolean isAArbre;
    protected boolean isAFlors;
    protected boolean isADecoracio;

    private static int COUNTER = 1;

    public Producte(int preu) {

        this.preu = preu;
        this.id = COUNTER;
        COUNTER++;

    }

    public boolean isAArbre() {
        return isAArbre;
    }


    public boolean isAFlors() {
        return isAFlors;
    }


    public boolean isADecoracio() {
        return isADecoracio;
    }
}




