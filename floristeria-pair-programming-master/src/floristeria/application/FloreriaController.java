package floristeria.application;

import floristeria.domain.*;
import floristeria.persistence.FloreriaRepository;

import java.util.ArrayList;
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

    public void deleteProducte(int idProductToDelete) throws Exception {
        for (int i = 0; i < repository.getProductes().size(); i++) {
            if (repository.getProductes().get(i).getID() == idProductToDelete) {
                repository.deleteProducte(i);
                return;
            }
        }
    }

    public List<Producte> getArbres(){
        List<Producte> productes = new ArrayList<>();
        for (int i = 0; i < repository.getProductes().size(); i++) {
            if (repository.getProductes().get(i).isAArbre()) {
                productes.add(repository.getProductes().get(i));
            }
        }
        return productes;
    }

    public List<Producte> getFlors(){
        List<Producte> productes = new ArrayList<>();
        for (int i = 0; i < repository.getProductes().size(); i++) {
            if (repository.getProductes().get(i).isAFlors()) {
                productes.add(repository.getProductes().get(i));
            }
        }
        return productes;
    }

    public List<Producte> getDecoracions(){
        List<Producte> productes = new ArrayList<>();
        for (int i = 0; i < repository.getProductes().size(); i++) {
            if (repository.getProductes().get(i).isADecoracio()) {
                productes.add(repository.getProductes().get(i));
            }
        }
        return productes;
    }


    //imprimir todos
    public String getAllProducte() {
        String resultsTrees = "";
        String resultsFlowers = "";
        String resultsDecoration = "";

        for (int i = 0; i < repository.getProductes().size(); i++) {
            if (repository.getProductes().get(i).isAArbre()) {
                resultsTrees += repository.getProductes().get(i).toString();
            } else if (repository.getProductes().get(i).isAFlors()) {
                resultsFlowers += repository.getProductes().get(i).toString();

            } else if (repository.getProductes().get(i).isADecoracio() == true) {
                resultsDecoration += repository.getProductes().get(i).toString();
            } else{
                System.out.println("Product Incorrect");
            }
        }

        return "ARBRES:\n" + resultsTrees + "\nFLORS:\n" + resultsFlowers + "\nDECORACIO:\n" + resultsDecoration;
    }
}
