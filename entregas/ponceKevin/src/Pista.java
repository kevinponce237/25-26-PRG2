public class Pista {

    private int tamaño;
    private Caballo[] caballos = new Caballo[10];
    private int numeroCaballos = 0;
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
       for (int i = 0; i < numeroCaballos; i++) {
            return caballos[i].getPosicion() >= tamaño;
        }
        return false;
    }


    public void mostrarPosiciones() {
        for (int i = 0; i < numeroCaballos; i++) {
            int posicion = caballos[i].getPosicion();
            if (posicion < 0) {
                posicion = 0;
            }
            if (posicion > tamaño) {
                posicion = tamaño;
            }

            StringBuilder pistaTexto = new StringBuilder();
            pistaTexto.append("|");

            for (int j = 0; j < tamaño; j++) {
                if (j == posicion) {
                    pistaTexto.append("C");
                } else {
                    pistaTexto.append("-");
                }
            }

            if (posicion == tamaño) {
                pistaTexto.append("C");
            }

            pistaTexto.append("|");
            System.out.println(caballos[i].getNombre() + " " + pistaTexto);
        }
        System.out.println();
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

    private int[] getGanadores() {
        int[] ganadores = new int[numeroCaballos];
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
            if (ganadores[i] != 0) {
                System.out.print(caballos[ganadores[i]].getNombre() + " ");
            }
        }
        System.out.println();
    }
}