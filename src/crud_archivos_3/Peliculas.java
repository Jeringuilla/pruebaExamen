
package crud_archivos_3;

import java.io.PrintWriter;

public class Peliculas {
    private String nombre;
    private String genero;
    private String director;
    private int año;
    
    public Peliculas(String nombre,String genero,String director,int año){
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void guardar(PrintWriter escribir){
        escribir.println(nombre);
        escribir.println(genero);
        escribir.println(director);
        escribir.println(año);
    }
}
