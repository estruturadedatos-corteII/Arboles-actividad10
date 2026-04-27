public class Arbol {
    Nodo raiz;

    public Arbol(String valorRaiz) {
        this.raiz = new Nodo(valorRaiz);
    }

    // Calcula la Altura del árbol
    public int getAltura(Nodo actual) {
        if (actual.hijos.isEmpty()) return 0;
        int max = -1;
        for (Nodo h : actual.hijos) {
            max = Math.max(max, getAltura(h));
        }
        return 1 + max;
    }

    // Cuenta las Hojas (Grado 0)
    public int contarHojas(Nodo actual) {
        if (actual.hijos.isEmpty()) return 1;
        int suma = 0;
        for (Nodo h : actual.hijos) {
            suma += contarHojas(h);
        }
        return suma;
    }

    // Representación gráfica 
public void imprimir(Nodo nodo, int nivel) {
    if (nodo == null) return;

    // se crea el orden la altura
    for (int i = 0; i < nivel; i++) {
        System.out.print("   "); // 3 espacios por cada nivel
    }

    // Imprimimos el dato con un guion para marcar que es un nodo
    System.out.println("|-- " + nodo.dato);

    // llamamos los hijos y aumneta el nivel
    for (Nodo hijo : nodo.hijos) {
        imprimir(hijo, nivel + 1);
    }
}
}