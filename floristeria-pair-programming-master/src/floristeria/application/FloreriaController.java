package floristeria.application;

import floristeria.domain.*;
import floristeria.persistence.FloreriaRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FloreriaController {

    private FloreriaRepository  repository = new FloreriaRepository();
    private int arbreCounter;
    private int florsCounter;
    private int decoracioCounter;
    private Floristeria floristeria;

    //Empty constructor
    public FloreriaController() {

    }

    //Getters
    public int getArbreCounter() {
        return arbreCounter;
    }

    public int getFlorsCounter() {
        return florsCounter;
    }

    public int getDecoracioCounter() {
        return decoracioCounter;
    }

    public void createFloristeria(String name){
        this.floristeria = new Floristeria(name);
    }

    public void createArbre(int preu, int height) throws Exception{
        Arbre arbre = new Arbre (preu, height);
        repository.addProducte(arbre);
        arbreCounter++;
    }

    public void createFlors(int preu, String color) throws Exception{
        Flors flors = new Flors (preu, color);
        repository.addProducte(flors);
        florsCounter++;
    }

    public void createDecoracio(int preu, String typeMaterial) throws Exception{
        Decoracio decoracio = new Decoracio (preu, typeMaterial);
        repository.addProducte(decoracio);
        decoracioCounter++;
    }

    public List<Producte> getArbres(){
        List<Producte> productes = new ArrayList<>();
        Arbre arbre = new Arbre();

        Iterator it = repository.getProducte().iterator();
        while(it.hasNext()){
            arbre = (Arbre) it.next();
            if(arbre.isAArbre()){
                productes.add(arbre);
            }
        }
        return productes;
    }

    public List<Producte> getFlors(){
        List<Producte> productes = new ArrayList<>();
        Flors flor = new Flors();

        Iterator it = repository.getProducte().iterator();
        while(it.hasNext()){
            flor = (Flors) it.next();
            if(flor.isAFlors()){
                productes.add(flor);
            }
        }
        return productes;
    }

    public List<Producte> getDecoracions(){
        List<Producte> productes = new ArrayList<>();
        Decoracio decoracio = new Decoracio();

        Iterator it = repository.getProducte().iterator();
        while(it.hasNext()){
            decoracio = (Decoracio) it.next();
            if(decoracio.isADecoracio()){
                productes.add(decoracio);
            }
        }
        return productes;
    }


    //imprimir todos
    public String getAllProducte() {
        String resultsTrees = "";
        String resultsFlowers = "";
        String resultsDecoration = "";

        for (int i = 0; i < repository.getProducte().size(); i++) {
            if (repository.getProducte().get(i).isAArbre()) {
                resultsTrees += repository.getProducte().get(i).toString();
            } else if (repository.getProducte().get(i).isAFlors()) {
                resultsFlowers += repository.getProducte().get(i).toString();

            } else if (repository.getProducte().get(i).isADecoracio() == true) {
                resultsDecoration += repository.getProducte().get(i).toString();
            } else{
                System.out.println("Product Incorrect");
            }
        }

        return "ARBRES:\n" + resultsTrees + "\nFLORS:\n" + resultsFlowers + "\nDECORACIO:\n" + resultsDecoration;
    }
}
