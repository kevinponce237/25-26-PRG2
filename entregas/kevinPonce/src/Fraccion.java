public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this(0, 1);
    }

    public Fraccion(int numerador, int denominador) {
        assert denominador != 0;
        this.numerador = numerador;
        this.denominador = denominador;
        normalizarSigno();
        simplificar();
    }

    public Fraccion(int numerador) {
    this(numerador, 1);
    }


    public Fraccion(Fraccion otra) {
        assert otra != null;
        this(otra.numerador, otra.denominador);
    }


    public String toString() {
        return numerador + "/" + denominador;
    }


    public double toDecimal() {
        return (double) numerador / denominador;
    }


    public int calcularMCD(int a, int b) {
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public Fraccion clonar() {
        return new Fraccion(this);
    }

    public boolean esIgual(Fraccion fraccion) {
        assert fraccion != null : "La fracción no puede ser nula";
        return this.numerador * fraccion.denominador == this.denominador * fraccion.numerador;
    }


    public Fraccion sumar(Fraccion fraccion);

    public Fraccion restar(Fraccion fraccion);

    public Fraccion multiplicar(Fraccion fraccion);

    public Fraccion dividir(Fraccion fraccion);


    public double inversa();

    public Fraccion opuesta();

    public boolean esPropia();

}