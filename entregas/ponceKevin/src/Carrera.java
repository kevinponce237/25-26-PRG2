public class Carrera {
    boolean carreraEnCurso = false;

    public void jugar() {
        carreraEnCurso = true;
        Caballo caballo1 = new Caballo("Relámpago");
        Caballo caballo2 = new Caballo("Tornado");
        Caballo caballo3 = new Caballo("Centella");
        final int tamañoPista = 40;
        final int delayMs = 400;

        System.out.println("Iniciando la carrera...");
       
        Pista pista = new Pista(tamañoPista);
        pista.agregarCaballo(caballo1);
        pista.agregarCaballo(caballo2);
        pista.agregarCaballo(caballo3);
        while (carreraEnCurso) {
           this.carreraEnCurso = !pista.hayGanador();
           limpiarConsola();
           pista.mostrarPosiciones();
           esperar(delayMs);
           pista.avanzarCaballos();
        }
        limpiarConsola();
        pista.mostrarPosiciones();
        pista.mostrarGanadores();
    }

    private void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}