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
        for (int i = 0; i < numeroCaballos; i++) {
            if (caballos[i].getPosicion() >= tamaño) {
                System.out.println("¡El ganador es: " + caballos[i].getNombre() + "!");
                return;
            }
        }
    }
}