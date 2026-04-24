public class Pista {

    private int tamaño;
    private Caballo[] caballos = new Caballo[10];
    private int numeroCaballos = 0;
    private String simboloCaballo = "|-|";
    public Pista(int tamaño) {
        this.tamaño = tamaño;
    }

    public void agregarCaballo(Caballo caballo) {
        if (numeroCaballos < caballos.length) {
            caballos[numeroCaballos] = caballo;
            numeroCaballos++;
        }
    }


    public boolean hayGanador() {
        boolean hayGanador = false;
       for (int i = 0; i < numeroCaballos; i++) {
            if (caballos[i].getPosicion() >= tamaño) {
                hayGanador = true;
            }
        }
        return hayGanador;
    }


    public void mostrarPosiciones() {
        for (int i = 0; i < numeroCaballos; i++) {
            mostrarCarrera(i);
        }
        System.out.println();
    }

    private void mostrarCarrera(int indice) {
        String nombre = caballos[indice].getNombre();
        int posicion = caballos[indice].getPosicion();
        String pista = construirPista(posicion);
        System.out.println(nombre + " " + pista);
    }

    private String construirPista(int posicion) {
        if (posicion > tamaño) {
            posicion = tamaño;
        }
        String pista = "|";
        pista = pista + obtenerTramo(posicion);
        if (posicion == tamaño) {
            pista = pista + "C";
        }
        pista = pista + "|";
        return pista;
    }

    private String obtenerTramo(int posicion) {
        String tramo = "";
        for (int j = 0; j < tamaño; j++) {
            if (j == posicion) {
                tramo = tramo + simboloCaballo;
            } else {
                tramo = tramo + "-";
            }
        }
        return tramo;
    }

    public void avanzarCaballos() {
        for (int i = 0; i < numeroCaballos; i++) {
            caballos[i].avanzar();
        }
    }

    public void mostrarGanadores() {
        int[] ganadores = getGanadores();
        if (ganadores.length >1) {
            System.out.println("¡Hay múltiples ganadores es un empate!");
        }
        this.listarGanadores(ganadores);

    }

    private int getCantidadGanadores() {
        int cantidadGanadores = 0;
        for (int i = 0; i < numeroCaballos; i++) {
            if (caballos[i].getPosicion() >= tamaño) {
                cantidadGanadores++;
            }
        }
        return cantidadGanadores;
    }
    private int[] getGanadores() {
        int cantidadGanadores = this.getCantidadGanadores();
        int[] ganadores = new int[cantidadGanadores];
        int index = 0;
        for (int i = 0; i < numeroCaballos; i++) {
            if (caballos[i].getPosicion() >= tamaño) {
                ganadores[index] = i;
                index++;
            }
        }
        return ganadores;
    }

    private void listarGanadores(int[] ganadores) {
        System.out.print("Ganador(es): ");
        for (int i = 0; i < ganadores.length; i++) {
            System.out.print(caballos[ganadores[i]].getNombre() + " ");
        }
        System.out.println();
    }
}