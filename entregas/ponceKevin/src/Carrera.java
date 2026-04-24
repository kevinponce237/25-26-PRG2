public class Carrera {
    boolean carreraEnCurso = false;
    public void jugar() {
        carreraEnCurso = true;
        Caballo caballo1 = new Caballo("Relámpago");
        Caballo caballo2 = new Caballo("Tornado");
        Caballo caballo3 = new Caballo("Centella");
        final int tamañoPista = 40;
        System.out.println("Iniciando la carrera...");
       
        Pista pista = new Pista(tamañoPista);
        pista.agregarCaballo(caballo1);
        pista.agregarCaballo(caballo2);
        pista.agregarCaballo(caballo3);
        while (carreraEnCurso) {
           this.carreraEnCurso = !pista.hayGanador();
           pista.mostrarPosiciones();
           pista.avanzarCaballos();
        }
        pista.mostrarGanadores();
    }
}