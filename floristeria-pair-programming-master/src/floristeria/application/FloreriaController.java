package floristeria.application;

import floristeria.domain.Arbre;
import floristeria.domain.Decoracio;
import floristeria.domain.Flors;
import floristeria.persistence.FloreriaRepository;

public class FloreriaController {

    private FloreriaRepository  repository = new FloreriaRepository();
    private int arbreCounter;
    private int florsCounter;
    private int decoracioCounter;


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


    //imprimir todos
    public String getAllProducte() {

        String results="";

            results += "TREES:\n";
            for (int i = 0; i < repository.getProducte().size(); i++) {

                if (repository.getProducte().get(i).isAArbre() == true) {

                    results += repository.getProducte().get(i).toString();
                }
            }

            results += "FLOWERS:\n";
            for (int i = 0; i < repository.getProducte().size(); i++) {

                if (repository.getProducte().get(i).isAFlors() == true) {

                    results += repository.getProducte().get(i).toString();

                }
            }

            results += "DECORATION:\n";
            for (int i = 0; i < repository.getProducte().size(); i++) {

                if (repository.getProducte().get(i).isADecoracio() == true) {

                    results += repository.getProducte().get(i).toString();

                }
            }

        return results;

    }
}
