package floristeria.view;

import floristeria.application.FloreriaController;
import floristeria.domain.Arbre;
import floristeria.domain.Decoracio;
import floristeria.domain.Floristeria;
import floristeria.domain.Flors;

public class Main {

    private static FloreriaController controller = new FloreriaController();

    public static void main(String[] args) throws Exception {

        controller.createArbre(20,30);
        controller.createArbre(10,50);
        controller.createArbre(70,30);

        controller.createFlors(20,"blue");
        controller.createFlors(40,"white");
        controller.createFlors(20,"red");

        controller.createDecoracio(20, "FUSTA");
        controller.createDecoracio(20, "PLASTIC");
        controller.createDecoracio(20, "FUSTA");

         System.out.println(controller.getAllProducte());
    }
}
