public class consola {
    public static void main(String[] args) {
        // 1. Instanciamos la Raíz
        Arbol arbol = new Arbol("A");

        // 2. Creamos los Nodos Hijos
        Nodo b = new Nodo("B");
        Nodo c = new Nodo("C");
        Nodo d = new Nodo("D");
        Nodo e = new Nodo("E");
        Nodo f = new Nodo("F");

        //Relaciones según el diagrama
        arbol.raiz.agregarHijo(b); // A es Padre de B
        arbol.raiz.agregarHijo(c); // A es Padre de C
        
        b.agregarHijo(d);          // B es Padre de D
        b.agregarHijo(e);          // B es Padre de E
        
        c.agregarHijo(f);          // C es Padre de F

        // --- SALIDA POR CONSOLA ---
        System.out.println("=== Estructura del Arbol ===");
        arbol.imprimir(arbol.raiz, 0);

        System.out.println("\n=== Informe del Arbol ===");
        System.out.println("Altura de el: " + arbol.getAltura(arbol.raiz));
        System.out.println("Total Hojas o hijos: " + arbol.contarHojas(arbol.raiz));
        
        System.out.println("\nJerarquia del Arbol:");
        System.out.println("- Nodo Raíz: " + arbol.raiz.dato);
        System.out.println("- Ramas: B y C son hermanos (hijos de A).");
        System.out.println("- Hojas: D, E y F (no tienen hijos).");
        System.out.println("- Ancestro: A es ancestro de F.");
    }
}