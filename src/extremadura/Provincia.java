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
public class Provincia {
    String nombre;
    double extension;
    int numLocalidad=0;
    
    
    Localidad[] localidades=new Localidad[300];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public Localidad[] getLocalidades() {
        return localidades;
    }

    public void setLocalidades(Localidad[] localidades) {
        this.localidades = localidades;
    }

    void addLocalidad(Localidad l) {
     if (this.numLocalidad < localidades.length) {
            this.localidades[this.numLocalidad] = l;
            this.numLocalidad++;
        }    
    }
    
}
