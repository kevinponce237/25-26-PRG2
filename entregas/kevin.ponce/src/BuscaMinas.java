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

    public static boolean verificarPosicion(int posicionX, int posicionY, int[] listaX, int[] listaY) {
        for (int i = 0; i < minasAGenerar; i++) {
            if (listaX[i] == posicionX && listaY[i] == posicionY) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarEstado() {
        if (jugadorPerdio()) {
            System.out.println("Has perdido. Se activaron " + numMinasActivas + " minas.");
            return false;
        }

        if (jugadorGano()) {
            System.out.println("Has ganado. Liberaste todas las casillas seguras.");
            return false;
        }

        return true;
    }

    public static boolean jugadorPerdio() {
        return numMinasActivas >= minasParaPerder;
    }

    public static boolean jugadorGano() {
        int posicionesSeguras = calcularPosicionesSeguras();
        return numeroDePosicionesRevisadas >= posicionesSeguras;
    }

    public static int calcularPosicionesSeguras() {
        int posicionesTotales = numFilasDelTablero * numColumnasDelTablero;
        return posicionesTotales - minasAGenerar;
    }
}
