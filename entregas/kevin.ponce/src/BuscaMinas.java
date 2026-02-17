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
    tablero = new char[numFilasDelTablero][numColumnasDelTablero];

    for (int i = 0; i < numFilasDelTablero; i++) {
        for (int j = 0; j < numColumnasDelTablero; j++) {
            tablero[i][j] = ' ';
        }
    }

    return tablero;
}


    public static void generarIndicesAleatorios() {
        java.util.Random random = new java.util.Random();

        listaMinasX = new int[minasAGenerar];
        listaMinasY = new int[minasAGenerar];

        int minasGeneradas = 0;

        while (minasGeneradas < minasAGenerar) {
            int x = random.nextInt(numFilasDelTablero);
            int y = random.nextInt(numColumnasDelTablero);

            boolean repetida = verificarIndiceDuplicado(listaMinasX, listaMinasY, minasGeneradas, x, y);

            if (!repetida) {
                listaMinasX[minasGeneradas] = x;
                listaMinasY[minasGeneradas] = y;
                minasGeneradas++;
            }
        }
    }

    public static boolean verificarIndiceDuplicado(int[] listaX, int[] listaY, int limite, int x, int y) {
        for (int i = 0; i < limite; i++) {
            if (listaX[i] == x && listaY[i] == y) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarTablero() {
        System.out.print("   ");
        for (int j = 0; j < numColumnasDelTablero; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < numFilasDelTablero; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < numColumnasDelTablero; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
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
