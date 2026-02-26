public class Pila {
    private int top;
    private final Rutina[] pilaRutinas;


    public Pila(int tamano) {
        pilaRutinas = new Rutina[tamano];
        top = -1;
    }

    public boolean estaVacio() {
        return top == -1;
    }

    private boolean estaLleno() {
        return top == pilaRutinas.length - 1;
    }

    //Este metodo simula cuando una rutina es llamada, lo que en pilas seria push
    public void llamarRutina(String rutina, String tipoRetorno) {

        if (estaLleno()) {
            System.out.println("Lo sentimos. La pila esta llena!");
            return;
        }
        Rutina nuevaRutina = new Rutina(rutina, tipoRetorno);
        pilaRutinas[top++] = nuevaRutina;

    }

    //Este metodo simula cuando una rutina termina, lo que en pilas seria pop
    public Rutina terminarRutina() {
        if (estaVacio()) {
            System.out.println("Lo sentimos. La pila esta vacia");
            return null;
        }

        return pilaRutinas[top--];

    }

    //Este metodo simula retornar la rutina corriendo en el momento o que esta en el top. En el contexto de pilas seria peek
    public Rutina rutinaActual() {
        if (estaVacio()) {
            System.out.println("Lo sentimos. La pila esta vacia");
            return null;
        }
        return pilaRutinas[top];
    }

    //Este metodo simplemente recorre la pila para imprimir su contenido, en este caso imprimir cada rutina activa
    public void mostrarPila() {
        if (estaVacio()) {
            System.out.println("Lo sentimos. La pila esta vacia");
            return;
        }
        for (int i = 0; i < pilaRutinas.length; i++) {
            System.out.println(pilaRutinas[i]);
            System.out.println();
        }
    }
}
