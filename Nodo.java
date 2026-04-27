import java.util.ArrayList;
import java.util.List;

public class Nodo{
    String dato;
    List<Nodo>hijos;

    public Nodo(String dato){
      this.dato = dato ;
      this.hijos = new ArrayList<>(); // Inicializamos la lista de hijos
    }

    public void agregarHijo(Nodo hijo) {
        this.hijos.add(hijo);
    }
}