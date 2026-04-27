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

        // 3. Establecemos Relaciones según el diagrama
        arbol.raiz.agregarHijo(b); // A es Padre de B
        arbol.raiz.agregarHijo(c); // A es Padre de C
        
        b.agregarHijo(d);          // B es Padre de D
        b.agregarHijo(e);          // B es Padre de E
        
        c.agregarHijo(f);          // C es Padre de F

        // --- SALIDA POR CONSOLA ---
        System.out.println("=== ESTRUCTURA DEL ÁRBOl ===");
        arbol.imprimir(arbol.raiz, 0);

        System.out.println("\n=== INFORME TÉCNICO ===");
        System.out.println("Métrica - Altura: " + arbol.getAltura(arbol.raiz));
        System.out.println("Métrica - Total Hojas: " + arbol.contarHojas(arbol.raiz));
        
        System.out.println("\nTerminología Aplicada:");
        System.out.println("- Nodo Raíz: " + arbol.raiz.dato);
        System.out.println("- Hermanos: B y C son hermanos (hijos de A).");
        System.out.println("- Hojas: D, E y F (no tienen hijos).");
        System.out.println("- Ancestro: A es ancestro de F.");
    }
}