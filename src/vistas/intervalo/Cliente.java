package vistas.intervalo;

public class Cliente {
    public static void main(String[] args) {
        Console console = new Console();

        Intervalo intervalo = new Intervalo(5,10);
        intervalo.mostrar();
        
        console.writeln("Longitud del intervalo = " + intervalo.longitud());

        Intervalo otroIntervalo = new Intervalo(intervalo);
        otroIntervalo.desplazar(3);
        otroIntervalo.mostrar();

        console.writeln("Longitud del otroIntervalo = " + otroIntervalo.longitud());

        console.write("Intervalo intersecta otroIntervalo: ");
        console.writeln(intervalo.intersecta(otroIntervalo));

    }
}
