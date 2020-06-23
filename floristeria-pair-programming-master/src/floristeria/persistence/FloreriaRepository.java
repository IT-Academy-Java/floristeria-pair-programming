package floristeria.persistence;

import floristeria.domain.Producte;

import java.util.ArrayList;
import java.util.List;

public class  FloreriaRepository {

    //lista de todos los productos
    private static List<Producte> productes = new ArrayList<>();

    //Constructor de la lista
    public FloreriaRepository() {

    }

    //getter
    public List<Producte> getProducte() {

        return new ArrayList<>(productes);

    }

    //add 
    public void addProducte(Producte producte) throws Exception{

        if(producte == null) throw new Exception();
        productes.add(producte);

    }
}
