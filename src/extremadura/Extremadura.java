/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadura;

/**
 *
 * @author Usuario
 */
public class Extremadura {

    static Provincia[] provincias = new Provincia[2];

    public static void main(String[] args) {
        for (int i = 0; i < provincias.length; i = i + 1) {
            provincias[i] = new Provincia();
        }

        //Hasta aquí solo tenemos la estructura.
        //Vamos a meter unos datos de ejemplo para trabajar después con ejercicios
        provincias[0].setNombre("Badajoz");
        provincias[0].setExtension(20000);

        provincias[1].setNombre("Caceres");
        provincias[1].setExtension(10000);

        Localidad l;

        for (int j = 0; j < provincias[0].localidades.length; j++) {
            l = new Localidad(); //CREO UN POKEMON
            l.setNombre("castuera " + j);
            l.setExtension(2000 * j); //puntuación aleatoria, por ejemplo
            l.setHabitantes(50000 + j);
            provincias[0].addLocalidad(l); //añadimos el pokemon a la persona

            l = new Localidad(); //CREO UN POKEMON
            l.setNombre("valencia de alcantara " + j);
            l.setExtension(3000 + j); //puntuación aleatoria, por ejemplo
            l.setHabitantes(+ j);
            provincias[1].addLocalidad(l); //añadimos el pokemon a la persona

        }

        System.out.println("Primer ejercicio");

        //mostrar nombre de las provincias
        String provincia2;
        String provincia1;
        provincia1 = provincias[0].getNombre();
        provincia2 = provincias[1].getNombre();

        System.out.println(provincia1);
        System.out.println(provincia2);

        System.out.println("Segundo ejercicio");

        for (int i = 0; i < provincias.length; i++) {
            Localidad[] listap = provincias[i].getLocalidades();
            for (int x = 0; x < listap.length; x++) {

                System.out.println(listap[x].getNombre() + "(" + provincias[i].getNombre() + ")");

            }

        }
         System.out.println("tercer ejercicio");
         
         for (int i = 0; i < provincias.length; i++) {
            Localidad[] listap = provincias[i].getLocalidades();
            for (int x = 0; x < listap.length; x++) {

                System.out.println("el nombre de la localidades: "+listap[x].getNombre()+" el numero de habitante por esta localidad es: "+
                        listap[x].getHabitantes()+ "(" + provincias[i].getNombre() + ")");

            }

        }
        
        
        
        
    }
}
