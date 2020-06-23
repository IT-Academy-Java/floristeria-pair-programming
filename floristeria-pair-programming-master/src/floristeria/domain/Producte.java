package floristeria.domain;

public abstract class Producte {
    protected int id;
    protected int preu;

    private static int COUNTER = 1;


    public Producte(int preu) {

        this.preu = preu;
        this.id = COUNTER;
        COUNTER++;

    }
}




