public class Buscaminas {
    static int[] listaMinasX;
    static int[] listaMinasY;

    static int numMinasActivas;
    static boolean continuarJuego = true;

    static final int minasAGenerar = 5;
    static final int minasParaPerder = 3;
    static final int numColumnasDelTablero = 7;
    static final int numFilasDelTablero = 5;
    static int numeroDePosicionesRevisadas = 0;
    static char[][] tablero;


    public static void main(String[] args) {

    }

    public static char[][] generarTablero() {
        return null;
    }

    public static void generarIndicesAleatorios() {
        java.util.Random random = new java.util.Random();

        listaMinasX = new int[minasAGenerar];
        listaMinasY = new int[minasAGenerar];

        int minasGeneradas = 0;

        while (minasGeneradas < minasAGenerar) {
            int x = random.nextInt(numFilasDelTablero);
            int y = random.nextInt(numColumnasDelTablero);

            boolean repetida = false;

            for (int i = 0; i < minasGeneradas; i++) {
                if (listaMinasX[i] == x && listaMinasY[i] == y) {
                    repetida = true;
                    break;
                }
            }

            if (!repetida) {
                listaMinasX[minasGeneradas] = x;
                listaMinasY[minasGeneradas] = y;
                minasGeneradas++;
            }
    }
}


    public static void mostrarTableroYMenu() {

    }

    public static boolean verificar(int posicionX, int posicionY) {
        return false;
    }

    public static boolean verificarEstado() {
        return false;
    }

    public static boolean estaEnLista(int valor, int[] lista) {
        return false;
    }

    public static int calcularPosicionesSeguras() {
        return 0;
    }

}
