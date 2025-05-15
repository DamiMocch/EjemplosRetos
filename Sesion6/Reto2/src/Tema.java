import java.util.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public  Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Orden natural:  Ordenar los temas por nombre (alfabético) y por prioridad (orden ascendente).
    @Override
    public int compareTo(Tema otra){
        return this.titulo.compareTo(otra.titulo);
    }

    @Override
    public String toString(){
        return "Tema: " + titulo + '\'' + ", prioridad: " + prioridad + '}';
    }

}

