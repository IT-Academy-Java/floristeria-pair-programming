package floristeria.domain;

public abstract class Producte {
    protected int preu;
    protected boolean isAArbre;
    protected boolean isAFlors;
    protected boolean isADecoracio;

    private static int nextuniqueID = 0;
    private int ID;

    public  Producte(){

    }

    public Producte(int preu) {
        this.preu = preu;
        nextuniqueID++;
        ID = nextuniqueID;
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

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", preu=" + preu;
    }
}




