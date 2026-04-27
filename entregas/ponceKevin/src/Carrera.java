public class Carrera {
    private boolean carreraEnCurso = false;
    private Pista pista;
    final int tamañoPista = 40;
    final int delayMs = 400;
    public void iniciarCarrera() {
        this.incializarCarrera();
        while (carreraEnCurso) {
          this.avanzarCarrera();
        }
        limpiarConsola();
        pista.mostrarPosiciones();
        pista.mostrarGanadores();
    }

    public void incializarCarrera() {
        this.carreraEnCurso = true;
        Caballo caballo1 = new Caballo("Relámpago");
        Caballo caballo2 = new Caballo("Tornado");
        Caballo caballo3 = new Caballo("Centella");
        pista = new Pista(tamañoPista);
        pista.agregarCaballo(caballo1);
        pista.agregarCaballo(caballo2);
        pista.agregarCaballo(caballo3);

    }
    private void limpiarConsola() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }

    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void avanzarCarrera() {
        carreraEnCurso = !pista.hayGanador();
        limpiarConsola();
        pista.mostrarPosiciones();
        esperar(delayMs);
        pista.avanzarCaballos();
    }

}